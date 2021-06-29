package reference;

import java.util.Scanner;

public class ArrayExample4 {

	static int n = 25;
	static int[] intAry = new int[n];// 글로벌 변수로 쓰기 위해서 메인 메소드 밖으로 꺼냄

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		// 중복값 제거.

		for (int i = 0; i < intAry.length; i++) {
			boolean pass = true;
			intAry[i] = (int) (Math.random() * n) + 1;
			// 이전 값과 비교
			for (int j = 0; j < i; j++) { // 이전 순번까지 순환
				// System.out.print(intAry[j] + "\t");// 이전 값과 비교 j=i-1
				if (intAry[i] == intAry[j]) {
					// intAry[i] = (int) (Math.random() * 5)+1;
					pass = false;
					break; // 동일한 값이 있으면 반복문 빠져나옴
				}
			}
			if (!pass) {
				i--;// i 순번 1만큼 줄여줌
			}
		}

		//intAry[0]= 0;
		//intAry[4]= -1;
		//화면에 출력


		while (true) {
			for (int i = 0; i < intAry.length; i++) {
				show(i);
				if (i % 5 == 4) {
					System.out.println();
				}
			}
			System.out.println("숫자 10을 찾으세요(0~24)>>>");
			int idx = scn.nextInt();
			if(idx >24 || idx < 0) { 
				System.out.println("잘못된 값을 넣었습니다. 다시 입력하세요.");// 잘못된 범위의 값을 입력한 경우.
				continue; // continue 아래부분 실행하지 않고 다시 반복의 처음부분으로 돌아감.
							// cf)break는 반복문을 빠져나옴.
			}
			if (intAry[idx] == 10) {
				System.out.println("찾았습니다.");
				break;
			} else {
				intAry[idx] = 0;

			}
		}
		System.out.println("프로그램 종료");
	}

	public static void show(int idx) {
		if (intAry[idx] > 0) {
			System.out.printf("(%2d)", idx);// f format 에 맞게 출력,%2d 숫자를 두 자리로 표현
		} else {
			System.out.printf("(**)", idx);
		}
	}
	/*
	 * int num1 = (int) (Math.random() * 5); //0~4까지 정수 랜덤 값
	 * 
	 * int num2 = (int) (Math.random() * 5); while (true) { if (num1 == num2 ) {
	 * num2 = (int) (Math.random() * 5); } else break; } int num3 = (int)
	 * (Math.random() * 5); while (true) { if (num1 == num2 || num2 == num3) { num3
	 * = (int) (Math.random() * 5); } else { break; } } int num4 = (int)
	 * (Math.random() * 5); while (true) { if (num1 == num2 || num2 == num3|| num3
	 * == num4) { num3 = (int) (Math.random() * 5); } else { break; } }
	 * 
	 * int num5 = (int) (Math.random() * 5); while (true) { if (num1 == num2 || num2
	 * == num3|| num3 == num4|| num4 == num5) { num3 = (int) (Math.random() * 5); }
	 * else { break; } }
	 * 
	 * System.out.println(num1 + "," + num2 + "," + num3 + ","+ num4 + "," + num5 );
	 */

}
