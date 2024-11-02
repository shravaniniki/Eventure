package Java8;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZoneDemo {
	
	public static void setMeeting(ZonedDateTime localZone,String otherZone) {
		ZonedDateTime zonedDateTime=localZone.withZoneSameInstant(ZoneId.of(otherZone));
		
		System.out.println("Meetin set at "+zonedDateTime);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZoneId zoneId=ZoneId.systemDefault();
		
		System.out.println(zoneId);
		
		LocalDateTime meetingTime = LocalDateTime.of(2024, 9,7,18,45);
		
		ZonedDateTime myZonedMeetingTime = ZonedDateTime.of(meetingTime, zoneId);
		System.out.println(myZonedMeetingTime);
		
		setMeeting(myZonedMeetingTime,ZoneId.of("America/New_York").toString());
		setMeeting(myZonedMeetingTime,ZoneId.of("Europe/London").toString());
		setMeeting(myZonedMeetingTime,ZoneId.of("Australia/Sydney").toString());

	}

}
