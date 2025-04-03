package io.micronaut.aop.internal.intercepted;

import java.util.concurrent.CompletableFuture;

import com.newrelic.api.agent.Trace;
import com.newrelic.api.agent.weaver.Weave;
import com.newrelic.api.agent.weaver.Weaver;

import io.micronaut.aop.Interceptor;

@Weave(originalName = "io.micronaut.aop.internal.intercepted.KotlinInterceptedMethod")
abstract class KotlinInterceptedMethod_Intrumentation {

	@Trace
	public CompletableFuture<Object> interceptResultAsCompletionStage(Interceptor<?, ?> from) {
		return Weaver.callOriginal();
	}
	
	@Trace
	public CompletableFuture<Object> interceptResultAsCompletionStage() {
		return Weaver.callOriginal();
	}
}
