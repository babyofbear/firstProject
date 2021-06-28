package conditions;

import java.util.Scanner;

public class Exercise08 {//07 예제 변환
	
	static int balance = 0 ;
	static Scanner scn = new Scanner(System.in);
	
	public static boolean checkAdmin(String id, String pass) {
		if(id.equals("admin")&& pass.equals("1234")) {
				return true;
		
		} return false;
			
		
	
	}
	
	
	public static void printMenu() {
		System.out.println("-----------------------");
		System.out.println("1.예금 2.출금 3.잔액 4.종료");
		System.out.println("-----------------------");
		System.out.println("선택>");	
		
		
	}
	
	public static void deposit() {
		System.out.println("금액을 입력>>>");
		int temp = scn.nextInt();
		if (100000 < balance + temp) {
			System.out.println("10만원을 초과하여 입금할 수 없습니다.");
			System.out.println("반환되는 지폐를 가져가세요.");
		} else {
				//balance = balance + temp;
				balance = add(balance, temp);
				System.out.println(temp + "원이 입금 되었습니다.");
		}
		
	}

	public static void withdraw() {
		System.out.println("출금처리.");
		System.out.println("금액을 입력>>>");
		int temp = scn.nextInt();

		if (temp > balance) {
			System.out.println("출금이 불가능합니다.");
		} else {
			balance = balance - temp;
			System.out.println(temp + "원이 출금 되었습니다.");
		}
		
	}
	
	public static int add(int balance, int amount) {
		int sum = balance + amount ;
		return sum;
	}
	
	
	
	public static void main(String[] args) {
		// id=admin, pass=1234
		int balance = 0;
		Scanner scn = new Scanner(System.in);
		
		boolean run = false;

		do { 
			if(!run) 	{
				//id, pass => admin, 1234 정상 입력되면 정상가동
				//틀리면 프로그램 종료
				System.out.println("id입력>>> ");
				String id = scn.nextLine();
				System.out.println("passwd입력>>> ");
				String pass = scn.nextLine();
				
				run = checkAdmin(id, pass);
			}else {
			
			
			
				printMenu();//메뉴 출력
				
				int menu = scn.nextInt();
				if (menu == 1) {
					System.out.println("예금처리.");// 소규모 은행 총예금 금액 10만원 이상을 입금할 수 없음
					deposit();
				
	
					
				}else if (menu == 2) {
					
					withdraw();
					
				} else if (menu == 3) {
					System.out.println("잔액조회.");
					System.out.println("현재잔액." + balance);
					System.out.println("현재 잔액은 " + balance + "원 입니다.");
	
				} else if (menu == 4) {
					run = false; // 무한 반복 멈춤
				} // if
		
			}
		}while (run); // while
		System.out.println("프로그램을 종료합니다.");
	}// main
}// class
