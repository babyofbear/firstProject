package co.yedam.common;

import co.yedam.modifier.Student;

public class HighStudent extends Student { //패키지가 다르지만 상속의 관계가 되면서 protected로 선언되면 접근가능
	
	HighStudent(String name) {
		super(name);
	}

}
