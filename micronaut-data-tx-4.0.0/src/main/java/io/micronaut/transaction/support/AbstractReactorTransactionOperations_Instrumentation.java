package io.micronaut.transaction.support;

import java.util.function.Function;

import com.newrelic.api.agent.NewRelic;
import com.newrelic.api.agent.Token;
import com.newrelic.api.agent.Trace;
import com.newrelic.api.agent.TracedMethod;
import com.newrelic.api.agent.weaver.MatchType;
import com.newrelic.api.agent.weaver.Weave;
import com.newrelic.api.agent.weaver.Weaver;
import com.newrelic.instrumentation.labs.micronaut.data.NRErrorConsumer;
import com.newrelic.instrumentation.labs.micronaut.data.NRReactorResultRunnable;
import com.newrelic.instrumentation.labs.micronaut.data.NRReactorRunnable;
import com.newrelic.instrumentation.labs.micronaut.data.NRResultConsumer;
import com.newrelic.instrumentation.labs.micronaut.data.NRTransactionHolder;

import io.micronaut.transaction.TransactionDefinition;
import io.micronaut.transaction.reactive.ReactiveTransactionOperations.TransactionalCallback;
import io.micronaut.transaction.reactive.ReactiveTransactionStatus;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Weave(originalName = "io.micronaut.transaction.support.AbstractReactorTransactionOperations", type = MatchType.BaseClass)
public abstract class AbstractReactorTransactionOperations_Instrumentation<C> {

	@Trace
	protected  <T> Flux<T> withTransactionFlux(ReactiveTransactionStatus<C> transactionStatus, TransactionDefinition definition, TransactionalCallback<C, T> handler) {
		TracedMethod traced = NewRelic.getAgent().getTracedMethod();
		traced.setMetricName("Custom","Micronaut","ReactorReactiveTransactionOperations",getClass().getSimpleName(),"withTransactionFlux");
		traced.addCustomAttribute("TransactionalDefinition-Name", definition.getName());
		Token token = NewRelic.getAgent().getTransaction().getToken();
		NRTransactionHolder holder = new NRTransactionHolder(token,"TransactionMono");
		Flux<T> result = Weaver.callOriginal();
		NRReactorRunnable runnable = new NRReactorRunnable(holder);
		NRErrorConsumer errorConsumer = new NRErrorConsumer(holder);
		NRReactorResultRunnable resultRunnable = new NRReactorResultRunnable(holder);
		
		return result.doOnCancel(runnable).doOnTerminate(runnable).doOnError(errorConsumer).doOnComplete(resultRunnable);
	}
	
	@Trace
	public <T> Mono<T> withTransactionMono(TransactionDefinition definition, Function<ReactiveTransactionStatus<C>, Mono<T>> handler) {
		TracedMethod traced = NewRelic.getAgent().getTracedMethod();
		traced.setMetricName("Custom","Micronaut","ReactorReactiveTransactionOperations",getClass().getSimpleName(),"withTransactionMono");
		traced.addCustomAttribute("TransactionalDefinition-Name", definition.getName());
		Token token = NewRelic.getAgent().getTransaction().getToken();
		NRTransactionHolder holder = new NRTransactionHolder(token,"TransactionMono");
		
		Mono<T> result = Weaver.callOriginal();
		
		NRReactorRunnable runnable = new NRReactorRunnable(holder);
		NRErrorConsumer errorConsumer = new NRErrorConsumer(holder);
		NRResultConsumer<T> resultConsumer = new NRResultConsumer<>(holder);
		
		return result.doOnCancel(runnable).doOnTerminate(runnable).doOnSuccess(resultConsumer).doOnError(errorConsumer);
	}
}
