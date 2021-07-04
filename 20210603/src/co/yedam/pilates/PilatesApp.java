package co.yedam.pilates;

import java.util.Scanner;

public class PilatesApp { // 클래스 영역
	
	private static PilatesApp singleton = new PilatesApp();
	
	private PilatesApp() {		
	}
	
	public static PilatesApp getInstance() {
		return singleton;
	}
	
	Member[] members = new Member[10]; // 필드에서 변수 선언
	Scanner scn = new Scanner(System.in); // 필드에서 변수 선언

	public void main() {// 메인 메소드
		members = new Member[] { //
				new Member(1, "김먼지", "01012345678", "990807", Gender.MEN),
				new Member(2, "박홍시", "01067789045", "930502", Gender.MEN),
				new Member(3, "서토무", "01056346788", "920303", Gender.WOMEN),
				new Member(4, "구제리", "01056433565", "920305", Gender.WOMEN) };
		
		// 1.입력 2.수정 3.삭제 4.회원리스트 5.이름조회 6.상세조회 0.종료
		// 6.상세조회 4번의 회원리스트와는 다름
		while (true) {
			showMenu();
			int menu = scn.nextInt(); // 숫자만 입력 가능
			// scn.nextLine(); // 글자 입력 가능

			if (menu == 1) {
				memberAdd();
			} else if (menu == 2) {
				changeId();
				// 회원 id 불변
				// 이름을 바꾸겠습니까?
				// 값을 넣고 enter 하면 바뀜
				// 모두 문자로 취급 .equals null

			} else if (menu == 3) { // 삭제
				memberDelete(); // member[0] = null; 이런 상태로 만들어 주는 것
			} else if (menu == 4) { // 회원리스트
				memberList();
			} else if (menu == 5) { // 이름조회
				searchByName();
			} else if (menu == 6) { // 상세조회
				detailmember();
			} else if (menu == 0) { // 종료

				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
		}

	}// end of main

//	public int scanInt(String arg) { // 입력 메세지 출력 후 int(숫자) 반환
//		int val = 0;
//		while (true) {
//			try {
//				System.out.println("삭제할 회원 번호를 입력>>>");
//				val = scn.nextInt();
//				System.out.println("1건 삭제되었습니다.");
//				break;
//			} catch (Exception e) {
//
//			}
//		}
//		return val;
//	}

	// 3.회원 삭제
	public void memberDelete() {
		int delId = scanInt("삭제할 회원 번호를 입력>>>");
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null && members[i].getMemberId() == delId) {
				members[i] = null;
				break;
			}
		}
	}

	// 5.이름조회
	public void searchByName() {
		String name = scanString("조회할 이름을 입력하세요>>>  ");
		boolean exist = false; // 이름 조회
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null && members[i].getMemberName().equals(name)) {
				System.out.println(members[i].showInfo());
				exist = true;
			}
		}
		if (!exist) {
			System.out.println("해당 이름이 없습니다.");
		}
	}

	// 회원 id 불변
	// 이름을 바꾸겠습니까?
	// 값을 넣고 enter 하면 바뀜
	// 모두 문자로 취급 .equals null

	// 수정메뉴
//	1.회원번호 입력 0
//	2.회원번호 찾기 0
//		2-2 회원번호 없을경우 체크
//	3.회원번호와 입력값 비교
//	4.있으면 회원정보 내용 출력 - 수정값 받기
//	4-1 수정값이 있으면 회원정보 변경

	// 2.수정
	public void changeId() {
		int changeId = scanInt("수정할 회원번호 입력하세요>>>  ");
		boolean exist = false; // 회원번호 조회
		for (int i = 0; i < members.length; i++) {
			if (changeId != 0 && changeId == members[i].getMemberId()) {

				String name = scanString("이름을 입력>>>");
				String phone = scanString("연락처 입력>>>");
				String birth = scanString("생일을 입력>>>");
				Gender gender = scanGen("성별을 입력(1:남, 2:여)>>>");
				if (name != null) {
					members[i].setMemberName(name);
				}
				if (phone != null) {
					members[i].setMemberName(phone);
				}
				if (birth != null) {
					members[i].setMemberName(birth);
				}
//				if (gender != null) {
//					Gender memberGen(gender);
//				}
				exist = true;
			}

		}
		if (!exist) {
			System.out.println("해당 회원이 없습니다.");
		}
		System.out.println("회원정보가 수정되었습니다.");
	}

	// 4. 회원리스트
	public void memberList() {
		for (int i = 0; i < members.length; i++) {
			// members[i] = showInfo(i);
			System.out.println(members[i].showInfo());
		}
	}

	// 6.상세조회
	public void detailmember() {
		int detailmember = scanInt("상세 조회할 회원번호 입력하세요>>>  ");
		for (int i = 0; i < members.length; i++) {
			if (detailmember == members[i].getMemberId()) {

			}

			System.out.println(members[i].showInfo1());
		}
	}

	public void memberAdd() {
		String name = scanString("이름을 입력>>>");
		String phone = scanString("연락처 입력>>>");
		String birth = scanString("생일을 입력>>>");
		Gender gender = scanGen("성별을 입력(1:남, 2:여)>>>");

		Member member = new Member(getNextId(), name, phone, birth, gender);

		for (int i = 0; i < members.length; i++) {
			if (members[i] == null) { // 입력시 비어 있는 곳에 입력. 덮어쓰기 방지
				members[i] = member;
				break; // 비어있는 위치에 한 건 있는 입력 후 종료
			}
		}

	}

	public String scanString(String arg) { // 입력 메세지 출력 후 문자 입력값을 반환
		System.out.print(arg);
		String val = scn.next();
		return val;
	}

//	public int scan(String arg) { // 입력 메세지 출력 후 문자 입력값을 반환
//		System.out.print(arg);
//		int val = scn.next();
//		return val;
//	}
	
	
	
	public Gender scanGen(String arg) { // 입력 메세지 출력 후 젠더 반환

		Gender gender = null;
		while (true) {

			try { // try catch 구문, 에러 발생시 다시 입력 메세지 반복
				System.out.println("성별을 입력(1:남, 2:여)>>>");
				int gen = scn.nextInt(); // 숫자만 입력가능.
				if (gen == 1) {
					gender = Gender.MEN;
				} else if (gen == 2) {
					gender = Gender.WOMEN;
				} else {
					System.out.println("1 또는 2를 입력하세요.");
					continue; // 못 빠져나오게 계속 돌게 나옴, 반복문 탈출 못하게 함
				}
				break; // 정상 입력시 탈출
			} catch (Exception e) {
				System.out.println("숫자를 입력하세요.");
				scn.next();
			}
		}
		return gender;
	}

	public void showMenu() {
		System.out.println("---------------------------------------------------");
		System.out.println("1.입력 2.수정 3.삭제 4.회원리스트 5.이름조회 6.상세조회   0.종료");
		System.out.println("---------------------------------------------------");
		System.out.println("선택>>>>>>");

	}

	public int getNextId() { // 회원번호 가입순번 ==> 1, 2, 3 , 5, 6 ,7 ,
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
