package com.newrelic.instrumentation.labs.micronaut.data;

public class NRReactorResultRunnable implements Runnable {
	
	private NRTransactionHolder holder = null;
	
	public NRReactorResultRunnable(NRTransactionHolder h) {
		holder = h;
	}

	@Override
	public void run() {
		if(holder != null) {
			holder.expire();
			holder.end();
			holder = null;
		}
		
	}

}
