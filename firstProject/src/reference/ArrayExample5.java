package reference;

import java.util.Scanner;

public class ArrayExample5 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		String[] names = new String[5];
		names[0] = "Hong"; // 첫번째
		names[1] = "Hwang"; // 두번째
		names[2] = "Park"; // 세번째
		names[3] = "kim"; // 네번째
		names[4] = "Choi"; // 다섯번째

		String[] idx = new String[5];
		idx[0] = "첫";
		idx[1] = "두";
		idx[2] = "세";
		idx[3] = "네";
		idx[4] = "다섯";

		// Hong + Enter => 첫번째 위치에 있습니다.
		// quit + Enter => 프로그램 종료.
		// Lee + Enter => 이런 이름은 없습니다.

		while (true) {
			System.out.println("이름을 입력하세요.");
			String input = scn.nextLine();
			boolean pass = false;
			if (input.equals("quit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			for (int i = 0; i < names.length; i++) {
				if (names[i].equals(input)) {
					pass = true;
					System.out.println(idx[i] + "번째 위치에 있습니다.");
				}
			}
			if (!pass) 
			{
				System.out.println("잘못 입력한 이름입니다.다시 입력하십시오.");
			}

		}

	}//end of main

}//end of class
