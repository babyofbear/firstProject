package co.yedam.modifier;
class Teacher {
	private String name;
	private String major;
	
	Teacher() {
		//default 생성자
	}
	
	String getName() {
		return name;
	}
}

public class Student {
	private String name;
	private String major;
	private int grade;
	
	private Student() {
		// private 생성자, 다른 클래스에서 사용 불가, 같은 패키지라도 사용불가
	}
	protected Student(String name) {
		//default 생성자
		this.name = name;
	}
	
	public Student(String name, String major) {
		//public 생성자
		this.name = name;
		this.major = major;
	}
}
