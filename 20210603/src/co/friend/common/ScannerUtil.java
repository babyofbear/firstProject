package co.friend.common;

import java.util.Scanner;

import co.friend.model.Friend;

public class ScannerUtil {
	static Scanner scn = new Scanner(System.in);

	// 구분, 이름, 전화
	public static Friend readFriend() {
		System.out.print("구분,이름,전화----");
		String input = scn.next();
		// 구분,이름 문자로만 입력가능
		// 전화 숫자로만 입력가능
		String[] inputs = input.split(",");
		return new Friend(inputs[0], inputs[1], inputs[2]);
		// if (inputs[0]!)
	}

	// 사용자의 입력 메세지 -> 숫자 or 문자 -> 읽어오는 기능
	public static String readString(String prompt) {
		System.out.print(prompt);

		return readString();
	}

	public static String readString() {
		String msg = null;
		try {
			msg = scn.next();
		} catch (Exception e) {
			System.out.print("관리자에게 문의하세요.");
		}
		return msg;
	}

	public static int readInt(String prompt) { // 숫자 리턴하는 기능
		System.out.print(prompt);

		return readInt();
	}

	public static int readInt() {
		int val = 0;
		while (true) {

			try {
				val = scn.nextInt();
				scn.nextLine();
				break;
			} catch (Exception e) {
				System.out.print("숫자를 입력하세요.");
				scn.nextLine();
			}
		}
		return val;
	}

}
