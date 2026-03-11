package io.micronaut.data.operations;

import com.newrelic.api.agent.NewRelic;
import com.newrelic.api.agent.Trace;
import com.newrelic.api.agent.weaver.MatchType;
import com.newrelic.api.agent.weaver.Weave;
import com.newrelic.api.agent.weaver.Weaver;
import io.micronaut.data.model.Page;
import io.micronaut.data.model.runtime.*;

import java.io.Serializable;
import java.util.Optional;
import java.util.stream.Stream;

@Weave(originalName = "io.micronaut.data.operations.RepositoryOperations", type = MatchType.Interface)
public class RepositoryOperations_Instrumentation {

    @Trace
    public <T> T findOne(Class<T> type, Serializable id) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","Micronaut","RepositoryOperations",getClass().getSimpleName(),"findOne");
        return Weaver.callOriginal();
    }

    @Trace
    public <T, R> R findOne(PreparedQuery<T, R> preparedQuery) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","Micronaut","RepositoryOperations",getClass().getSimpleName(),"findOne");
        return Weaver.callOriginal();
    }

    @Trace
    public <T> boolean exists(PreparedQuery<T, Boolean> preparedQuery) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","Micronaut","RepositoryOperations",getClass().getSimpleName(),"exists");
        return Weaver.callOriginal();
    }

    @Trace
    public <T> Iterable<T> findAll(PagedQuery<T> query)  {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","Micronaut","RepositoryOperations",getClass().getSimpleName(),"findAll");
        return Weaver.callOriginal();
    }

    @Trace
    public <T> long count(PagedQuery<T> pagedQuery) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","Micronaut","RepositoryOperations",getClass().getSimpleName(),"count");
        return Weaver.callOriginal();
    }

    @Trace
    public <T, R> Iterable<R> findAll(PreparedQuery<T, R> preparedQuery) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","Micronaut","RepositoryOperations",getClass().getSimpleName(),"findAll");
        return Weaver.callOriginal();
    }

    @Trace
    public <T, R> Stream<R> findStream(PreparedQuery<T, R> preparedQuery) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","Micronaut","RepositoryOperations",getClass().getSimpleName(),"findStream");
        return Weaver.callOriginal();
    }

    @Trace
    public <T> Stream<T> findStream(PagedQuery<T> query){
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","Micronaut","RepositoryOperations",getClass().getSimpleName(),"findStream");
        return Weaver.callOriginal();
    }

    @Trace
    public <R> Page<R> findPage(PagedQuery<R> query) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","Micronaut","RepositoryOperations",getClass().getSimpleName(),"findPage");
        return Weaver.callOriginal();
    }

    @Trace
    public <T> T persist(InsertOperation<T> operation) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","Micronaut","RepositoryOperations",getClass().getSimpleName(),"persist");
        return Weaver.callOriginal();
    }

    @Trace
    public <T> T update(UpdateOperation<T> operation) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","Micronaut","RepositoryOperations",getClass().getSimpleName(),"update");
        return Weaver.callOriginal();
    }

    @Trace
    public Optional<Number> executeUpdate(PreparedQuery<?, Number> preparedQuery) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","Micronaut","RepositoryOperations",getClass().getSimpleName(),"executeUpdate");
        return Weaver.callOriginal();
    }

    @Trace
    public <T> int delete(DeleteOperation<T> operation) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","Micronaut","RepositoryOperations",getClass().getSimpleName(),"delete");
        return Weaver.callOriginal();
    }

    @Trace
    public <T> Optional<Number> deleteAll(DeleteBatchOperation<T> operation) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","Micronaut","RepositoryOperations",getClass().getSimpleName(),"deleteAll");
        return Weaver.callOriginal();
    }

}
