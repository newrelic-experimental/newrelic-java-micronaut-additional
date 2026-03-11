package io.micronaut.data.repository;

import com.newrelic.api.agent.NewRelic;
import com.newrelic.api.agent.Trace;
import com.newrelic.api.agent.weaver.MatchType;
import com.newrelic.api.agent.weaver.Weave;
import com.newrelic.api.agent.weaver.Weaver;
import io.micronaut.data.model.Page;
import io.micronaut.data.model.Pageable;
import io.micronaut.data.model.Sort;

import java.util.List;

@Weave(originalName = "io.micronaut.data.repository.PageableRepository", type = MatchType.Interface)
public class PageableRepository_Instrumentation<E> {

    @Trace
    public List<E> findAll(Sort sort) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","PageableRepository",getClass().getSimpleName(),"findAll");
        return Weaver.callOriginal();
    }

    @Trace
    public Page<E> findAll(Pageable pageable) {
        NewRelic.getAgent().getTracedMethod().setMetricName("Custom","PageableRepository",getClass().getSimpleName(),"findAll");
        return Weaver.callOriginal();
    }


}
