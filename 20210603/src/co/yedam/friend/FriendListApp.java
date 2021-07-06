package co.yedam.friend;

import java.util.Scanner;

public class FriendListApp {

	static Friend[] friends = new Friend[10];
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// 1.추가 2.리스트. 3.종료

		boolean run = true;
		while (run) {
			System.out.println("==============================");
			System.out.println("1.친구추가 2.친구리스트        3.종료");
			System.out.println("==============================");
			System.out.print("선택>");
			String selectNo = scn.next();
			switch (selectNo) {
			case "1":
				System.out.println("------------------------");
				System.out.println("1.동네친구 2.대학친구 3.회사친구");
				System.out.println("------------------------");
				System.out.print("선택>");
				String menu = scn.next();
				Friend friend = null;
				
				if (menu.equals("1")) {
					System.out.print("이름>>> ");
					String name = scn.next();
					System.out.print("연락처>>> ");
					String phone = scn.next();
					friend = new Friend(name, phone); //Friend 인스턴스

				} else if (menu.equals("2")) {
					System.out.print("이름>>> ");
					String name = scn.next();
					System.out.print("연락처>>> ");
					String phone = scn.next();
					System.out.print("전공>>> ");
					String major = scn.next();
					friend = new UnivFriend(name, phone, major); //UnivFriend 인스턴스

				} else if (menu.equals("3")) {
					System.out.print("이름>>> ");
					String name = scn.next();
					System.out.print("연락처>>> ");
					String phone = scn.next();
					System.out.print("부서>>> ");
					String department = scn.next();
					friend = new CompFriend(name, phone,department); //Friend 인스턴스

				}
				
				for (int i = 0; i < friends.length; i++) {
					if(friends[i]==null) {
						friends[i] = friend;
						break; //for 구문 빠져나오기
					}
				}
				break; //switch구문 빠져나오기
				
			case "2":
				for (int i = 0; i < friends.length; i++) {
					if(friends[i]!=null) {
						System.out.println(friends[i].toString());
					}
				}
				break;
			case "3":
				run = false;
			}

		}

		System.out.println("프로그램을 종료합니다.");
	}// end of main

}// end of class
