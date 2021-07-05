package co.yedam.inheritance;

public class StudentExample {

	public static void main(String[] args) {
		Student std = new Student() ;
		std.setName("학생1");
		std.setStudNo(100);
		
		HighStudent highStd = new HighStudent();
		highStd.setName("고등학생1"); //부모 클래스의 모든 것을 사용 가능 set. 기능 사용 가능
		highStd.setStudNo(1001);
		highStd.setSchoolName("성서고등학교");
		

	}

}
