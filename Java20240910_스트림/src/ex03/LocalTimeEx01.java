package ex03;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeEx01 {

	public static void main(String[] args) {

		// 오늘 날짜
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		// 날짜 기준 지역
		ZoneId zoneId = ZoneId.systemDefault();
		System.out.println("Local Zone ID : " + zoneId);
		System.out.println("--------------------");
		
		// 현재 시스템 날짜/시간
		LocalDateTime currentTime = LocalDateTime.now();
		System.out.println(currentTime);
		
		// 날짜 시간을 포맷에 맞추기
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH:mm:ss");
		System.out.println("현재 날짜와 시간 : " + formatter.format(currentTime));
		System.out.println("--------------------");
		
		// Europe/Paris 시간 구하기
		zoneId = ZoneId.of("Europe/Paris");
		LocalDateTime parisTime = LocalDateTime.now(zoneId);
		System.out.println("파리 시간 : " + parisTime);
		System.out.println("--------------------");
		
		// 1~10000000000L 총합 소요시간 구하기		
		long sum = 0;
		Instant start = Instant.now();
		
		for(long i=1; i<=10000000000L; i++) {
			sum += i;
		}
		
		Instant end = Instant.now();
		Duration between = Duration.between(start, end);
		
		System.out.println("소요시간 : " + between.toMillis()/1000.0);
		
	}

}
