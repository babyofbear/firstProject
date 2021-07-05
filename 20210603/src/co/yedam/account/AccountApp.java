package co.yedam.account;

import java.io.File; //ctrl+shift+o
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.util.Scanner;

//데이터를 담아 놓기위한 Account
//컨트롤 입금, 출금 => 사용자의 입력으로 메뉴를 실행.
public class AccountApp {
	static AccountApp app = new AccountApp();

	private AccountApp() {

	}

	public static AccountApp getInstance() {
		return app;
	}

	Account[] accounts = new Account[10]; // 필드 영역으로
	Scanner scn = new Scanner(System.in); // 필드 영역에서 적용
	File file = new File("accountList.txt");

	private void printMenu() {
		System.out.println("--------------------------------------------------");
		System.out.println("1.계좌생성 2.계좌목록 3.입금 4.출금 5.파일저장 6.파일열기 7.종료");
		System.out.println("--------------------------------------------------");
		System.out.println("선택>");
	}

	// 1. 계좌생성
	private void creatAccount() {
		String ano = Utils.scanString("계좌번호 입력>");
		String owner = Utils.scanString("예금주 입력>");
		String amount = Utils.scanNumberString("금액 입력>");
		Account acnt = new Account(ano, owner, Integer.parseInt(amount)); // 직접 입력해서 생성
		acnt.setAno(ano);
		acnt.setOwner(owner);
		acnt.setBalance(Integer.parseInt(amount)); // 문자열로 되어있는 숫자를 int형으로 바꿔줌
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				accounts[i] = acnt;
				System.out.println("1건 입력되었습니다.");
				break; // 비어있는 위치에 1건 입력 후 종료
			}
		}
	}// end of creatAccount()

//	   

	// 2. 계좌목록
	private void accountList() {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				System.out.println("계좌번호: " + accounts[i].getAno() + ", 예금주: " + accounts[i].getOwner() + ", 현재잔액: "
						+ accounts[i].getBalance() + "원");

			}
		}
	}// end of accountList()

	// 계좌번호(ano)입력하면 해당 계좌를 반환해주는 메소드
	private Account findAccount(String ano) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getAno().equals(ano)) {
				return accounts[i];
			}
		}
		return null; // 같은 계좌가 없으면 null 리턴
	}// end of findAccount()

	// 3. 입금처리
	private void deposit() {
//		System.out.println("계좌번호>");
//		String ano = scn.nextLine();
		String ano = Utils.scanString("계좌번호 입력>");
//		String owner = Utils.scanString("예금주 입력>");
//		String amount = Utils.scanNumberString("금액 입력>");
		Account acnt = findAccount(ano);
		if (acnt == null) {
			System.out.println("해당 계좌번호는 없습니다.");
		} else {
			// System.out.println("입금액>");
			// String amt = scn.nextLine();
			String amt = Utils.scanNumberString("입금액>");// 위의 두 줄을 한 줄로 요약하는 메소드
			int balance = acnt.getBalance();
			acnt.setBalance(balance + Integer.parseInt(amt));
			System.out.println(amt + "원이 입금되었습니다.");
			System.out.println("현재잔액은 " + (balance + Integer.parseInt(amt)) + "원 입니다.");
		}
	}

	// 출금처리
	private void withdraw() {
//		System.out.println("계좌번호>");
//		String ano = scn.nextLine();
		String ano = Utils.scanString("계좌번호 입력>");
		// String owner = Utils.scanString("예금주 입력>");
		String amt = Utils.scanNumberString("금액 입력>");
		Account acnt = findAccount(ano);
		if (acnt == null) {
			System.out.println("해당 계좌번호는 없습니다.");
		} else {
//			System.out.println("출금액>");
//			String amt = scn.nextLine();
			int balance = acnt.getBalance();
			int wid = Integer.parseInt(amt);
			if (wid > balance) {
				System.out.println("출금이 불가능합니다.");
				System.out.println("금액을 다시 입력하십시오.");
			} else {
				acnt.setBalance(balance - Integer.parseInt(amt));
				System.out.println(amt + "원이 출금되었습니다.");
				System.out.println("현재잔액은 " + (balance - Integer.parseInt(amt)) + "원 입니다.");
			}
		}
	}

	private void fileOpen() {
		Reader is = null;

		try {
			is = new FileReader(file);
			int readByte = 0;
			StringBuffer sb = new StringBuffer();
			while ((readByte = is.read()) != -1) {
				sb.append((char) readByte);
			}
			String[] acnts = sb.toString().split("\n");
			for (int i = 0; i < acnts.length; i++) {
				String[] acnt = acnts[i].split(",");
				accounts[i] = new Account(acnt[0], acnt[1], Integer.parseInt(acnt[2]));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일을 불러옵니다.");
	}

	private void fileSave() { // 저장 기능
		OutputStream os = null;
		try {
			os = new FileOutputStream(file);
			for (int i = 0; i < accounts.length; i++) {
				if (accounts[i] != null) {
					Account account = accounts[i];
					String val = account.getAno() + "," + account.getOwner() + "," + account.getBalance() + "\n";
					os.write(val.getBytes());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				os.flush();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("파일이 저장되었습니다.");
	}

	public void exe() { // exe 실행한다는 의미
		boolean run = true;
		// 1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료
		while (run) {
			printMenu();
			int selectNo = scn.nextInt();
			scn.nextLine();
			if (selectNo == 1) {
				// System.out.println("계좌생성");
				creatAccount();

			} else if (selectNo == 2) {
				// System.out.println("계좌목록");
				accountList();

			} else if (selectNo == 3) {
//				System.out.println("예금");
				deposit();
			} else if (selectNo == 4) {
//				System.out.println("출금");
				withdraw();
			} else if (selectNo == 5) {
//				System.out.println("파일저장");
				fileSave();

			} else if (selectNo == 6) {
//				System.out.println("파일읽기");
				fileOpen();

			} else if (selectNo == 7) {
				System.out.println("종료");
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	} // end of main
}// end of class
