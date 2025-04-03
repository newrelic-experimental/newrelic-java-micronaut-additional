package com.newrelic.instrumentation.labs.micronaut.data;

import com.newrelic.api.agent.NewRelic;
import com.newrelic.api.agent.Segment;
import com.newrelic.api.agent.Token;

public class NRTransactionHolder {

	private Token token = null;
	private String segmentName = null;
	private Segment segment = null;
	
	public NRTransactionHolder(Token t, String name) {
		token = t;
		segmentName = name;
	}
	
	public void linkAndExpire() {
		if(token != null) {
			token.linkAndExpire();
			token = null;
		}
	}
	
	public void link() {
		if(token != null) {
			token.link();
		}
	}
	
	public void expire() {
		if(token != null) {
			token.expire();
			token = null;
		}
	}
	
	public void start() {
		if(segment == null) {
			segment = NewRelic.getAgent().getTransaction().startSegment(segmentName);
		}
	}
	
	public void end() {
		if(segment != null) {
			segment.end();
			segment = null;
		}
	}
	
	public void ignore() {
		if(segment != null) {
			segment.ignore();
			segment = null;
		}
	}
}
