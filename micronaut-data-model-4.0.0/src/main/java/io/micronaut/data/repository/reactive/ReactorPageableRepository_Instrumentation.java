package io.micronaut.data.repository.reactive;

import com.newrelic.api.agent.NewRelic;
import com.newrelic.api.agent.Trace;
import com.newrelic.api.agent.weaver.MatchType;
import com.newrelic.api.agent.weaver.Weave;
import com.newrelic.api.agent.weaver.Weaver;
import io.micronaut.data.model.Page;
import io.micronaut.data.model.Pageable;
import io.micronaut.data.model.Sort;
import org.reactivestreams.Publisher;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Weave(originalName = "io.micronaut.data.repository.reactive.ReactorPageableRepository", type = MatchType.Interface)
public class ReactorPageableRepository_Instrumentation<E,ID> {

    @Trace
    public Flux<E> findAll(Sort sort) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","Micronaut","ReactorPageableRepository",getClass().getSimpleName(),"findAll");
        return Weaver.callOriginal();
    }

    @Trace
    public Mono<Page<E>> findAll(Pageable pageable) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","Micronaut","ReactorPageableRepository",getClass().getSimpleName(),"findAll");
        return Weaver.callOriginal();
    }
}
