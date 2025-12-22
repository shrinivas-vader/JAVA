package timeApi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeAPI {

	public static void main(String[] args) {
//		LocalTime CurrentTime = LocalTime.now();
//		System.out.println(CurrentTime);
		
		ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/Calcutta"));
        System.out.println("New York Time: " + zonedDateTime);
	}
}
