package io.micronaut.aop.chain;

import com.newrelic.api.agent.NewRelic;
import com.newrelic.api.agent.Trace;
import com.newrelic.api.agent.weaver.Weave;
import com.newrelic.api.agent.weaver.Weaver;
import com.newrelic.instrumentation.labs.micronaut.aop.MicronautAPOUtils;
import io.micronaut.core.type.ReturnType;
import io.micronaut.inject.ExecutableMethod;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@Weave(originalName = "io.micronaut.aop.chain.MethodInterceptorChain")
public abstract class MethodInterceptorChain_Instrumentation<T,R> {

    public abstract String getMethodName();
    public abstract ReturnType<R> getReturnType();
    public abstract ExecutableMethod<T, R> getExecutableMethod();
    public abstract Method getTargetMethod();

    @Trace(dispatcher = true)
    public R proceed() {
        Map<String, Object> attributes = new HashMap<>();
        MicronautAPOUtils.addAttribute(attributes ,"Method-Name", getMethodName());
        MicronautAPOUtils.addMethod(attributes, getTargetMethod());
        NewRelic.getAgent().getTracedMethod().addCustomAttributes(attributes);
        return Weaver.callOriginal();
    }
}
