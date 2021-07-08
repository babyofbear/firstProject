package co.yedam.generic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> names = new HashSet<String>();
		names.add("박지현");
		names.add("박현진");

		System.out.println("크기: " + names.size());

		Iterator<String> iter = names.iterator(); // 반복자를 생성해주는 메소드.
		while (iter.hasNext()) {
			String val = iter.next();
			System.out.println("값: " + val);
		}
		System.out.println("========================");
		names.add("안의정"); // "안의정" vs new String("안의정") 동일한 값으로 인식
		names.add(new String("안의정")); // 중복된 값은 하나의 값으로 인식.
		names.add("최예원");
		names.add("은영빈");
		iter = names.iterator();
		while (iter.hasNext()) {
			String val = iter.next();
			System.out.println("값: " + val);
		}
		System.out.println("크기: " + names.size());
		System.out.println("프로그램 종료.");
	}

}
