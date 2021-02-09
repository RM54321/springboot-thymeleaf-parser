package com.channel.org.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.channel.org.constants.ApplicationConstants;
import com.channel.org.domain.ChannelDetails;
import com.channel.org.service.ChannelParserService;

/**
 * This is the controller class exposing the URI for displaying Channel Details
 */
@Controller
public class ChannelParserController {

	@Autowired
	private ChannelParserService channelParserService;

	/**
	 * This method exposes an URI for displaying channel details
	 * 
	 * @param model
	 * @return String
	 */
	@RequestMapping(value = "/channels", method = RequestMethod.GET)
	public String getItems(Map<String, Object> model, @RequestParam String id) {
		try {
			ChannelDetails channelDetails = channelParserService.getChannelDetails(id);
			model.put(ApplicationConstants.CHANNEL_DETAILS, channelDetails);
		} catch (Exception ex) {
			model.put(ApplicationConstants.ERROR_MESSAGE, ApplicationConstants.ERROR_DESC + ex.toString());
		}

		return ApplicationConstants.API_RETURN_CHANNNEL;
	}
}
