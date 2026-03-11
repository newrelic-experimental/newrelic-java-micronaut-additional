package io.micronaut.data.intercept;

import com.newrelic.api.agent.NewRelic;
import com.newrelic.api.agent.Trace;
import com.newrelic.api.agent.weaver.MatchType;
import com.newrelic.api.agent.weaver.Weave;
import com.newrelic.api.agent.weaver.Weaver;
import io.micronaut.aop.MethodInvocationContext;

@Weave(originalName = "io.micronaut.data.intercept.DataInterceptor", type = MatchType.Interface)
public class DataInterceptor_Instrumentation<T,R> {

    @Trace(dispatcher = true)
    public R intercept(RepositoryMethodKey methodKey, MethodInvocationContext<T, R> context) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","Micronaut","DataInterceptor",getClass().getSimpleName(),"intercept");
        return Weaver.callOriginal();
    }
}
