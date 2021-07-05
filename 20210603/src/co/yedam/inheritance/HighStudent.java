package co.yedam.inheritance;

public class HighStudent extends Student { //Student(부모)클래스를 상속받는 HighStudent(하위)클래스
		private String schoolName;   	// 부모클래스가 가지고 있는 멤버를 하위 클래스가 가지게 됨

		public String getSchoolName() {
			return schoolName;
		}
		
		public void setSchoolName(String schoolName) {//부모가 가진 메소드 이외 자기가 
														//가진 메소드를 따로 사용할 수 있다.
			this.schoolName = schoolName;
		}
}
