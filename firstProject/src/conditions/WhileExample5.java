package conditions;

import java.util.Scanner;

public class WhileExample5 {
	public static void main(String[] args) {
		// 임의의 수 ==> 가위, 바위, 보
		int ran = (int) (Math.random() * 3);
		String rsp = "";
		if (ran == 0) {
			rsp = "가위";
		} else if (ran == 1) {
			rsp = "바위";
		} else if (ran == 2) {
			rsp = "보";
		}

		Scanner scn = new Scanner(System.in);
		String strs = "게임을 시작합니다.";
		for (int i = 0; i < strs.length(); i++) {
			System.out.print(strs.charAt(i));
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				e.printStackTrace();

			}

		}

		System.out.println("");
		System.out.println("가위,바위,보 >>>>");
		String str = scn.nextLine();

		// 조건문.. 컴퓨터 가위/바위/보 <=> 내 가위/바위/보
		// You win..
		// You Lose..
		// same same

		/*
		 * else if (rsp.equals(str)) { System.out.println("Same Same.");
		 * 
		 */
		if (rsp.equals("가위")) {
			if (str.equals("가위")) {
				System.out.println("Same Same.");
			} else if (str.equals("바위")) {
				System.out.println("You Lose.");
			} else if (str.equals("보")) {
				System.out.println("You Win.");
			}
		}

		else if (rsp.equals("바위")) {
			if (str.equals("바위")) {
				System.out.println("Same Same.");
			} else if (str.equals("가위")) {
				System.out.println("You Lose.");
			} else {
				System.out.println("You Win.");
			}
		}

		else if (rsp.equals("보")) {
			if (str.equals("보")) {
				System.out.println("Same Same.");
			} else if (str.equals("바위")) {
				System.out.println("You Lose.");
			} else if (str.equals("가위")) {
				System.out.println("You Win.");
			}
		}
		System.out.println("컴퓨터: " + rsp + ", You: " + str);
		System.out.println("<<<가위바위보 게임종료>>>");
	}

}
