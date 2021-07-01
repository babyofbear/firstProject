package co.yedam;

public class Person {
	// 이름, 나이, 키, 혈액형, 필드 선언
	private String name;
	private int age;
	private double height;
	private String bloodType;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getBloodType() {
		return bloodType;
	}
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public void showInfo() {
		System.out.println("[이름: " + this.name + " 나이: " + this.age + " 키: " + " 혈액형: " + this.bloodType + "]");
		
	}
	
	public String getInfo() {
		return "{이름: " + this.name + " 나이: " + this.age + " 키: " + " 혈액형: " + this.bloodType + "}";
	}
	
	public int getFromto(int n1, int n2) {
		return (int) (Math.random() * (n2-n1)*n1);
	}
	
	public int getFrom10to20(int n1, int n2) {
		return (int) (Math.random() * (n2-n1)*n1);
	}
		
	public int getSum(int n1, int n2) {
			return n1 + n2;
			
		
		
	}// n1과 n2사이의 랜덤인 정수 만들기
	
	
	// 매개값으로 문자(이름), 숫자(나이) => 제 이름은 **이고 나이는 **입니다.
	// 문자열을 리턴해주는 메소드 이름을 
	// getNameAndAge() 만들기
		
	public String getNameAndAge(String name1, int age1) {
		return "제 이름은 " + name1 + "이고 " + "나이는 " + age1 + "세 입니다.";
		
	}
	
	public Person createNewPerson(String name, int age) {
		Person psn = new Person();
		psn.setName(name);
		psn.setAge(age);
		return psn;
	}
	public Person createNewPerson(String name, int age, double height) {
		anotherPerson psn = new Person();
		psn.setName(name);
		psn.setAge(age);
		psn.setHeight(height);
		return psn;
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}