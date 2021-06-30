package reference;

public class PersonExample {

	public static void main(String[] args) {
		Person hgd = new Person(); // 실제 존재를 만드는 거 : 인스턴스화 (개체)
		hgd.name = "홍길동";
		hgd.age = 20;
		hgd.height = 167.4;
		hgd.weight = 50;
		// hgd.birth = "20100101";
		
		hgd.walk();
		hgd.sleep();
		hgd.showInfo();
		
		
//		Person psy = null;
//		psy.walk();
//		

	}

}
