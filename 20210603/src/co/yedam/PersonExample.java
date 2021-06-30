package co.yedam;

public class PersonExample {

	public static void main(String[] args) {
		int num1 = 10;
		Person p1 = new Person(); // 이름, 나이, 키, 혈액형 모두 넣을 수 있음. 초기값은 null
		p1.setName("홍길동");
		p1.setAge(20);
		p1.setHeight(175.5);
		p1.setBloodType("O");
		// p1.name = "박길동"; //p1의 값을 바꾸는 것

		Person p2 = new Person();
		p2.setName("박길동");
		p2.setAge(35);
		p2.setHeight(181.5);
		p2.setBloodType("AB");

		Person[] persons = { p1, p2 };
		// 새로운 인스턴스(사람) 선언, 본인 정보 담아서 추가하기
		Person p3 = new Person();
		p3.setName("안의정");
		p3.setAge(43);
		p3.setHeight(162.5);
		p3.setBloodType("A");

		persons = new Person[] { p1, p2, p3 };
		// persons = new Persons[] { p1, p2, p3 };
		// 혈액형이 A인 사람만 조회

		for (int i = 0; i < persons.length; i++) {
			if (persons[i].getAge() >= 25);
				//persons[i].showInfo();
				System.out.println(persons[i].getInfo());
			{
				

				// System.out.println(p1.name + "," + p1.age + "," + p1.height );

			}
		}
	}
}