package com.channel.org.domain;

import java.io.Serializable;
/**
 * This is the java domain object for representing
 *  a Temperature reading
 *
 */
public class Temperature implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private float value;

	public Temperature() {

	}

	public Temperature(float value) {
		this.value = value;
	}
	
	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}
	
	

}
