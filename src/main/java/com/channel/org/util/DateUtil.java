package com.channel.org.util;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.OffsetDateTime;
import java.util.Date;

import com.channel.org.constants.ApplicationConstants;

/**
 *  This class provides utility methods for changing date formats.
 *
 */
public class DateUtil {

	/**
	 * This method expects date in OffsetDateTime format and 
	 * converts to MM/dd/yyyy HH:mm aa format and appends EST at the end
	 * 
	 * @param time
	 * @return String
	 */
	public static String parseDate(String time) {
		Date date = Date.from(OffsetDateTime.parse(time).toInstant());
		Format f = new SimpleDateFormat(ApplicationConstants.EXPECTED_DATE_FORMAT);
	    String str = f.format(date);
		return str + ApplicationConstants.EXPECTED_TIME_ZONE;
		
	}
}
