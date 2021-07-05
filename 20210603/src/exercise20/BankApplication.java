package exercise20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] acccountArray = new Account[100] ;
//			Account[] accounts = new Account[100] ; 
//			accounts = new Account[] (this.ano, this.owner, this.balance);		
	
	private static Scanner scn = new Scanner(System.in);
	
	
	
	public static void main(String[] args) { //매인 메소드
		boolean run = true;
		while(run) {
			System.out.println("----------------------------------------");
			System.out.println("1.계좌생성| 2.계좌목록| 3.예금| 4.출금| 5.종료");
			System.out.println("----------------------------------------");
			System.out.println("선택>");
			
			int selectNo = scn.nextInt();
			
			if(selectNo == 1) {
				creatAccount();
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				creatAccount();
			} else if(selectNo == 4) {
				creatAccount();
			} else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}//end of main
	
	
		
	private static void creatAccount() {
		System.out.println("============");
		System.out.println("계좌생성");
		System.out.println("============");
		String ano = scanString("계좌번호: (6자리)");
		String owner = scanString("계좌주: ");
		String balance = scanString("초기입금액: ");
		System.out.println("결과: 계좌가 생성되었습니다.");
		
	}
	
	//계좌 목록 보기
	public static void accountList() {
		for(int i = 0; i < acccountArray.length; i++) {
			System.out.println("============");
			System.out.println("계좌목록");
			System.out.println("============");
			System.out.println(acccountArray[i].showInfo());
		}
		//작성위치
	}
	
	//예금하기
	private static void deposit() {
		//작성위치
	}
	
	//출금하기
	private static void withdraw() {
		//작성위치
	}
		
	//Account 배열에서 ano와 동일한 Account 개체 찾기
	
	//private static Account findAccount(String ano) {
		//작성위치
	//}
	
	public static String scanString(String arg) {
		System.out.print(arg);
		String val = scn.next();
		return val;
	}
	
	public static int scanInt(String arg) { // 입력 메세지 출력 후 문자 입력값을 반환
		System.out.print(arg);
		int val = scn.nextInt();
		return val;
		
	}

}//end of class
