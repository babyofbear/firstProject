package co.yedam.generic.board;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BoardDAO {
	ArrayList<Board> list = new ArrayList<Board>();
	
	public Map<String, String> getBoards() {
		Map<String, String> map = new HashMap<>();
		
		for(Board board : list) { // list컬렉션 들어있는 만큼 루핑 돌겠다.
			map.put(board.getTitle(), board.getContent());
			
		}
		
		return map;
	}
	
	public ArrayList<Board> getBoardList() {
		
		return list;
	}
	
	public void insertBoard(Board board) {
		list.add(board); //for구문 사용 필요없이 마지막에 순서대로 하나씩 추가됨
	}
	
	public void updateBoard(String arg1, String arg2) { //변수를 두 개로 선언
		for( int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(arg1)) {
				list.get(i).setContent(arg2); //변경
				break;
			}
		}
	}
	
	public void updateBoard(Board board) { // 변수를 하나로 선언
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(board.getTitle())) {
				list.get(i).setContent(board.getContent());
				break;
			}
		}
	}

}
