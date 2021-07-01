package co.yedam;

public class StudentExample {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();

		s1.setName("홍길동");
		s1.setGrade(1);
		s1.setEngscr(85);
		s1.setMathscr(90);

		s2.setName("신데렐라");
		s2.setGrade(1);
		s2.setEngscr(75);
		s2.setMathscr(96);

		s3.setName("백설공주");
		s3.setGrade(1);
		s3.setEngscr(55);
		s3.setMathscr(66);

		Student[] students = { s1, s2, s3 };
		int maxValue = 0;
		
		Student maxStudent = null; //영어 최고 점수 학생 모든 정보 담아둠
		
		// 영어 수학 합한 점수 가장 높은 사람 찾기
		int sum = 0;
		for (int i = 0; i < students.length; i++) {
			if (maxValue<(students[i].getEngscr() + students[i].getMathscr()));
		}
		
		String name = "";// 최고 영어 점수 학생 이름 
		
		
		for (int i = 0; i < students.length; i++) {
			if (maxValue < students[i].getEngscr()) {
				maxValue = students[i].getEngscr();
				name = students[i].getName();
				//maxStudent = students[i];  필요없는 구문??
			}
			
		}
		System.out.println("영어 최고 점수는 " + maxValue + "점 "   + name + " 학생 입니다.");
		
	}

}
