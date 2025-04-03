package io.micronaut.aop.internal.intercepted;

import org.reactivestreams.Publisher;

import com.newrelic.api.agent.Trace;
import com.newrelic.api.agent.weaver.Weave;
import com.newrelic.api.agent.weaver.Weaver;

import io.micronaut.aop.Interceptor;

@Weave(originalName = "io.micronaut.aop.internal.intercepted.PublisherInterceptedMethod")
abstract class PublisherInterceptedMethod_Instrumentation {

	@Trace
    public Publisher<?> interceptResultAsPublisher() {
        return Weaver.callOriginal();
    }

	@Trace
    public Publisher<?> interceptResultAsPublisher(Interceptor<?, ?> from) {
        return Weaver.callOriginal();
    }

}
