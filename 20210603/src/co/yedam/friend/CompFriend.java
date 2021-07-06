package co.yedam.friend;

public class CompFriend extends Friend{
	
	private String department;

	public CompFriend(String name, String phone, String department) {
		super(name, phone);
		this.department = department;
		
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "회사친구 [이름: " + getName() + ", 연락처: " + getPhone() + ", 부서: " + department + "]";
	}
	

}
