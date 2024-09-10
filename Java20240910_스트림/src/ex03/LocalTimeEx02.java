package ex03;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeEx02 {

	public static void main(String[] args) {
		
		ZoneId.getAvailableZoneIds().stream()
			.filter(n -> n.startsWith("Europe"))
			.sorted()
			.forEach(zoneId -> System.out.println(zoneId));
		
		// Europe/Paris 시간 구하기
		ZonedDateTime parisDateTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println(parisDateTime);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		System.out.println("파리 현재 시간 : " + formatter.format(parisDateTime));
		
		
	}

}
