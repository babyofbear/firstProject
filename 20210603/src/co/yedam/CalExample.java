package co.yedam;

import java.util.Calendar;

public class CalExample {

	public static void main(String[] args) {

		int year = 2021;
		int month = 3;
		printCal(year, month);
	}

	public static void printCal(int year, int month) {

		System.out.println("<<<" + year + "년 " + month + "월 >>>");

		Calendar cal = Calendar.getInstance(); // new Calendar();
		// cal.set(2019,4,5);
		System.out.println("년도: " + cal.get(Calendar.YEAR));
		System.out.println("월: " + (cal.get(Calendar.MONTH) + 1));
		System.out.println("일: " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("요일: " + cal.get(Calendar.DAY_OF_WEEK));
		System.out.println("막날: " + cal.getActualMaximum(Calendar.DATE));
		
		printDays(); // 요일 타이틀 출력하기

		int firstDay = cal.get(Calendar.DAY_OF_WEEK);
		// 첫날이 4 라면 일월화 빈 칸으로 채우고 나머지 숫자 뒤로 밀기
		// 공란 만들기
		for (int i = 1; i < firstDay; i++) {
			System.out.printf("%4s", "");

		}

		
		int lastDate = cal.getActualMaximum(Calendar.DATE);
		// 1~31까지(7개씩 나오게 하기)
		// 1 2 3 4 5 6 7
		// 8 9 10 11 12 13 14
		// 15 16 17 18 19 20 21
		// 22 23 24 25 26 27 28
		// 29 30 31

		//// Week num1 = new Week
		
		for (int i = 1; i <= lastDate; i++) {
			System.out.printf("%4d", i);

			if ((i + firstDay) % 7 == 1) {
				System.out.println();
			}

		}

	}

	public static void printDays() {
		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		// 요일 정보 : 확장 for 문
		for (String day : days) {
			System.out.print(" " + day);
		}System.out.println();
	}
}

