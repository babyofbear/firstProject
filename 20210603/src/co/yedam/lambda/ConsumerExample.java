package co.yedam.lambda;

import java.util.function.Consumer;
//java.util.function 패키지에 함수적인터페이스 유형별 정의.
//Consumer : 매개값은 있음, 반환값은 없음.

public class ConsumerExample {
	public static void main(String[] args) { //매개값은 있는데 리턴값은 없는 유형.
		Consumer<String> con = (t) -> {
				System.out.println(t);
			}
		;
		con.accept("이것이 자바다!!");
	}
}
