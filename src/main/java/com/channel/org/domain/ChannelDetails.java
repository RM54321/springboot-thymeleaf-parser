package com.channel.org.domain;

import java.io.Serializable;
import java.util.List;
/**
 * This is the java domain object for representing
 * channel details
 *
 */
public class ChannelDetails implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;

	private String username;
	
	private String deviceName;
	
	private String devId;
	
	private String appId;
	
	private String applicationName;
	
	private String payloadRaw;
	
	private String lastSeen;
	
	private List<Channel> channels;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDevId() {
		return devId;
	}

	public void setDevId(String devId) {
		this.devId = devId;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getPayloadRaw() {
		return payloadRaw;
	}

	public void setPayloadRaw(String payloadRaw) {
		this.payloadRaw = payloadRaw;
	}

	public String getLastSeen() {
		return lastSeen;
	}

	public void setLastSeen(String lastSeen) {
		this.lastSeen = lastSeen;
	}

	public List<Channel> getChannels() {
		return channels;
	}

	public void setChannels(List<Channel> channels) {
		this.channels = channels;
	}
}
