package io.micronaut.data.operations.async;

import com.newrelic.api.agent.NewRelic;
import com.newrelic.api.agent.Trace;
import com.newrelic.api.agent.weaver.MatchType;
import com.newrelic.api.agent.weaver.Weave;
import com.newrelic.api.agent.weaver.Weaver;
import io.micronaut.data.model.Page;
import io.micronaut.data.model.runtime.*;

import java.util.concurrent.CompletionStage;

@Weave(originalName = "io.micronaut.data.operations.async.AsyncRepositoryOperations", type = MatchType.Interface)
public class AsyncRepositoryOperations_Instrumentation {

    @Trace
    public <T> CompletionStage<T> findOne(Class<T> type, Object id) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","AsyncRepositoryOperations",getClass().getSimpleName(),"findOne");
        return Weaver.callOriginal();
    }

    @Trace
    public <T> CompletionStage<Boolean> exists(PreparedQuery<T, Boolean> preparedQuery) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","AsyncRepositoryOperations",getClass().getSimpleName(),"exists");
        return Weaver.callOriginal();
    }

    @Trace
    public <T, R> CompletionStage<R> findOne(PreparedQuery<T, R> preparedQuery) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","AsyncRepositoryOperations",getClass().getSimpleName(),"findOne");
        return Weaver.callOriginal();
    }

    @Trace
    public <T> CompletionStage<T> findOptional(Class<T> type, Object id){
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","AsyncRepositoryOperations",getClass().getSimpleName(),"findOptional");
        return Weaver.callOriginal();
    }

    @Trace
    public <T, R> CompletionStage<R> findOptional(PreparedQuery<T, R> preparedQuery) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","AsyncRepositoryOperations",getClass().getSimpleName(),"findOptional");
        return Weaver.callOriginal();
    }

    @Trace
    public <T> CompletionStage<Iterable<T>> findAll(PagedQuery<T> pagedQuery){
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","AsyncRepositoryOperations",getClass().getSimpleName(),"findAll");
        return Weaver.callOriginal();
    }

    @Trace
    public <T> CompletionStage<Long> count(PagedQuery<T> pagedQuery) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","AsyncRepositoryOperations",getClass().getSimpleName(),"count");
        return Weaver.callOriginal();
    }

    @Trace
    public <T, R> CompletionStage<Iterable<R>> findAll(PreparedQuery<T, R> preparedQuery) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","AsyncRepositoryOperations",getClass().getSimpleName(),"findAll");
        return Weaver.callOriginal();
    }

    @Trace
    public <T> CompletionStage<T> persist(InsertOperation<T> operation) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","AsyncRepositoryOperations",getClass().getSimpleName(),"persist");
        return Weaver.callOriginal();
    }

    @Trace
    public <T> CompletionStage<T> update(UpdateOperation<T> operation) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","AsyncRepositoryOperations",getClass().getSimpleName(),"update");
        return Weaver.callOriginal();
    }

    @Trace
    public <T> CompletionStage<Iterable<T>> updateAll(UpdateBatchOperation<T> operation) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","AsyncRepositoryOperations",getClass().getSimpleName(),"updateAll");
        return Weaver.callOriginal();
    }

    @Trace
    public <T> CompletionStage<Number> delete(DeleteOperation<T> operation) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","AsyncRepositoryOperations",getClass().getSimpleName(),"delete");
        return Weaver.callOriginal();
    }

    @Trace
    public <T> CompletionStage<Iterable<T>> persistAll(InsertBatchOperation<T> operation) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","AsyncRepositoryOperations",getClass().getSimpleName(),"persistAll");
        return Weaver.callOriginal();
    }

    @Trace
    public CompletionStage<Number> executeUpdate(PreparedQuery<?, Number> preparedQuery) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","AsyncRepositoryOperations",getClass().getSimpleName(),"executeUpdate");
        return Weaver.callOriginal();
    }

    @Trace
    public CompletionStage<Number> executeDelete(PreparedQuery<?, Number> preparedQuery) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","AsyncRepositoryOperations",getClass().getSimpleName(),"executeDelete");
        return Weaver.callOriginal();
    }

    @Trace
    public <T> CompletionStage<Number> deleteAll(DeleteBatchOperation<T> operation) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","AsyncRepositoryOperations",getClass().getSimpleName(),"deleteAll");
        return Weaver.callOriginal();
    }

    @Trace
    public <R> CompletionStage<Page<R>> findPage(PagedQuery<R> pagedQuery) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","AsyncRepositoryOperations",getClass().getSimpleName(),"findPage");
        return Weaver.callOriginal();
    }

}

