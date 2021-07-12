package co.yedam.lambda;

@FunctionalInterface //메소드 하나만 있는 것.
interface Runnable { //인터페이스틑 '기능'만 부여함, 람다식은 구현해야할 메소드가 하나만 있는 인터페이스
	String run(String name);
	//void swim();
}

class RunClass implements Runnable {

	@Override
	public String run(String name) {
		System.out.println(name +"가 달립니다."); // 인터페이스의 기능
		return name + " 화이팅!!";
	}
}

//class RunClass1 implements Runnable {
//
//	@Override
//	public void run() {
//		System.out.println("영희가 달립니다."); // 인터페이스의 기능
//	}
//}

public class FunctionExample {

	public static void main(String[] args) {
		Runnable runnable = new RunClass(); // 인터페이스 실행
		String result = runnable.run("철수");
		System.out.println(result);
		
		runnable = new Runnable() {
			@Override
			public String run(String name) {
				System.out.println(name+"가 달립니다.");
				return null;
			}// 익명구현객체 : new 인터페이스 () {}
		};
		result = runnable.run("영희");
		System.out.println(result);
		
		//람다표현식.
		runnable = (String name) -> {System.out.println(name+"가 달립니다.");
		return name + "화이팅!!";	
		};
		
//		runnable = new RunClass1(); // 인터페이스 실행
//		runnable.run();

	}

}
