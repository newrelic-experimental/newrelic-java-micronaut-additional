package io.micronaut.data.repository.reactive;

import com.newrelic.api.agent.NewRelic;
import com.newrelic.api.agent.Trace;
import com.newrelic.api.agent.weaver.MatchType;
import com.newrelic.api.agent.weaver.Weave;
import com.newrelic.api.agent.weaver.Weaver;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Weave(originalName = "io.micronaut.data.repository.reactive.ReactorCrudRepository", type = MatchType.Interface)
public class ReactorCrudRepository_Instrumentation<E,ID> {

    @Trace
    public <S extends E> Mono<S> save(S entity) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","Micronaut","ReactorCrudRepository",getClass().getSimpleName(),"save");
        return Weaver.callOriginal();
    }

    @Trace
    public <S extends E> Flux<S> saveAll(Iterable<S> entities) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","Micronaut","ReactorCrudRepository",getClass().getSimpleName(),"saveAll");
        return Weaver.callOriginal();
    }

    @Trace
    public <S extends E> Mono<S> update(S entity) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","Micronaut","ReactorCrudRepository",getClass().getSimpleName(),"update");
        return Weaver.callOriginal();
    }

    @Trace
    public <S extends E> Flux<S> updateAll(Iterable<S> entities) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","Micronaut","ReactorCrudRepository",getClass().getSimpleName(),"updateAll");
        return Weaver.callOriginal();
    }

    @Trace
    public Mono<E> findById(ID id) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","Micronaut","ReactorCrudRepository",getClass().getSimpleName(),"findById");
        return Weaver.callOriginal();
    }

    @Trace
    public Mono<Boolean> existsById(ID id) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","Micronaut","ReactorCrudRepository",getClass().getSimpleName(),"existsById");
        return Weaver.callOriginal();
    }

    @Trace
    public Flux<E> findAll() {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","Micronaut","ReactorCrudRepository",getClass().getSimpleName(),"findAll");
        return Weaver.callOriginal();
    }

    @Trace
    public Mono<Long> count() {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","Micronaut","ReactorCrudRepository",getClass().getSimpleName(),"count");
        return Weaver.callOriginal();
    }

    @Trace
    public Mono<Long> deleteById(ID id) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","Micronaut","ReactorCrudRepository",getClass().getSimpleName(),"deleteById");
        return Weaver.callOriginal();
    }

    @Trace
    public Mono<Long> delete(E entity) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","Micronaut","ReactorCrudRepository",getClass().getSimpleName(),"delete");
        return Weaver.callOriginal();
    }

    @Trace
    public Mono<Long> deleteAll(Iterable<? extends E> entities) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","Micronaut","ReactorCrudRepository",getClass().getSimpleName(),"deleteAll");
        return Weaver.callOriginal();
    }

    @Trace
    public Mono<Long> deleteAll() {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","Micronaut","ReactorCrudRepository",getClass().getSimpleName(),"deleteAll");
        return Weaver.callOriginal();
    }

}
