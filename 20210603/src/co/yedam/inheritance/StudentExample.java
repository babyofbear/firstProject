package co.yedam.inheritance;

public class StudentExample {

	public static void main(String[] args) {
		Student std = new Student() ; //부모 클래스
		std.setName("학생1");
		std.setStudNo(100);
//		System.out.println("Student: " + std.getName()+ ","+std.getStudNo());
		
		HighStudent highStd = new HighStudent(); //자식 클래스
		highStd.setName("고등학생1"); //부모 클래스의 모든 것을 사용 가능 set. 기능 사용 가능
		highStd.setStudNo(1001);
		highStd.setSchoolName("성서고등학교");
//		System.out.println("HighStudent: " + highStd.getName() +","+highStd.getStudNo()+","+highStd.getSchoolName());
		
		Student[] students = new Student[3] ;
		students[0]= std;
		students[1]= highStd;
		
		
		students[0].getName();
		students[0].getStudNo();
		if(students[0] instanceof HighStudent) { //instanceof 인스턴스 여부 확인( students[0]의 인스턴스가 HighStudent의 인스턴스 인지 확인)
			HighStudent hsx = (HighStudent) students[0];
			hsx.getSchoolName();
		}
		students[0].showInfo();
		System.out.println(students[0]);
		
		students[1].getName();
		students[1].getStudNo();
	//	students[1].getSchoolName()
		if(students[0] instanceof HighStudent) {
			HighStudent hs = (HighStudent) students[1]; //강제 형변환
			hs.getSchoolName();
		}
		students[1].showInfo();
		System.out.println(students[1].toString());
		
		
		
		
		
//		int <-- byte; 작은 것은 큰 것으로 형변환 가능
//		byte<-- (byte) int 강제 형변환 캐스팅

	}//end of main

}//end of class
