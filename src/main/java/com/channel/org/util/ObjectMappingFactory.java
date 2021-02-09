package com.channel.org.util;

import java.util.Map;

import com.channel.org.domain.Accelerometer;
import com.channel.org.domain.AnalogInput;
import com.channel.org.domain.AnalogOutput;
import com.channel.org.domain.BarometricPressure;
import com.channel.org.domain.DigitalInput;
import com.channel.org.domain.DigitalOutput;
import com.channel.org.domain.GPS;
import com.channel.org.domain.Gyrometer;
import com.channel.org.domain.Luminosity;
import com.channel.org.domain.PayloadField;
import com.channel.org.domain.Presence;
import com.channel.org.domain.RelativeHumidity;
import com.channel.org.domain.Temperature;
import com.google.gson.JsonElement;
import com.channel.org.constants.ApplicationConstants;

/**
 * This is an Utility Class for Constructing Java Domain Objects by reading the
 * corresponding Json fileds
 *
 */
public class ObjectMappingFactory {

	/**
	 * This method returns the Java Object corresponding to Json Entities
	 * 
	 * @param keyValue
	 * @param payField
	 */
	public static void create(Map.Entry<String, JsonElement> keyValue, PayloadField payField) {
		if (keyValue == null)
			return;
		if (ApplicationConstants.DIGITALINPUT.equals(keyValue.getKey())) {
			payField.setDigitalInput(
					new DigitalInput(keyValue.getValue().getAsJsonObject().get(ApplicationConstants.VAL).getAsFloat()));
		} else if (ApplicationConstants.BAROMETER.equals(keyValue.getKey())) {
			payField.setBarometricPressure(new BarometricPressure(
					keyValue.getValue().getAsJsonObject().get(ApplicationConstants.VAL).getAsFloat()));
		} else if (ApplicationConstants.DIGITALOUTPUT.equals(keyValue.getKey())) {
			payField.setDigitalOutput(new DigitalOutput(
					keyValue.getValue().getAsJsonObject().get(ApplicationConstants.VAL).getAsFloat()));
		} else if (ApplicationConstants.ACC.equals(keyValue.getKey())) {
			payField.setAccelerometer(
					new Accelerometer(keyValue.getValue().getAsJsonObject().get(ApplicationConstants.X).getAsFloat(),
							keyValue.getValue().getAsJsonObject().get(ApplicationConstants.Y).getAsFloat(),
							keyValue.getValue().getAsJsonObject().get(ApplicationConstants.Z).getAsFloat()));
		} else if (ApplicationConstants.ANALOGINPUT.equals(keyValue.getKey())) {
			payField.setAnalogInput(
					new AnalogInput(keyValue.getValue().getAsJsonObject().get(ApplicationConstants.VAL).getAsFloat()));
		} else if (ApplicationConstants.ANALOGOUTPUT.equals(keyValue.getKey())) {
			payField.setAnalogOutput(
					new AnalogOutput(keyValue.getValue().getAsJsonObject().get(ApplicationConstants.VAL).getAsFloat()));
		} else if (ApplicationConstants.GYRO.equals(keyValue.getKey())) {
			payField.setGyrometer(
					new Gyrometer(keyValue.getValue().getAsJsonObject().get(ApplicationConstants.X).getAsFloat(),
							keyValue.getValue().getAsJsonObject().get(ApplicationConstants.Y).getAsFloat(),
							keyValue.getValue().getAsJsonObject().get(ApplicationConstants.Z).getAsFloat()));
		} else if (ApplicationConstants.GPS.equals(keyValue.getKey())) {
			payField.setGps(
					new GPS(keyValue.getValue().getAsJsonObject().get(ApplicationConstants.LATITUDE).getAsFloat(),
							keyValue.getValue().getAsJsonObject().get(ApplicationConstants.LONGITUDE).getAsFloat()));
		} else if (ApplicationConstants.LUM.equals(keyValue.getKey())) {
			payField.setLuminosity(
					new Luminosity(keyValue.getValue().getAsJsonObject().get(ApplicationConstants.VAL).getAsInt()));
		} else if (ApplicationConstants.PRESENCE.equals(keyValue.getKey())) {
			payField.setPresence(
					new Presence(keyValue.getValue().getAsJsonObject().get(ApplicationConstants.VAL).getAsFloat()));
		} else if (ApplicationConstants.RELHUMIDITY.equals(keyValue.getKey())) {
			payField.setRelativeHumidity(new RelativeHumidity(
					keyValue.getValue().getAsJsonObject().get(ApplicationConstants.VAL).getAsFloat()));
		} else if (ApplicationConstants.TEMP.equals(keyValue.getKey())) {
			payField.setTemperature(
					new Temperature(keyValue.getValue().getAsJsonObject().get(ApplicationConstants.VAL).getAsFloat()));
		}
		return;
	}
}
