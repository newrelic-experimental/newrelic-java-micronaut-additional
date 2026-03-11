package io.micronaut.data.repository.kotlin

import com.newrelic.api.agent.NewRelic
import com.newrelic.api.agent.Trace
import com.newrelic.api.agent.weaver.MatchType
import com.newrelic.api.agent.weaver.Weave
import com.newrelic.api.agent.weaver.Weaver
import kotlinx.coroutines.flow.Flow

@Weave(originalName = "io.micronaut.data.repository.kotlin.CoroutineCrudRepository", type = MatchType.Interface)
class CoroutineCrudRepository_Instrumentation<E, ID> {

    @Trace
    suspend fun <S : E> save(entity: S): S {
        NewRelic.getAgent().tracedMethod.setMetricName("Custom","Micronaut-Data","CoroutineCrudRepository",javaClass.simpleName,"save")
        return Weaver.callOriginal()
    }

    @Trace
    suspend fun <S : E> update(entity: S): S {
        NewRelic.getAgent().tracedMethod.setMetricName("Custom","Micronaut-Data","CoroutineCrudRepository",javaClass.simpleName,"update")
        return Weaver.callOriginal()
    }

    @Trace
    fun <S : E> updateAll(entities: Iterable<S>): Flow<S> {
        NewRelic.getAgent().tracedMethod.setMetricName("Custom","Micronaut-Data","CoroutineCrudRepository",javaClass.simpleName,"updateAll")
        return Weaver.callOriginal()
    }

    @Trace
    fun <S : E> saveAll(entities: Iterable<S>): Flow<S> {
        NewRelic.getAgent().tracedMethod.setMetricName("Custom","Micronaut-Data","CoroutineCrudRepository",javaClass.simpleName,"saveAll")
        return Weaver.callOriginal()
    }

    @Trace
    suspend fun findById(id: ID): E? {
        NewRelic.getAgent().tracedMethod.setMetricName("Custom","Micronaut-Data","CoroutineCrudRepository",javaClass.simpleName,"findById")
        return Weaver.callOriginal()
    }

    @Trace
    suspend fun existsById(id: ID): Boolean {
        NewRelic.getAgent().tracedMethod.setMetricName("Custom","Micronaut-Data","CoroutineCrudRepository",javaClass.simpleName,"existsById")
        return Weaver.callOriginal()
    }

    @Trace
    fun findAll(): Flow<E> {
        NewRelic.getAgent().tracedMethod.setMetricName("Custom","Micronaut-Data","CoroutineCrudRepository",javaClass.simpleName,"findAll")
        return Weaver.callOriginal()
    }

    @Trace
    suspend fun count(): Long {
        NewRelic.getAgent().tracedMethod.setMetricName("Custom","Micronaut-Data","CoroutineCrudRepository",javaClass.simpleName,"count")
        return Weaver.callOriginal()
    }

    @Trace
    suspend fun deleteById(id: ID): Int {
        NewRelic.getAgent().tracedMethod.setMetricName("Custom","Micronaut-Data","CoroutineCrudRepository",javaClass.simpleName,"deleteById")
        return Weaver.callOriginal()
    }

    @Trace
    suspend fun delete(entity: E): Int {
        NewRelic.getAgent().tracedMethod.setMetricName("Custom","Micronaut-Data","CoroutineCrudRepository",javaClass.simpleName,"delete")
        return Weaver.callOriginal()
    }

    @Trace
    suspend fun deleteAll(entities: Iterable<E>): Int {
        NewRelic.getAgent().tracedMethod.setMetricName("Custom","Micronaut-Data","CoroutineCrudRepository",javaClass.simpleName,"deleteAll")
        return Weaver.callOriginal()
    }

    @Trace
    suspend fun deleteAll(): Int {
        NewRelic.getAgent().tracedMethod.setMetricName("Custom","Micronaut-Data","CoroutineCrudRepository",javaClass.simpleName,"deleteAll")
        return Weaver.callOriginal()
    }

}