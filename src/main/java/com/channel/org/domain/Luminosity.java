package com.channel.org.domain;

import java.io.Serializable;
/**
 * This is the java domain object for representing
 *  a Luminosity reading
 *
 */
public class Luminosity implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer value;
	
	public Luminosity() {

	}

	public Luminosity(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	
	
}
