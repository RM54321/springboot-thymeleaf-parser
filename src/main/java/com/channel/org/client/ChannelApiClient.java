package com.channel.org.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.channel.org.constants.ApplicationConstants;

/**
 * This is the client class for making API calls to external Apis
 */
@Component
public class ChannelApiClient {
	
	@Value("${channelApiurl}")
	String apiUrl;
	
	/** This method is responsible for making Api call to fetch Channel
	 *  details
	 * @param id 
	 * @return String
	 */
	public String getChanneldetails(String id) {
		 
	    RestTemplate restTemplate = new RestTemplate();
	    String uri = apiUrl + ApplicationConstants.QUERY_PARAM_ID + id;
	    String result = restTemplate.getForObject(uri, String.class);
	    return result;
	}

}
