package co.yedam.account;

import java.util.Scanner;

public class Utils {
	static Scanner scn = new Scanner(System.in);
	
	//사용자가 입력값을 문자열로 반환
	public static String scanString(String arg) {
		System.out.print(arg);
		String val = scn.next();
		return val;
	}
	
	public static String scanNumberString(String arg) {
		String val = "";
		while(true) {
			System.out.print(arg);
			val = scn.next();
			try {
				Integer.parseInt(val); 
				break;
			} catch (Exception e) {
				System.out.print("숫자를 입력하세요.");
			}
		}
		return val;
		
	}
	
}
