package io.micronaut.data.operations.reactive;

import com.newrelic.api.agent.NewRelic;
import com.newrelic.api.agent.Trace;
import com.newrelic.api.agent.weaver.MatchType;
import com.newrelic.api.agent.weaver.Weave;
import com.newrelic.api.agent.weaver.Weaver;
import io.micronaut.data.model.Page;
import io.micronaut.data.model.runtime.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Weave(originalName = "io.micronaut.data.operations.reactive.ReactorReactiveRepositoryOperations", type = MatchType.Interface)
public class ReactorReactiveRepositoryOperations_Instrumentation {

    @Trace
    public <T> Mono<T> findOne(Class<T> type, Object id) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","ReactorReactiveRepositoryOperations",getClass().getSimpleName(),"findOne");
        return Weaver.callOriginal();
    }

    @Trace
    public <T> Mono<Boolean> exists(PreparedQuery<T, Boolean> preparedQuery) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","ReactorReactiveRepositoryOperations",getClass().getSimpleName(),"exists");
        return Weaver.callOriginal();
    }

    @Trace
    public <T, R> Mono<R> findOne(PreparedQuery<T, R> preparedQuery) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","ReactorReactiveRepositoryOperations",getClass().getSimpleName(),"findOne");
        return Weaver.callOriginal();
    }

    @Trace
    public <T> Mono<T> findOptional(Class<T> type, Object id) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","ReactorReactiveRepositoryOperations",getClass().getSimpleName(),"findOptional");
        return Weaver.callOriginal();
    }

    @Trace
    public <T, R> Mono<R> findOptional(PreparedQuery<T, R> preparedQuery) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","ReactorReactiveRepositoryOperations",getClass().getSimpleName(),"findOptional");
        return Weaver.callOriginal();
    }

    @Trace
    public <T> Flux<T> findAll(PagedQuery<T> pagedQuery) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","ReactorReactiveRepositoryOperations",getClass().getSimpleName(),"findAll");
        return Weaver.callOriginal();
    }

    @Trace
    public <T> Mono<Long> count(PagedQuery<T> pagedQuery) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","ReactorReactiveRepositoryOperations",getClass().getSimpleName(),"count");
        return Weaver.callOriginal();
    }

    @Trace
    public <T, R> Flux<R> findAll(PreparedQuery<T, R> preparedQuery) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","ReactorReactiveRepositoryOperations",getClass().getSimpleName(),"findAll");
        return Weaver.callOriginal();
    }

    @Trace
    public <T> Mono<T> persist(InsertOperation<T> operation) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","ReactorReactiveRepositoryOperations",getClass().getSimpleName(),"persist");
        return Weaver.callOriginal();
    }

    @Trace
    public <T> Mono<T> update(UpdateOperation<T> operation) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","ReactorReactiveRepositoryOperations",getClass().getSimpleName(),"update");
        return Weaver.callOriginal();
    }

    @Trace
    public <T> Flux<T> updateAll(UpdateBatchOperation<T> operation) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","ReactorReactiveRepositoryOperations",getClass().getSimpleName(),"updateAll");
        return Weaver.callOriginal();
    }

    @Trace
    public <T> Flux<T> persistAll(InsertBatchOperation<T> operation) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","ReactorReactiveRepositoryOperations",getClass().getSimpleName(),"persistAll");
        return Weaver.callOriginal();
    }

    @Trace
    public Mono<Number> executeUpdate(PreparedQuery<?, Number> preparedQuery) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","ReactorReactiveRepositoryOperations",getClass().getSimpleName(),"executeUpdate");
        return Weaver.callOriginal();
    }

    @Trace
    public Mono<Number> executeDelete(PreparedQuery<?, Number> preparedQuery) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","ReactorReactiveRepositoryOperations",getClass().getSimpleName(),"executeDelete");
        return Weaver.callOriginal();
    }

    @Trace
    public <T> Mono<Number> delete(DeleteOperation<T> operation) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","ReactorReactiveRepositoryOperations",getClass().getSimpleName(),"delete");
        return Weaver.callOriginal();
    }

    @Trace
    public <T> Mono<Number> deleteAll(DeleteBatchOperation<T> operation) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","ReactorReactiveRepositoryOperations",getClass().getSimpleName(),"deleteAll");
        return Weaver.callOriginal();
    }

    @Trace
    public <R> Mono<Page<R>> findPage(PagedQuery<R> pagedQuery) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","ReactorReactiveRepositoryOperations",getClass().getSimpleName(),"findPage");
        return Weaver.callOriginal();
    }

}
