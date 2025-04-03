package io.micronaut.transaction.reactive;

import org.reactivestreams.Publisher;

import com.newrelic.api.agent.NewRelic;
import com.newrelic.api.agent.Trace;
import com.newrelic.api.agent.TracedMethod;
import com.newrelic.api.agent.weaver.MatchType;
import com.newrelic.api.agent.weaver.Weave;
import com.newrelic.api.agent.weaver.Weaver;

import io.micronaut.transaction.TransactionDefinition;
import io.micronaut.transaction.reactive.ReactiveTransactionOperations.TransactionalCallback;

@Weave(originalName = "io.micronaut.transaction.reactive.ReactiveTransactionOperations",type = MatchType.Interface)
public abstract class ReactiveTransactionOperations_Instrumentation<C> {

	@Trace
	public <T> Publisher<T> withTransaction(TransactionDefinition definition, TransactionalCallback<C, T> handler) {
		TracedMethod traced = NewRelic.getAgent().getTracedMethod();
		traced.setMetricName("Custom","Micronaut","ReactiveTransactionOperations",getClass().getSimpleName(),"withTransaction");
		traced.addCustomAttribute("TransactionalDefinition-Name", definition.getName());
		traced.addCustomAttribute("Handler", handler.getClass().getName());
		
		return Weaver.callOriginal();
	}
	
	@Trace
	public <T> Publisher<T> withTransaction(TransactionalCallback<C, T> handler) {
		TracedMethod traced = NewRelic.getAgent().getTracedMethod();
		traced.setMetricName("Custom","Micronaut","ReactiveTransactionOperations",getClass().getSimpleName(),"withTransaction");
		traced.addCustomAttribute("Handler", handler.getClass().getName());
		
		return Weaver.callOriginal();
	}
}
