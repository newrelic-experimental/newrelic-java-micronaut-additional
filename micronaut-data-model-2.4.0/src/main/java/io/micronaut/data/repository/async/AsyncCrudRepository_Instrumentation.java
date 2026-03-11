package io.micronaut.data.repository.async;

import com.newrelic.api.agent.NewRelic;
import com.newrelic.api.agent.Trace;
import com.newrelic.api.agent.weaver.MatchType;
import com.newrelic.api.agent.weaver.Weave;
import com.newrelic.api.agent.weaver.Weaver;

import java.util.concurrent.CompletableFuture;

@Weave(originalName = "io.micronaut.data.repository.async.AsyncCrudRepository", type = MatchType.Interface)
public class AsyncCrudRepository_Instrumentation<E, ID>  {

    @Trace
    public <S extends E> CompletableFuture<S> save(S entity) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","MicronautData","AsyncCrudRepository",getClass().getSimpleName(),"save");
        return Weaver.callOriginal();
    }

    @Trace
    public <S extends E> CompletableFuture<S> update(S entity) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","MicronautData","AsyncCrudRepository",getClass().getSimpleName(),"update");
        return Weaver.callOriginal();
    }

    @Trace
    public <S extends E> CompletableFuture<? extends Iterable<S>> updateAll(Iterable<S> entities) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","MicronautData","AsyncCrudRepository",getClass().getSimpleName(),"updateAll");
        return Weaver.callOriginal();
    }

    @Trace
    public <S extends E> CompletableFuture<? extends Iterable<S>> saveAll(Iterable<S> entities) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","MicronautData","AsyncCrudRepository",getClass().getSimpleName(),"saveAll");
        return Weaver.callOriginal();
    }

    @Trace
    public CompletableFuture<E> findById(ID id) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","MicronautData","AsyncCrudRepository",getClass().getSimpleName(),"findById");
        return Weaver.callOriginal();
    }

    @Trace
    public CompletableFuture<Boolean> existsById(ID id) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","MicronautData","AsyncCrudRepository",getClass().getSimpleName(),"existsById");
        return Weaver.callOriginal();
    }

    @Trace
    public CompletableFuture<? extends Iterable<E>> findAll() {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","MicronautData","AsyncCrudRepository",getClass().getSimpleName(),"findAll");
        return Weaver.callOriginal();
    }

    @Trace
    public CompletableFuture<Long> count() {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","MicronautData","AsyncCrudRepository",getClass().getSimpleName(),"count");
        return Weaver.callOriginal();
    }

    @Trace
    public CompletableFuture<Void> deleteById(ID id) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","MicronautData","AsyncCrudRepository",getClass().getSimpleName(),"deleteById");
        return Weaver.callOriginal();
    }

    @Trace
    public CompletableFuture<Void> delete(E entity) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","MicronautData","AsyncCrudRepository",getClass().getSimpleName(),"delete");
        return Weaver.callOriginal();
    }

    @Trace
    public CompletableFuture<Void> deleteAll(Iterable<? extends E> entities) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","MicronautData","AsyncCrudRepository",getClass().getSimpleName(),"deleteAll");
        return Weaver.callOriginal();
    }

    @Trace
    public CompletableFuture<Void> deleteAll() {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","MicronautData","AsyncCrudRepository",getClass().getSimpleName(),"deleteAll");
        return Weaver.callOriginal();
    }

}
