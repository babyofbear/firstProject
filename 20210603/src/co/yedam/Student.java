package co.yedam;

public class Student {
	// 이름, 학년, 영어점수, 수학점수
	private String name;
	private int grade;
	private int engscr;
	private int mathscr;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getEngscr() {
		return engscr;
	}
	public void setEngscr(int engscr) {
		this.engscr = engscr;
	}
	public int getMathscr() {
		return mathscr;
	}
	public void setMathscr(int mathscr) {
		this.mathscr = mathscr;
	}
	
	public void showInfo() {
		System.out.println("[이름: " + this.name +  this.grade +" 학년: " +  " 영어점수: " + this.engscr + " 수학점수: " + this.mathscr + "]");
	}
	
	public void showInfo2() {
		System.out.println("[최고의 영어 점수는 " + this.name +   "의 " + this.engscr +  "점 입니다.]");
	}

}
