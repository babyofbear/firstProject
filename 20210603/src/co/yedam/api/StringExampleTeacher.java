package co.yedam.api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class StringExampleTeacher {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date now = new Date();
		System.out.println(sdf.format(now));
		
		String[] timezones = TimeZone.getAvailableIDs();
		for(String timezone : timezones) {
			if(timezone.toLowerCase().indexOf("LOS") != -1) {
				
			}
				
		}
		Calendar today = Calendar.getInstance(TimeZone.getTimeZone("America/LOS_Angeles"));
		System.out.println(today.get(Calendar.DATE));
		System.out.println(today.get(Calendar.HOUR));
		System.out.println(today.get(Calendar.MINUTE));
		System.out.println(today.get(Calendar.SECOND));
		System.out.println(today.get(Calendar.AM_PM));
	}

}
