package com.channel.org.domain;

import java.io.Serializable;
/**
 * This is the java domain object for representing
 *  a GPS reading
 *
 */
public class GPS implements Serializable {

	private static final long serialVersionUID = 1L;

	private float latitude;
	private float longitude	;
	
	public GPS() {
		
	}
	
	public GPS (float latitude,float longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public float getLatitude() {
		return latitude;
	}
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	public float getLongitude() {
		return longitude;
	}
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

}
