package io.micronaut.data.repository.async;

import com.newrelic.api.agent.NewRelic;
import com.newrelic.api.agent.Trace;
import com.newrelic.api.agent.weaver.MatchType;
import com.newrelic.api.agent.weaver.Weave;
import com.newrelic.api.agent.weaver.Weaver;
import io.micronaut.core.annotation.NonNull;
import io.micronaut.data.model.Page;
import io.micronaut.data.model.Pageable;
import io.micronaut.data.model.Sort;

import java.util.concurrent.CompletableFuture;

@Weave(originalName = "io.micronaut.data.repository.async.AsyncPageableRepository", type = MatchType.Interface)
public class AsyncPageableRepository_Instrumentation<E,ID> {

    @Trace
    public CompletableFuture<E> findAll(Sort sort) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","AsyncPageableRepository", getClass().getSimpleName(),"findAll");
        return Weaver.callOriginal();
    }

    @Trace
    public CompletableFuture<Page<E>> findAll(Pageable pageable) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","AsyncPageableRepository", getClass().getSimpleName(),"findAll");
        return Weaver.callOriginal();
    }
}
