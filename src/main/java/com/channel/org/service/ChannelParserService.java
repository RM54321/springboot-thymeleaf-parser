package com.channel.org.service;

import com.channel.org.domain.ChannelDetails;

/**
 * This is an interface for Channel Parser Service
 *
 */
public interface ChannelParserService {

	public ChannelDetails  getChannelDetails(String id);
}
