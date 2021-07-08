package co.yedam.generic;

import java.util.ArrayList;
import java.util.List;
// List 컬렉션 : 배열처럼 여러 인스턴스를 저장.
public class BoxExample2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); 
		//List 인터페이스, ArrayList는 List를 구현하는 class
		list.add("Hello");
//		list.add(10);			컴파일 단계에서 에러 발생.
//		list.add(new Orange());
		
		for(int i = 0; i<list.size(); i++) {
			String val = list.get(i); //list[i] 배열처럼 안써도 됨.
			System.out.println(val);
		}
		
		String[] names = new String[10];
		for(int i=0; i<names.length; i++) {
			names[i] = new String(""+i);
		}
		//컬렉션은 크기가 배열과는 다르게 가변적이다.
		
		for(int i=0; i<100; i++) {
			list.add(new String(""+i));
		}
	}

}
