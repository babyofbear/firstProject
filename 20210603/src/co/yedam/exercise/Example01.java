package co.yedam.exercise;

public class Example01 {
	public static void main(String[] args) {
		// e1 : 사원번호, 이름: 박주현, 이메일 : pjh@email.com
		// 급여 : 4500000 , 부서: 개발부
		
		// e1.showInfo(); // 사원번호: 1234 이름: 박주현 이메일 : pjh@email.com
		
//		private String empName;
//		private int empNum;
//		private String empDep;
//		private String empMail;
//		private String empSal;
		
			Employee e1 = new Employee("박주현",1234, "pjh@email.co");
					
			Employee e2 = new Employee();
				
		
		
		
		// e2 : 사원번호:1235, 이름 : 홍미림, 이메일: hmr@email.com
		// e2 = new Employee(1235, "홍미림", " hmr@email.com") source 생성자 만들기
		// e2 showInfo
		
		// 배열 : employees (5)
		// 첫번째위치:e1 두번째위치:e2 
		//세번째위치: new Employee(1236,"임효인", "lhi@@email.com, 5000000, "총무부" 
			
		//배열의 각 요소값을 출력하시오.
		Employee[] empAry = new Employee[5];
		empAry[0] = e1;
		empAry[1] = e2;
		empAry[3] = new Employee("임효인",1236, "총무부", "lhi@@email.com", 5000000);
		
		
		//for문 돌려서 showinfo로 정보 출력
	}
	

}
