package co.yedam.pilates;

import java.util.Scanner;

public class PilatesApp {

	static Member[] members = new Member[10];
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// 입력, 수정기능, 삭제, 회원리스트, 이름 조회, 종료
		// 이름, 연락처, 생년월일(6자리), 성별

		// 1.입력 2.수정 3.삭제 4.회원리스트 5.이름조회 0.종료
		while (true) {
			showMenu();
			int menu = scn.nextInt(); // 숫자만 입력 가능
			scn.nextLine(); // 글자 입력 가능

			if (menu == 1) {
				memberAdd();
			} else if (menu == 2) {

			} else if (menu == 3) {

			} else if (menu == 4) {
				memberList();

			} else if (menu == 5) {

			} else if (menu == 0) {

				System.out.println("프로그램이 종료되었습니다.");
			}break;
			

		}

	}// end of main

	public static void memberList() {
		for (int i = 0; i < members.length; i++) {
			System.out.println(members[i].showInfo());
		}
	}

	public static void memberAdd() {
		System.out.println("이름을 입력>>>");
		String name = scn.nextLine();
		System.out.println("연락처 입력>>>");
		String phone = scn.nextLine();
		System.out.println("생일을 입력>>>");
		String birth = scn.nextLine();
		System.out.println("성별을 입력(1:남, 2:여)>>>");
		int gen = scn.nextInt();
		Gender gender = null;
		if (gen == 1) {
			gender = Gender.MEN;
		} else if (gen == 2) {
			gender = Gender.WOMEN;
		}

		Member member = new Member();
		member.setMemberName(name);
		member.setMemberPhone(phone);
		member.setMemberBirth(birth);
		member.setMemberGen(gender);
		member.setMemberId(getNextId());

		for (int i = 0; i < members.length; i++) {
			if (members[i] == null) { // 입력시 비어 있는 곳에 입력. 덮어쓰기 방지
				members[i] = member;
				break; // 비어있는 위치에 한 건 있는 이력 후 종료
			}
		}

	}

	public static void showMenu() {
		System.out.println("-------------------------------------------");
		System.out.println("1.입력 2.수정 3.삭제 4.회원리스트 5.이름조회    0.종료");
		System.out.println("-------------------------------------------");
		System.out.println("선택>>>>>>");

	}

	public static int getNextId() { // 회원번호 가입순번 ==> 1, 2, 3 , 5, 6 ,7 ,
		int memberId = 0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) { // 현재 멤버 아이디 중에서 최고 큰 번호 가져오기
				if (members[i].getMemberId() > memberId) {
					memberId = members[i].getMemberId();
				}
			}
		}
		memberId++;
		return memberId;
	}

}
