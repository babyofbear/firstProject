package co.yedam.exercise;

public class Employee {
	// 이름
	// 부서
	// 사원.
	// 이메일
	// 급여
	
	private String empName;
	private int empNum;
	private String empDep;
	private String empMail;
	private int empSal;
	
	public Employee(String empName, int empNum, String empMail) {
		super();
		this.empName = empName;
		this.empNum = empNum;
		this.empMail = empMail;
	}
	
	
	public Employee(String empName, int empNum, String empDep, String empMail, int empSal) {
		super();
		this.empName = empName;
		this.empNum = empNum;
		this.empDep = empDep;
		this.empMail = empMail;
		this.empSal = empSal;
	}


	public Employee() {
		super();
	}


	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpNum() {
		return empNum;
	}
	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}
	public String getEmpDep() {
		return empDep;
	}
	public void setEmpDep(String empDep) {
		this.empDep = empDep;
	}
	public String getEmpMail() {
		return empMail;
	}
	public void setEmpMail(String empMail) {
		this.empMail = empMail;
	}
	public int getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	public String showInfo() {

		String info = "사원번호: " + this.empNum + "이름: " + this.empName + " 이메일: "
				+ this.empMail;
		return info;
		
	}
}
