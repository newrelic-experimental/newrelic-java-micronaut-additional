package io.micronaut.data.operations.reactive;

import com.newrelic.api.agent.NewRelic;
import com.newrelic.api.agent.Trace;
import com.newrelic.api.agent.weaver.MatchType;
import com.newrelic.api.agent.weaver.Weave;
import com.newrelic.api.agent.weaver.Weaver;
import reactor.core.publisher.Mono;

import java.util.Optional;
import java.util.function.Function;

@Weave(originalName = "io.micronaut.data.operations.reactive.BlockingExecutorReactorRepositoryOperations", type = MatchType.Interface)
public class BlockingExecutorReactorRepositoryOperations_Instrumentation {

    @Trace
    public <T> T block(Function<ReactorReactiveRepositoryOperations, Mono<T>> supplier) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","Micronaut","BlockingExecutorReactorRepositoryOperations",getClass().getSimpleName(),"block");
        return Weaver.callOriginal();
    }

    @Trace
    public <T> Optional<T> blockOptional(Function<ReactorReactiveRepositoryOperations, Mono<T>> supplier) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","Micronaut","BlockingExecutorReactorRepositoryOperations",getClass().getSimpleName(),"blockOptional");
        return Weaver.callOriginal();
    }

}
