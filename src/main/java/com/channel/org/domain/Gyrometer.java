package com.channel.org.domain;

import java.io.Serializable;
/**
 * This is the java domain object for representing
 *  a Gyrometer reading
 *
 */
public class Gyrometer implements Serializable {

	private static final long serialVersionUID = 1L;

	private float x;
	private float y;
	private float z;
	
	public Gyrometer() {

	}

	public Gyrometer(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public float getZ() {
		return z;
	}
	public void setZ(float z) {
		this.z = z;
	}

}
