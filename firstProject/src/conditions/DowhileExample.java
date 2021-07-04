package conditions;

import java.util.Scanner;

public class DowhileExample {
	public static void main(String[] args) {
		System.out.println("이름을 입력하세요.");
		System.out.println("종료하시려면 q를 입력하세요.");
		
		Scanner scn = new Scanner(System.in);
		String name;
		
		do {
			System.out.print("이름: ");
			name = scn.nextLine();
			System.out.println("입력이름: " + name);
			
			
			} while (!name.equals("q"));
			
		System.out.println();
		System.out.println("프로그램 종료.");
		
	}

}
