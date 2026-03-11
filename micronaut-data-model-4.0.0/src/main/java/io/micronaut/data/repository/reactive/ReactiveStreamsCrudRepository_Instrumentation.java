package io.micronaut.data.repository.reactive;

import com.newrelic.api.agent.NewRelic;
import com.newrelic.api.agent.Trace;
import com.newrelic.api.agent.weaver.MatchType;
import com.newrelic.api.agent.weaver.Weave;
import com.newrelic.api.agent.weaver.Weaver;
import io.micronaut.core.annotation.NonNull;
import io.micronaut.core.async.annotation.SingleResult;
import org.reactivestreams.Publisher;

@Weave(originalName = "io.micronaut.data.repository.reactive.ReactiveStreamsCrudRepository", type = MatchType.Interface)
public class ReactiveStreamsCrudRepository_Instrumentation<E, ID> {

    @Trace
    public <S extends E> Publisher<S> save(S entity) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","Micronaut","ReactiveStreamsCrudRepository",getClass().getSimpleName(),"save");
        return Weaver.callOriginal();
    }

    @Trace
    public <S extends E> Publisher<S> saveAll(Iterable<S> entities) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","Micronaut","ReactiveStreamsCrudRepository",getClass().getSimpleName(),"saveAll");
        return Weaver.callOriginal();
    }

    @Trace
    public <S extends E> Publisher<S> update(S entity) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","Micronaut","ReactiveStreamsCrudRepository",getClass().getSimpleName(),"update");
        return Weaver.callOriginal();
    }

    @Trace
    public <S extends E> Publisher<S> updateAll(Iterable<S> entities) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","Micronaut","ReactiveStreamsCrudRepository",getClass().getSimpleName(),"updateAll");
        return Weaver.callOriginal();
    }

    @Trace
    public Publisher<E> findById(ID id) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","Micronaut","ReactiveStreamsCrudRepository",getClass().getSimpleName(),"findById");
        return Weaver.callOriginal();
    }

    @Trace
    public Publisher<Boolean> existsById(ID id) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","Micronaut","ReactiveStreamsCrudRepository",getClass().getSimpleName(),"existsById");
        return Weaver.callOriginal();
    }

    @Trace
    public Publisher<E> findAll() {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","Micronaut","ReactiveStreamsCrudRepository",getClass().getSimpleName(),"findAll");
        return Weaver.callOriginal();
    }

    @Trace
    public  Publisher<Long> count() {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","Micronaut","ReactiveStreamsCrudRepository",getClass().getSimpleName(),"count");
        return Weaver.callOriginal();
    }

    @Trace
    public Publisher<Long> deleteById(ID id) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","Micronaut","ReactiveStreamsCrudRepository",getClass().getSimpleName(),"deleteById");
        return Weaver.callOriginal();
    }

    @Trace
    public Publisher<Long> delete(E entity) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","Micronaut","ReactiveStreamsCrudRepository",getClass().getSimpleName(),"delete");
        return Weaver.callOriginal();
    }

    @Trace
    public Publisher<Long> deleteAll(Iterable<? extends E> entities) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","Micronaut","ReactiveStreamsCrudRepository",getClass().getSimpleName(),"deleteAll");
        return Weaver.callOriginal();
    }

    @Trace
    public Publisher<Long> deleteAll() {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","Micronaut","ReactiveStreamsCrudRepository",getClass().getSimpleName(),"deleteAll");
        return Weaver.callOriginal();
    }

}

