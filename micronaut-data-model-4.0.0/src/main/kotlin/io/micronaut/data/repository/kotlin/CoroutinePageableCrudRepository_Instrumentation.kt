package io.micronaut.data.repository.kotlin

import com.newrelic.api.agent.NewRelic
import com.newrelic.api.agent.Trace
import com.newrelic.api.agent.weaver.MatchType
import com.newrelic.api.agent.weaver.Weave
import com.newrelic.api.agent.weaver.Weaver
import io.micronaut.data.model.Page
import io.micronaut.data.model.Pageable
import io.micronaut.data.model.Sort
import kotlinx.coroutines.flow.Flow

@Weave(originalName = "io.micronaut.data.repository.kotlin.CoroutinePageableCrudRepository", type = MatchType.Interface)
class CoroutinePageableCrudRepository_Instrumentation<E, ID> {

    @Trace
    fun findAll(sort: Sort): Flow<E> {
        NewRelic.getAgent().tracedMethod.setMetricName("Custom","Micronaut-Data","CoroutinePageableCrudRepository",javaClass.simpleName,"findAll")
        return Weaver.callOriginal()
    }

    @Trace
    suspend fun findAll(pageable: Pageable): Page<E> {
        NewRelic.getAgent().tracedMethod.setMetricName("Custom","Micronaut-Data","CoroutineCrudRepository",javaClass.simpleName,"findAll")
        return Weaver.callOriginal()
    }

}