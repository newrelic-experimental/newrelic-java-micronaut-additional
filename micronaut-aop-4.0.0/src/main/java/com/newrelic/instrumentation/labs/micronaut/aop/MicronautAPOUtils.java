package com.newrelic.instrumentation.labs.micronaut.aop;

import io.micronaut.aop.InterceptorKind;
import io.micronaut.inject.ExecutableMethod;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Map;

public class MicronautAPOUtils {

    public static void addAttribute(Map<String, Object> attributes, String key, Object value) {
        if(value != null && key != null && !key.isEmpty() && attributes != null) {
            attributes.put(key, value);
        }
    }

    public static void addInterceptorKind(Map<String, Object> attributes, InterceptorKind interceptorKind) {
        if(interceptorKind != null) {
            addAttribute(attributes,"InterceptorKind-Name", interceptorKind.getAnnotationName());
            Class<? extends Annotation> type = interceptorKind.getAnnotationType();
            if(type != null) {
                addAttribute(attributes,"InterceptorKind-Type", type.getName());
            }
        }
    }

    public static void addMethod(Map<String, Object> attributes, Method method) {
        if(method != null) {
            addAttribute(attributes,"Method-Name", method.getName());
            addAttribute(attributes,"Method-Class", method.getDeclaringClass().getName());
        }
    }

}
