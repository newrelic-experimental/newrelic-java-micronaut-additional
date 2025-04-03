package io.micronaut.aop.internal.intercepted;

import java.util.concurrent.CompletionStage;

import com.newrelic.api.agent.Trace;
import com.newrelic.api.agent.weaver.Weave;
import com.newrelic.api.agent.weaver.Weaver;

import io.micronaut.aop.Interceptor;

@Weave(originalName = "io.micronaut.aop.internal.intercepted.CompletionStageInterceptedMethod")
abstract class CompletionStageInterceptedMethod_Instrumentation {

	@Trace
	public CompletionStage<Object> interceptResultAsCompletionStage() {
		return Weaver.callOriginal();
	}
	
	@Trace
	 public CompletionStage<Object> interceptResultAsCompletionStage(Interceptor<?, ?> from) {
			return Weaver.callOriginal();
	 }
}
