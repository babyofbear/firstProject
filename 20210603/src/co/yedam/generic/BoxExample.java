package co.yedam.generic;

class Orange {
	int price;
}

public class BoxExample {
	//제네릭: 모든 유형의 데이터타입을 사용하는 시점에
	// 지정해서 Casting을 안하고, 타입 오류를 일으키지 않는 도구 <T>

	public static void main(String[] args) {
		Box<Integer> box = new Box<Integer>();
		box.setObj(10);
		Integer val = box.getObj();
		
//		//box.setObj(new Integer(10));
//		box.setObj(10);
//		Integer val1 = (Integer) box.getObj(); //캐스팅 할 때마다 프로그램 성능 저하.
//		
		Box<String> boxx = new Box<String>();
		boxx.setObj("10");
		String val2 = boxx.getObj();
		
		Box<Orange> box1 = new Box<Orange>();
		box1.setObj( new Orange() );
		Orange ora = box1.getObj();
		
		// Object타입은 기본데이터타입은 받을 수 없고 참조데이터타입을 받을 수 있다.
		// int(기본 데이터 타입) => Integer(클래스)
		// byte(기본 데이터 타입) => Byte(클래스)
		// double => Double
	}

}
