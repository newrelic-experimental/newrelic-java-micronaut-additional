package io.micronaut.data.operations.reactive;

import com.newrelic.api.agent.NewRelic;
import com.newrelic.api.agent.Trace;
import com.newrelic.api.agent.weaver.MatchType;
import com.newrelic.api.agent.weaver.Weave;
import com.newrelic.api.agent.weaver.Weaver;
import io.micronaut.data.model.Page;
import io.micronaut.data.model.runtime.*;
import org.reactivestreams.Publisher;

import java.io.Serializable;

@Weave(originalName = "io.micronaut.data.operations.reactive.ReactiveRepositoryOperations", type = MatchType.Interface)
public class ReactiveRepositoryOperations_Instrumentation {

    @Trace
    public <T> Publisher<T> findOne(Class<T> type, Serializable id) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","ReactiveRepositoryOperations",getClass().getSimpleName(),"findOne");
        return Weaver.callOriginal();
    }

    @Trace
    public <T> Publisher<Boolean> exists(PreparedQuery<T, Boolean> preparedQuery) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","ReactiveRepositoryOperations",getClass().getSimpleName(),"exists");
        return Weaver.callOriginal();
    }

    @Trace
    public <T, R> Publisher<R> findOne(PreparedQuery<T, R> preparedQuery) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","ReactiveRepositoryOperations",getClass().getSimpleName(),"findOne");
        return Weaver.callOriginal();
    }

    @Trace
    public <T> Publisher<T> findOptional(Class<T> type, Serializable id) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","ReactiveRepositoryOperations",getClass().getSimpleName(),"findOptional");
        return Weaver.callOriginal();
    }

    @Trace
    public <T, R> Publisher<R> findOptional(PreparedQuery<T, R> preparedQuery) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","ReactiveRepositoryOperations",getClass().getSimpleName(),"findOptional");
        return Weaver.callOriginal();
    }

    @Trace
    public <T> Publisher<T> findAll(PagedQuery<T> pagedQuery) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","ReactiveRepositoryOperations",getClass().getSimpleName(),"findAll");
        return Weaver.callOriginal();
    }

    @Trace
    public <T> Publisher<Long> count(PagedQuery<T> pagedQuery) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","ReactiveRepositoryOperations",getClass().getSimpleName(),"count");
        return Weaver.callOriginal();
    }

    @Trace
    public <T, R> Publisher<R> findAll(PreparedQuery<T, R> preparedQuery) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","ReactiveRepositoryOperations",getClass().getSimpleName(),"findAll");
        return Weaver.callOriginal();
    }

    @Trace
    public <T> Publisher<T> persist(InsertOperation<T> operation) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","ReactiveRepositoryOperations",getClass().getSimpleName(),"persist");
        return Weaver.callOriginal();
    }

    @Trace
    public <T> Publisher<T> update(UpdateOperation<T> operation) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","ReactiveRepositoryOperations",getClass().getSimpleName(),"update");
        return Weaver.callOriginal();
    }

    @Trace
    public <T> Publisher<T> updateAll(UpdateBatchOperation<T> operation) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","ReactiveRepositoryOperations",getClass().getSimpleName(),"updateAll");
        return Weaver.callOriginal();
    }

    @Trace
    public <T> Publisher<T> persistAll(InsertBatchOperation<T> operation) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","ReactiveRepositoryOperations",getClass().getSimpleName(),"persistAll");
        return Weaver.callOriginal();
    }

    @Trace
    public Publisher<Number> executeUpdate(PreparedQuery<?, Number> preparedQuery) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","ReactiveRepositoryOperations",getClass().getSimpleName(),"executeUpdate");
        return Weaver.callOriginal();
    }

    @Trace
    public Publisher<Number> executeDelete(PreparedQuery<?, Number> preparedQuery) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","ReactiveRepositoryOperations",getClass().getSimpleName(),"findOne");
        return Weaver.callOriginal();
    }

    @Trace
    public <T> Publisher<Number> delete(DeleteOperation<T> operation) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","ReactiveRepositoryOperations",getClass().getSimpleName(),"delete");
        return Weaver.callOriginal();
    }

    @Trace
    public <T> Publisher<Number> deleteAll(DeleteBatchOperation<T> operation) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","ReactiveRepositoryOperations",getClass().getSimpleName(),"deleteAll");
        return Weaver.callOriginal();
    }

    @Trace
    public <R> Publisher<Page<R>> findPage(PagedQuery<R> pagedQuery) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","ReactiveRepositoryOperations",getClass().getSimpleName(),"findPage");
        return Weaver.callOriginal();
    }

}
