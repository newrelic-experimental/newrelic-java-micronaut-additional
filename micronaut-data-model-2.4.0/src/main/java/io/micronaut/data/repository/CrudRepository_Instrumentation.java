package io.micronaut.data.repository;

import com.newrelic.api.agent.NewRelic;
import com.newrelic.api.agent.Trace;
import com.newrelic.api.agent.weaver.MatchType;
import com.newrelic.api.agent.weaver.Weave;
import com.newrelic.api.agent.weaver.Weaver;

import java.util.Optional;

@Weave(originalName = "io.micronaut.data.repository.CrudRepository", type = MatchType.Interface)
public class CrudRepository_Instrumentation<E, ID> {

    @Trace
    public <S extends E> S save(S entity) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","CrudRepository",getClass().getSimpleName(),"save");
        return Weaver.callOriginal();
    }

    @Trace
    public <S extends E> S update(S entity) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","CrudRepository",getClass().getSimpleName(),"update");
        return Weaver.callOriginal();
    }

    @Trace
    public <S extends E> Iterable<S> updateAll(Iterable<S> entities) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","CrudRepository",getClass().getSimpleName(),"updateAll");
        return Weaver.callOriginal();
    }

    @Trace
    public <S extends E> Iterable<S> saveAll(Iterable<S> entities) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","CrudRepository",getClass().getSimpleName(),"saveAll");
        return Weaver.callOriginal();
    }

    @Trace
    public Optional<E> findById(ID id) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","CrudRepository",getClass().getSimpleName(),"findById");
        return Weaver.callOriginal();
    }

    @Trace
    public boolean existsById(ID id) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","CrudRepository",getClass().getSimpleName(),"existsById");
        return Weaver.callOriginal();
    }

    @Trace
    public Iterable<E> findAll() {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","CrudRepository",getClass().getSimpleName(),"findAll");
        return Weaver.callOriginal();
    }

    @Trace
    public long count() {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","CrudRepository",getClass().getSimpleName(),"count");
        return Weaver.callOriginal();
    }

    @Trace
    public void deleteById(ID id) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","CrudRepository",getClass().getSimpleName(),"deleteById");
        Weaver.callOriginal();
    }

    @Trace
    public void delete(E entity) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","CrudRepository",getClass().getSimpleName(),"delete");
        Weaver.callOriginal();
    }

    @Trace
    public void deleteAll(Iterable<? extends E> entities) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","CrudRepository",getClass().getSimpleName(),"deleteAll");
        Weaver.callOriginal();
    }

    @Trace
    public void deleteAll() {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","CrudRepository",getClass().getSimpleName(),"deleteAll");
        Weaver.callOriginal();
    }

}
