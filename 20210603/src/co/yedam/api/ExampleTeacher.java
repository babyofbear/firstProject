package co.yedam.api;

import java.text.MessageFormat;

public class ExampleTeacher {

	public static void main(String[] args) {
		String data = "회원 ID: {0} \n회원 이름: {1} \n회원 전화: {2}";
		System.out.println(MessageFormat.format(data, "123", "홍길동","1234-5678"));
		
		System.out.println("========================");
		System.out.format("회원 ID: %s \n회원 이름: %s \n회원 전화: %s", "123","홍길동","1234-5678");
	}

}
