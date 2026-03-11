package io.micronaut.data.repository.reactive;

import com.newrelic.api.agent.NewRelic;
import com.newrelic.api.agent.Trace;
import com.newrelic.api.agent.weaver.MatchType;
import com.newrelic.api.agent.weaver.Weave;
import com.newrelic.api.agent.weaver.Weaver;
import io.micronaut.core.annotation.NonNull;
import io.micronaut.data.model.Page;
import io.micronaut.data.model.Pageable;
import io.micronaut.data.model.Sort;
import org.reactivestreams.Publisher;

@Weave(originalName = "io.micronaut.data.repository.reactive.ReactiveStreamsPageableRepository", type = MatchType.Interface)
public class ReactiveStreamsPageableRepository_Instrumentation<E,ID> {

    @Trace
    public Publisher<E> findAll(Sort sort) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","Micronaut","ReactiveStreamsPageableRepository",getClass().getSimpleName(),"findAll");
        return Weaver.callOriginal();
    }

    @Trace
    public Publisher<Page<E>> findAll(Pageable pageable) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","Micronaut","ReactiveStreamsPageableRepository",getClass().getSimpleName(),"findAll");
        return Weaver.callOriginal();
    }
}
