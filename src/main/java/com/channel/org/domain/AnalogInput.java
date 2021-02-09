package com.channel.org.domain;

import java.io.Serializable;

/**
 * This is the java domain object for representing
 *  an AnalogInput reading
 *
 */
public class AnalogInput implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public AnalogInput() {
		
	}
	
	public AnalogInput(float value) {
	    this.value = value;	
	}
	
	private float value;

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}
	
	

}
