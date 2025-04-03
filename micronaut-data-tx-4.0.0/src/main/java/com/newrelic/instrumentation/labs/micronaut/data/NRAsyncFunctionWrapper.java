package com.newrelic.instrumentation.labs.micronaut.data;

import java.util.concurrent.CompletionStage;
import java.util.function.Function;

import com.newrelic.agent.bridge.AgentBridge;
import com.newrelic.api.agent.Token;
import com.newrelic.api.agent.Trace;

import io.micronaut.transaction.async.AsyncTransactionStatus;


public class NRAsyncFunctionWrapper<C,T> implements Function<AsyncTransactionStatus<C>, CompletionStage<T>> {

	
	private Function<AsyncTransactionStatus<C>, CompletionStage<T>> delegate = null;
	private Token token = null;
	private static boolean isTransformed = false;
	
	public NRAsyncFunctionWrapper(Function<AsyncTransactionStatus<C>, CompletionStage<T>> handler, Token t) {
		delegate = handler;
		token = t;
		if(!isTransformed) {
			AgentBridge.instrumentation.retransformUninstrumentedClass(getClass());
			isTransformed = true;
		}
	}
	
	@Override
	@Trace(async = true)
	public CompletionStage<T> apply(AsyncTransactionStatus<C> t) {
		if(token != null) {
			token.linkAndExpire();
			token = null;
		}
		
		return delegate.apply(t);
	}

}
