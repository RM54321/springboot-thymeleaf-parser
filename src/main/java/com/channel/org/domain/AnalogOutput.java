package com.channel.org.domain;

import java.io.Serializable;

/**
 * This is the java domain object for representing
 *  an AnalogOutput reading
 *
 */
public class AnalogOutput implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private float value;
	
	public AnalogOutput( ) {
		
	}
	
	public AnalogOutput (float value) {
		this.value = value;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}
	
	

}
