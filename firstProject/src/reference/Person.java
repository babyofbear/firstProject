package reference;
// 현실 셰계의 사람(Object)=> 필드, 메소드
public class Person {
	//필드선언.
	int age; //나이
	String name; //이름
	double height; //키
	double weight; //몸무게
	Person p1 = new Person();
	
	//메소드 선언.
	void walk( ) {
		System.out.println("걷습니다.");
	}
	
	void sleep() {
		System.out.println("잠을 잡니다.");
	}
	
	void showInfo() {
		System.out.println("이름은 " + name + " 이고 나이는 "  + age  + "세 입니다.");
	}
	
	public int getSum(int n1, int n2) {
		return n1 + n2;
	}
	
	public int getFrom10To20() {
		return (int) (Math.random() * 10) + 10;
	}
	  
	public int getFrom10To20(int n1, int n2) {
		return (int) (Math.random() * (n2 - n1)) + n1;			
		
	}	
	// 매개값으로 문자(이름), 숫자(나이) => 제 이름은 **이고 나이는 **입니다.
	// 문자열을 리턴해주는 메소드 이름을 
	// getNameAndAge() 만들기
		
	public String getNameAndAge(String name1, int age1) {
		return "제 이름은 " + name1 + "이고 " + "나이는 " + age1 + "세 입니다.";
		
	
	}
}
