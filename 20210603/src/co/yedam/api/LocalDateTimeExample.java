package co.yedam.api;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now.format(dtf)); //LocalDateTime -> String 타입으로 보여줌
		
		LocalDateTime anytime = LocalDateTime.parse("2021-06-14 15:00:00", dtf);
	//	anytime = LocalDateTime.parse("2033년 05년 01일 14:23:22", dtf);
		
		dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH:mm:ss");
		System.out.println(anytime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		
		System.out.println(now.isAfter(anytime)); // 선후 관계 비교, String으로는 비교 안됨.
		
		
		LocalDateTime t1 = LocalDateTime.now().withYear(1979).withMonth(7).withDayOfMonth(30).withHour(15).withMinute(30).withSecond(30);
		System.out.println(t1.format(dtf));
		
		
	}
}
