package com.newrelic.instrumentation.labs.micronaut.data;

import java.util.function.Function;

import com.newrelic.agent.bridge.AgentBridge;
import com.newrelic.api.agent.Token;
import com.newrelic.api.agent.Trace;

import io.micronaut.transaction.reactive.ReactiveTransactionStatus;
import reactor.core.publisher.Mono;


public class NRReactorFunctionWrapper<C,T> implements Function<ReactiveTransactionStatus<C>, Mono<T>> {

	
	private Function<ReactiveTransactionStatus<C>, Mono<T>> delegate = null;
	private Token token = null;
	private static boolean isTransformed = false;
	
	public NRReactorFunctionWrapper(Function<ReactiveTransactionStatus<C>, Mono<T>> handler, Token t) {
		delegate = handler;
		token = t;
		if(!isTransformed) {
			AgentBridge.instrumentation.retransformUninstrumentedClass(getClass());
			isTransformed = true;
		}
	}
	
	@Override
	@Trace(async = true)
	public Mono<T> apply(ReactiveTransactionStatus<C> t) {
		if(token != null) {
			token.linkAndExpire();
			token = null;
		}
		
		return delegate.apply(t);
	}

}
