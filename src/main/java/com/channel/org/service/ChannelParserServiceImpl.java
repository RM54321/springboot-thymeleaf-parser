package com.channel.org.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.channel.org.client.ChannelApiClient;
import com.channel.org.domain.ChannelDetails;
import com.channel.org.util.ChannelParser;

/**
 * This is the service implementation class for fetching 
 * channel details
 *
 */
@Service
public class ChannelParserServiceImpl implements ChannelParserService {
    
	@Autowired
   	private ChannelApiClient apiClient;
	
	/**
	 * This is the method for fetching channel details
	 * making external API call.
	 */
	@Override
	public ChannelDetails getChannelDetails(String id) {
		return ChannelParser.parse(apiClient.getChanneldetails(id));
	}

}
