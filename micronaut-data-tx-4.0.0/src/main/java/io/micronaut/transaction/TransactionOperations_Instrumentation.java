package io.micronaut.transaction;

import com.newrelic.api.agent.NewRelic;
import com.newrelic.api.agent.Trace;
import com.newrelic.api.agent.TracedMethod;
import com.newrelic.api.agent.weaver.MatchType;
import com.newrelic.api.agent.weaver.Weave;
import com.newrelic.api.agent.weaver.Weaver;

@Weave(originalName = "io.micronaut.transaction.TransactionOperations", type = MatchType.Interface)
public class TransactionOperations_Instrumentation<T> {

	@Trace
	public <R> R execute(TransactionDefinition definition, TransactionCallback<T, R> callback) {
		TracedMethod traced = NewRelic.getAgent().getTracedMethod();
		String transactionName = definition.getName();
		if(transactionName != null && !transactionName.isEmpty()) traced.addCustomAttribute("Transaction-Definition", transactionName);
		traced.setMetricName("Custom","Micronaut","Data","TransactionOperations",getClass().getSimpleName(),"execute");
		return Weaver.callOriginal();
	}
	
	@Trace
	public <R> R executeRead(TransactionCallback<T, R> callback) {
		TracedMethod traced = NewRelic.getAgent().getTracedMethod();
		traced.setMetricName("Custom","Micronaut","Data","TransactionOperations",getClass().getSimpleName(),"executeRead");
		return Weaver.callOriginal();
	}
	
	@Trace
	public <R> R executeWrite(TransactionCallback<T, R> callback) {
		TracedMethod traced = NewRelic.getAgent().getTracedMethod();
		traced.setMetricName("Custom","Micronaut","Data","TransactionOperations",getClass().getSimpleName(),"executeWrite");
		return Weaver.callOriginal();
	}
}
