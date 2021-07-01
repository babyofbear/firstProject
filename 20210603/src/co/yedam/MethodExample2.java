package co.yedam;

public class MethodExample2 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("홍길동");

		String name = p1.getName();

		int n1 = p1.getSum(10, 20);
		int n2 = p1.getSum(5, 5);
		int result = p1.getSum(n1, n2);

		System.out.println("결과 : " + result);

		String info = p1.getInfo();// return 타입이 string 이다, showinfo는
									// 반환 타입이 없다.

		// 10~20 사이의 임의의 값을 생성해주는 매소드
		//n1 = p1.getFrom10To20;
		//System.out.println("10~20 : " + n1);

		n2 = p1.getFromto(10, 30);
		System.out.println("10~30 :" + n2);

		String text = p1.getNameAndAge("홍길동", 20);
		System.out.println(text);

		Person newPerson = p1.createNewPerson("오혜지", 20);
		newPerson.setHeight(167.8);
		newPerson.setBloodType("O");
		System.out.println(newPerson.getInfo());
		
		// 이름 나이 키 나오는 메소드 문자 인트 더블형 만들기
		Person anotherPerson = p1.createNewPerson("권가람", 22, 165.5);
		newPerson.setName("권가람");
		newPerson.setHeight(167.8);
		newPerson.setBloodType("O");
		System.out.println(newPerson.getInfo());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
