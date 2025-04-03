package com.newrelic.instrumentation.labs.micronaut.data;

public class NRReactorRunnable implements Runnable {
	
	private NRTransactionHolder holder = null;
	
	public NRReactorRunnable(NRTransactionHolder h) {
		holder = h;
	}

	@Override
	public void run() {
		if(holder != null) {
			holder.expire();
			holder.ignore();
			holder = null;
		}
		
	}

}
