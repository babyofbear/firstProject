package co.yedam.inheritance;

public class Student {//(extends Object){ 기본적으로 모든 클래스는 Object 클래스를 상속받는다.
	//필드 두 개.
	private String name;
	private int studNo;
	
	//생성자.
	public Student() {
		System.out.println("Student() call.");
	}
	
	
	public Student(String name, int studNo) {
		super(); //상속 받는 부모가 없는데?? super가 있다?? => 모든 클래스의 최상위 클래스는 Object라는 클래스를 가지고 있다.
		this.name = name;
		this.studNo = studNo;
	}


	//메소드.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudNo() {
		return studNo;
	}
	public void setStudNo(int studNo) {
		this.studNo = studNo;
	}
	
	public void showInfo() {
		System.out.println("이름은 "+name+"학생 번호는 "+studNo);
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", studNo=" + studNo + "]";
//		return super.toString(); //부모 클래스가 가지고 있는 주소 호출 (co.yedam.inheritance.Student@73a28541)
	}
	
	
}//end of class
