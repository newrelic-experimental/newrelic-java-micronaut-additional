package com.newrelic.instrumentation.labs.micronaut.data;

import java.util.function.Consumer;

import com.newrelic.api.agent.NewRelic;

public class NRErrorConsumer implements Consumer<Throwable> {

	private NRTransactionHolder holder = null;
	
	public NRErrorConsumer(NRTransactionHolder h) {
		holder = h;
	}
	
	@Override
	public void accept(Throwable t) {
		NewRelic.noticeError(t);
		if(holder != null) {
			holder.expire();
			holder.ignore();
			holder = null;
		}
	}

}
