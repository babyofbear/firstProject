package co.friend.view;

import java.util.List;

import co.friend.access.FriendAccess;
import co.friend.access.FriendList;
import co.friend.common.ScannerUtil;
import co.friend.model.Friend;

// 화면에 정보를 보여주고 사용자의 입력에 따라서 처리해줘야함.

public class FriendCliApp {

	FriendAccess service = new FriendList();

	public void start() {
		// 1.입력 2.수정 3.삭제 4.리스트 5.이름조회 6.전화번호조회 9.종료
		int menu = 0;
		do {
			menuTitle();
			menu = ScannerUtil.readInt("선택> ");

			switch (menu) {
			case 1: // 입력
				insert();
				break;
			case 2: // 수정
				update();
				break;
			case 3: // 삭제
				delete();
				break;
			case 4: // 리스트
				list();
				// for(int i=0; i <friends.length; i++) {

				// }
				break;
			case 5: // 이름조회
				searchName();
				break;
			case 6: // 전번조회
				findTel();
				break;
			}
		} while (menu != 9);
	}

	public void insert() { // 1.친구추가
		Friend friend = ScannerUtil.readFriend();
		service.insert(friend);
	}

	public void update() {
		// 이름입력>
		// 연락처입력>
		String name = ScannerUtil.readString("이름입력> ");
		String tel = ScannerUtil.readString("연락처입력>");
		Friend friend = new Friend("", name, tel);
		service.update(friend);

	}

	public void delete() { // 이름으로 찾아와서 똑같은 이름은 배열에서 삭제
		String name = ScannerUtil.readString("이름입력> ");
		service.delete(name);
	}

	public void list() {
		List<Friend> friendList = service.selectAll();
		for (Friend friend : friendList) {
			if (friend != null) {
				System.out.println(friend.toString());
			
			}
		}
	}

	public void searchName() {
		String name = ScannerUtil.readString("이름입력> ");
		Friend onename = service.selectOne(name);
		System.out.println("친구구분: "+onename.getGubun()+"친구이름: "+onename.getName()+"친구전번: "+onename.getTel());
	}

	public void findTel() {
		String name = ScannerUtil.readString("이름입력> ");
		Friend findName = service.findTel(name);
		System.out.println("친구구분: "+findName.getGubun()+"친구이름: "+findName.getName()+"친구전번: "+findName.getTel());
	}

	public void menuTitle() {
		System.out.println("<====  친 구 관 리 ====>");
		System.out.println("----- 1. 친구추가 -----");
		System.out.println("----- 2. 친구수정 -----");
		System.out.println("----- 3. 친구삭제 -----");
		System.out.println("----- 4. 전체조회 -----");
		System.out.println("----- 5. 이름조회 -----");
		System.out.println("----- 6. 전번조회 -----");
		System.out.println("----- 9. 종  료  -----");

	}

}// end of main
