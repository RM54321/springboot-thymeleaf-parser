package com.channel.org.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/**
 * This is the java domain object for representing
 *  a channel details.
 *
 */
public class Channel implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer channel;
	
    private List<PayloadField> payloadFields = new ArrayList<>();

	public Integer getChannel() {
		return channel;
	}

	public void setChannel(Integer channel) {
		this.channel = channel;
	}

	public List<PayloadField> getPayloadFields() {
		return payloadFields;
	}

	public void setPayloadFields(List<PayloadField> payloadFields) {
		this.payloadFields = payloadFields;
	}
}
