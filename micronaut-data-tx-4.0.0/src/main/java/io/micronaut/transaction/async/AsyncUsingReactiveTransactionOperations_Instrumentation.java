package io.micronaut.transaction.async;

import com.newrelic.api.agent.NewRelic;
import com.newrelic.api.agent.Token;
import com.newrelic.api.agent.Trace;
import com.newrelic.api.agent.TracedMethod;
import com.newrelic.api.agent.weaver.Weave;
import com.newrelic.api.agent.weaver.Weaver;
import com.newrelic.instrumentation.labs.micronaut.data.NRAsyncFunctionWrapper;
import io.micronaut.aop.MethodInvocationContext;
import io.micronaut.transaction.TransactionDefinition;
import org.reactivestreams.Publisher;
import reactor.core.publisher.Mono;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.function.Function;

@Weave(originalName = "io.micronaut.transaction.async.AsyncUsingReactiveTransactionOperations")
public class AsyncUsingReactiveTransactionOperations_Instrumentation<C> {

    @Trace
    public <T> CompletionStage<T> withTransaction(TransactionDefinition definition, Function<AsyncTransactionStatus<C>, CompletionStage<T>> handler) {
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

}
