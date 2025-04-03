package com.newrelic.instrumentation.labs.micronaut.data;

import java.util.function.Consumer;

public class NRResultConsumer<T> implements Consumer<T> {

	private NRTransactionHolder holder = null;
	
	public NRResultConsumer(NRTransactionHolder h) {
		holder = h;
	}
	
	@Override
	public void accept(T t) {
		if(holder != null) {
			holder.expire();
			holder.end();
			holder = null;
		}
	}

}
