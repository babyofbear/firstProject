package co.yedam.inheritance;

public class HighStudent extends Student { //Student(부모)클래스를 상속받는 HighStudent(하위)클래스
		//필드.
		private String schoolName;   	// 부모클래스가 가지고 있는 멤버를 하위 클래스가 가지게 됨
		
		// 생성자.
		public HighStudent() {
			super();//부모클래스 중에서 (this 자기자신) default로 만들어짐. 실행하면 부모클래스
					//실행하고 자식 클래스 실행하게 됨.
			System.out.println("HighStudent()");
		}
		
		
		
		public HighStudent(String name, int studNo, String schoolName) {
			super(name, studNo); //super() : Student 클래스의 기본 생성자를 받는 생성자.
			
			this.schoolName = schoolName;
		}



		// 메소드.
		public String getSchoolName() {
			return schoolName;
		}
		
		public void setSchoolName(String schoolName) {//부모가 가진 메소드 이외 자기가 
														//가진 메소드를 따로 사용할 수 있다.
			this.schoolName = schoolName;
		}

		public void showInfo() {
			System.out.println("이름은 "+getName()+"학생 번호는 "+getStudNo()+"학교이름은 "+schoolName);
		}

		@Override
		public String toString() {
			return "HighStudent [getName()=" + getName() + ", getStudNo()=" + getStudNo() + ", schoolName=" + schoolName
					+ "]";
		}



		
		



		

		

		
}
