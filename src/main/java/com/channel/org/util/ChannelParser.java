package com.channel.org.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.channel.org.constants.ApplicationConstants;
import com.channel.org.domain.Channel;
import com.channel.org.domain.ChannelDetails;
import com.channel.org.domain.PayloadField;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * This is an Utility class for parsing json String received from API call and
 * constructing Java Object.
 *
 */
public class ChannelParser {

	/**
	 * This method is responsible for parsing json String and converting to Java
	 * Object.
	 * 
	 * @param json
	 * @return ChannelDetails
	 */
	public static ChannelDetails parse(String json) {

		JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();
		String id = null;
		String appId = null;
		String devId = null;
		String deviceName = null;
		String userName = null;
		String applicationName = null;
		String payloadRaw = null;
		String lastSeen = null;

		if (null != jsonObject.get(ApplicationConstants.ID)) {
			id = !jsonObject.get(ApplicationConstants.ID).isJsonNull()
					? jsonObject.get(ApplicationConstants.ID).getAsString()
					: null;
		}
		if (null != jsonObject.get(ApplicationConstants.APPID)) {
			appId = !jsonObject.get(ApplicationConstants.APPID).isJsonNull()
					? jsonObject.get(ApplicationConstants.APPID).getAsString()
					: null;
		}
		if (null != jsonObject.get(ApplicationConstants.DEVID)) {
			devId = !jsonObject.get(ApplicationConstants.DEVID).isJsonNull()
					? jsonObject.get(ApplicationConstants.DEVID).getAsString()
					: null;
		}
		if (null != jsonObject.get(ApplicationConstants.DEVICENAME)) {
			deviceName = !jsonObject.get(ApplicationConstants.DEVICENAME).isJsonNull()
					? jsonObject.get(ApplicationConstants.DEVICENAME).getAsString()
					: null;
		}
		if (null != jsonObject.get(ApplicationConstants.USERNAME)) {
			userName = !jsonObject.get(ApplicationConstants.USERNAME).isJsonNull()
					? jsonObject.get(ApplicationConstants.USERNAME).getAsString()
					: null;
		}
		if (null != jsonObject.get(ApplicationConstants.APP_NAME)) {
			applicationName = !jsonObject.get(ApplicationConstants.APP_NAME).isJsonNull()
					? jsonObject.get(ApplicationConstants.APP_NAME).getAsString()
					: null;
		}
		if (null != jsonObject.get(ApplicationConstants.PAY_RAW)) {
			payloadRaw = !jsonObject.get(ApplicationConstants.PAY_RAW).isJsonNull()
					? jsonObject.get(ApplicationConstants.PAY_RAW).getAsString()
					: null;
		}
		if (null != jsonObject.get(ApplicationConstants.LASTSEEN)) {
			lastSeen = !jsonObject.get(ApplicationConstants.LASTSEEN).isJsonNull()
					? jsonObject.get(ApplicationConstants.LASTSEEN).getAsString()
					: null;
		}

		ChannelDetails channelDetails = populateChannelDetails(jsonObject, id, appId, devId, deviceName, userName,
				applicationName, payloadRaw, lastSeen);
		return channelDetails;
	}

	private static ChannelDetails populateChannelDetails(JsonObject jsonObject, String id, String appId, String devId,
			String deviceName, String userName, String applicationName, String payloadRaw, String lastSeen) {
		ChannelDetails channelDetails = new ChannelDetails();
		List<Channel> channels = new ArrayList<Channel>();
		JsonArray channelArr = jsonObject.getAsJsonArray(ApplicationConstants.CHANNELS);
		if (!channelArr.isJsonNull()) {
			for (int i = 0; i < channelArr.size(); i++) {
				JsonArray arrPayLoadfields = ((JsonObject) channelArr.get(i))
						.getAsJsonArray(ApplicationConstants.PAY_FIELDS);
				List<PayloadField> payloadFields = new ArrayList<PayloadField>();
				for (int j = 0; j < arrPayLoadfields.size(); j++) {
					JsonObject payLoadfield = (JsonObject) arrPayLoadfields.get(j);
					Set<Map.Entry<String, JsonElement>> members = payLoadfield.entrySet();
					PayloadField payField = null;
					for (Map.Entry<String, JsonElement> keyValue : members) {
						if (!keyValue.getValue().isJsonNull()) {
							payField = new PayloadField();
							ObjectMappingFactory.create(keyValue, payField);
							payloadFields.add(payField);
						}
					}
				}
				Integer channel = ((JsonObject) channelArr.get(i)).get(ApplicationConstants.CHANNEL).getAsInt();
				Channel channelObj = new Channel();
				channelObj.setChannel(channel);
				channelObj.setPayloadFields(payloadFields);
				channels.add(channelObj);
			}
			channelDetails.setId(id);
			channelDetails.setAppId(appId);
			channelDetails.setApplicationName(applicationName);
			channelDetails.setDeviceName(deviceName);
			channelDetails.setDevId(devId);
			if (null != lastSeen) {
				channelDetails.setLastSeen(DateUtil.parseDate(lastSeen));
			}
			channelDetails.setPayloadRaw(payloadRaw);
			channelDetails.setUsername(userName);
			channelDetails.setChannels(channels);
		}
		return channelDetails;
	}

}
