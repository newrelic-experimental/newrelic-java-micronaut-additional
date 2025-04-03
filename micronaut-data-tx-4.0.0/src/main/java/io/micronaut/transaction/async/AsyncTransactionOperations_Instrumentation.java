package io.micronaut.transaction.async;

import java.util.concurrent.CompletionStage;
import java.util.function.Function;

import com.newrelic.api.agent.NewRelic;
import com.newrelic.api.agent.Token;
import com.newrelic.api.agent.Trace;
import com.newrelic.api.agent.TracedMethod;
import com.newrelic.api.agent.weaver.MatchType;
import com.newrelic.api.agent.weaver.Weave;
import com.newrelic.api.agent.weaver.Weaver;
import com.newrelic.instrumentation.labs.micronaut.data.NRAsyncFunctionWrapper;

import io.micronaut.transaction.TransactionDefinition;

@Weave(originalName = "io.micronaut.transaction.async.AsyncTransactionOperations", type = MatchType.Interface)
public abstract class AsyncTransactionOperations_Instrumentation<C> {

	@Trace
	public <T> CompletionStage<T> withTransaction( TransactionDefinition definition, Function<AsyncTransactionStatus<C>, CompletionStage<T>> handler) {
		TracedMethod traced = NewRelic.getAgent().getTracedMethod();
		traced.setMetricName("Custom","Micronaut","AsyncTransactionOperations",getClass().getSimpleName(),"withTransaction");
		traced.addCustomAttribute("TransactionalDefinition-Name", definition.getName());
		traced.addCustomAttribute("Handler", handler.getClass().getName());
		if(!(handler instanceof NRAsyncFunctionWrapper)) {
			Token token = NewRelic.getAgent().getTransaction().getToken();
			NRAsyncFunctionWrapper<C, T> wrapper = new NRAsyncFunctionWrapper<C, T>(handler, token);
			handler = wrapper;
		}
		
		return Weaver.callOriginal();
	}

	@Trace
	public <T> CompletionStage<T> withTransaction(Function<AsyncTransactionStatus<C>, CompletionStage<T>> handler) {
		TracedMethod traced = NewRelic.getAgent().getTracedMethod();
		traced.setMetricName("Custom","Micronaut","AsyncTransactionOperations",getClass().getSimpleName(),"withTransaction");
		traced.addCustomAttribute("Handler", handler.getClass().getName());
		if(!(handler instanceof NRAsyncFunctionWrapper)) {
			Token token = NewRelic.getAgent().getTransaction().getToken();
			NRAsyncFunctionWrapper<C, T> wrapper = new NRAsyncFunctionWrapper<C, T>(handler, token);
			handler = wrapper;
		}
		
		return Weaver.callOriginal();
	}

}
