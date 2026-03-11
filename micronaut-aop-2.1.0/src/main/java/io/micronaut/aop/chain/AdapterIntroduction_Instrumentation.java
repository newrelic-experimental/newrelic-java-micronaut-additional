package io.micronaut.aop.chain;

import com.newrelic.api.agent.Trace;
import com.newrelic.api.agent.weaver.MatchType;
import com.newrelic.api.agent.weaver.Weave;
import com.newrelic.api.agent.weaver.Weaver;
import io.micronaut.aop.MethodInvocationContext;

import java.util.HashMap;

@Weave(originalName = "io.micronaut.aop.chain.AdapterIntroduction", type = MatchType.BaseClass)
class AdapterIntroduction_Instrumentation {

    @Trace
    public Object intercept(MethodInvocationContext<Object, Object> context) {
        HashMap<String, Object> attributes = new HashMap<>();
        attributes.put("MethodName",context.getMethodName());
        attributes.put("TargetMethod",context.getTargetMethod().getName());
        attributes.put("TargetClass",context.getTargetMethod().getDeclaringClass().toString());
        attributes.put("Name",context.getName());
        return Weaver.callOriginal();
    }
}
