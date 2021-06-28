package conditions;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		// 간단한 예금출금 프로그램.
		int balance = 0;
		Scanner scn = new Scanner(System.in);

		while (true) { // 값 자체가 true이기 때문에 무한반복
			System.out.println("-----------------------");
			System.out.println("1.예금 2.출금 3.잔액 4.종료");
			System.out.println("-----------------------");
			System.out.println("선택>");
			int menu = scn.nextInt();
			if (menu == 1) {
				System.out.println("예금처리.");// 소규모 은행 총예금 금액 10만원 이상을 입금할 수 없음
				System.out.println("금액을 입력>>>");
				int temp = scn.nextInt();
				if (100000 < balance + temp) {
					System.out.println("10만원을 초과하여 입금할 수 없습니다.");
					System.out.println("반환되는 지폐를 가져가세요.");
				}

				else {
					balance = balance + temp;
					System.out.println(temp + "원이 입금 되었습니다.");
				}

			} else if (menu == 2) {
				System.out.println("출금처리.");
				System.out.println("금액을 입력>>>");
				int temp = scn.nextInt();

				if (temp > balance) {
					System.out.println("출금이 불가능합니다.");
				} else {
					balance = balance - temp;
					System.out.println(temp + "원이 출금 되었습니다.");
				}
			} else if (menu == 3) {
				System.out.println("잔액조회.");
				System.out.println("현재잔액." + balance);
				System.out.println("현재 잔액은 " + balance + "원 입니다.");

			} else if (menu == 4) {
				break; // 무한 반복 멈춤
			} // if
		} // while
		System.out.println("프로그램을 종료합니다.");
	}// main
}// class
