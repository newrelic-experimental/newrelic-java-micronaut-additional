package io.micronaut.transaction.support;

import com.newrelic.api.agent.weaver.SkipIfPresent;

@SkipIfPresent(originalName = "io.micronaut.transaction.support.AbstractReactorTransactionOperations")
public abstract class ReactiveSkip {

}
