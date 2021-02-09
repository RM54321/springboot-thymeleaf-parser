package com.channel.org.domain;

import java.io.Serializable;
/**
 * This is the java domain object for representing
 *  a PayloadField 
 *
 */
public class PayloadField implements Serializable{

	private static final long serialVersionUID = 1L;
    
	private DigitalInput digitalInput;
	
	private BarometricPressure barometricPressure;
	
	private DigitalOutput digitalOutput;
	
	private Accelerometer accelerometer;
	
	private AnalogInput analogInput;
	
	private AnalogOutput analogOutput;
	
	private Gyrometer gyrometer;
	
	private GPS gps;
	
	private Luminosity luminosity;
	
	private Presence presence;
	
	private RelativeHumidity relativeHumidity;
	
	private Temperature temperature;

	public DigitalInput getDigitalInput() {
		return digitalInput;
	}

	public void setDigitalInput(DigitalInput digitalInput) {
		this.digitalInput = digitalInput;
	}

	public BarometricPressure getBarometricPressure() {
		return barometricPressure;
	}

	public void setBarometricPressure(BarometricPressure barometricPressure) {
		this.barometricPressure = barometricPressure;
	}

	public DigitalOutput getDigitalOutput() {
		return digitalOutput;
	}

	public void setDigitalOutput(DigitalOutput digitalOutput) {
		this.digitalOutput = digitalOutput;
	}

	public Accelerometer getAccelerometer() {
		return accelerometer;
	}

	public void setAccelerometer(Accelerometer accelerometer) {
		this.accelerometer = accelerometer;
	}

	public AnalogInput getAnalogInput() {
		return analogInput;
	}

	public void setAnalogInput(AnalogInput analogInput) {
		this.analogInput = analogInput;
	}

	public AnalogOutput getAnalogOutput() {
		return analogOutput;
	}

	public void setAnalogOutput(AnalogOutput analogOutput) {
		this.analogOutput = analogOutput;
	}

	public Gyrometer getGyrometer() {
		return gyrometer;
	}

	public void setGyrometer(Gyrometer gyrometer) {
		this.gyrometer = gyrometer;
	}

	public GPS getGps() {
		return gps;
	}

	public void setGps(GPS gps) {
		this.gps = gps;
	}

	public Luminosity getLuminosity() {
		return luminosity;
	}

	public void setLuminosity(Luminosity luminosity) {
		this.luminosity = luminosity;
	}

	public Presence getPresence() {
		return presence;
	}

	public void setPresence(Presence presence) {
		this.presence = presence;
	}

	public RelativeHumidity getRelativeHumidity() {
		return relativeHumidity;
	}

	public void setRelativeHumidity(RelativeHumidity relativeHumidity) {
		this.relativeHumidity = relativeHumidity;
	}

	public Temperature getTemperature() {
		return temperature;
	}

	public void setTemperature(Temperature temperature) {
		this.temperature = temperature;
	}
	
	
	
}
