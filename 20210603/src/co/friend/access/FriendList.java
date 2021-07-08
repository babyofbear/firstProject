package co.friend.access;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import co.friend.model.Friend;

// FriendAccess 인터페이스 구현하는 객체.
// 파일에 저장.
public class FriendList implements FriendAccess {

	String path = "C:/tmp/friendList.txt";
	List<Friend> friends;

	public void open() { // 파일 열기
		File file = new File(path);

		if (!file.exists()) { // path에 해당 파일이 없으면 디렉토리/파일 생성.
			File dir = new File("c:/tmp/");
			dir.mkdirs(); // c:/tmp 디렉토리 생성.
			try {
				file.createNewFile(); // 파일 생성.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try {
			Scanner scn = new Scanner(file);
			while (true) { // 한 라인체크
				if (!scn.hasNext()) {// hasNext()엔터키 없을때 까지
					break;
				}
				String readStr = scn.next();
				String[] arr = readStr.split(","); // 라인 안의 콤마단위 체크

				Friend friend = new Friend(arr[0], arr[1], arr[2]);

//				for(int i=0; i <friends.size(); i++) {
//					if(friends[i]== null) {
//						friends[i] = friend;
//						break;
//					}
//				}
				friends.add(friend);

			}
			scn.close(); // 밑에 노란줄 없어짐. 반환해줌.
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void save() { // 파일 저장
		BufferedWriter br = null;
		try {
			br = new BufferedWriter(new FileWriter(path));
			for (int i = 0; i < friends.size(); i++) {
//				if(friends[i] !=null) { //friend[i] 일때 필요한 부분
				br.write(String.format("%s,%s,%s\n", friends.get(i).getGubun(), friends.get(i).getName(),
						friends.get(i).getTel()));

//				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // try-catch 구문 마지막에 무조건 실행하는 구문.
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public FriendList() {
		friends = new ArrayList<Friend>();
		open();
	}

	// 중복체크하는 메소드 만들어보기

	@Override
	public void insert(Friend friend) {
//		
//		for(int i=0; i <friends.size(); i++) {	
//			if(friends[i]== null) {
//				friends[i] = friend;
//				break;
//			} 
		friends.add(friend);
		save();
	}

	@Override
	public void update(Friend friend) {
		for (int i = 0; i < friends.size(); i++) {
//			if(friends[i] !=null) { //배열의 요소중에서 값이 있는 요소만 가져와서 이름끼리 비교
			if (friends.get(i).getName().equals(friends.get(i).getName())) {
				friends.add(friend);
				break;
			}
		}
		save();
	}

	@Override
	public void delete(String name) {
		for (int i = 0; i < friends.size(); i++) {
//			if(friends[i] !=null) {
			if (friends.get(i).equals(friends.get(i).getName())) {
				friends.remove(i);
				System.out.println("한 건 삭제 되었습니다.");
				break;
			}
		}
		save();
	}

	@Override
	public List<Friend> selectAll() {
		return friends;
	}

	@Override
	public Friend selectOne(String name) {
		Friend selname = null;
		for (int i = 0; i < friends.size(); i++) {
//			if(friends[i] !=null) {
			if (friends.get(i).getName().equals(name)) {
				selname = friends.get(i);
				break;
			}

		}
		return selname;
	}

	@Override
	public Friend findTel(String tel) {
		Friend findTel = null;
		for (int i = 0; i < friends.size(); i++) {
//			if(friends[i] !=null) {
			if (friends.get(i).getName().equals(tel)) {
				findTel = friends.get(i);
				break;
			}

		}
		return findTel;

	}

}
