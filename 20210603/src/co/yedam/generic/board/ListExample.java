package co.yedam.generic.board;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ListExample {
	public static void main(String[] args) {
		Board b1 = new Board("이것이 자바다", "자바가 어렵네요.");
		Board b2 = new Board("자바의 국적은?", "칠레인가요.자메이카인가요.");
		Board b3 = new Board("장마", "삼일째 비가옵니다.");
		
		BoardDAO dao = new BoardDAO();
		dao.insertBoard(b1);
		dao.insertBoard(b2);
		dao.insertBoard(b3);
		
		Map<String,String> map = dao.getBoards();
		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator();
		
		System.out.println("    <Map으로 가져온 리스트>   ");
		while (iter.hasNext()) {
			String key = iter.next();
			System.out.println("제목: "+key+", 내용: "+ map.get(key));
		}
		
		ArrayList<Board> list = dao.getBoardList();
		for(Board board : list) {
			System.out.println(board.toString());
		}
		
		Scanner scn = new Scanner(System.in);
		System.out.println("수정할 글 제목을 입력: ");
		String search = scn.nextLine();
		System.out.println("변경할 내용을 입력하세요.");
		String changeContent = scn.nextLine();
		Board arg = new Board(search, changeContent);
		
//		dao.updateBoard(search, changeContent); 
		dao.updateBoard(arg);
		
		list = dao.getBoardList();
		for(Board board : list) {
			System.out.println("    <List으로 가져온 리스트>   ");
			System.out.println(board.toString());
		}
	}

}
