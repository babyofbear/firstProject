package co.yedam.friend;

public class UnivFriend extends Friend {
	//필드
	private String major;
	
	//생성자
	public UnivFriend(String name, String phone, String major) {
		super(name, phone);
		this.major = major;
	
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "대학친구 [이름: " + getName() + ", 연락처: " + getPhone() + ", 전공: " + major + "]";
	}
	
	

	
	
	

}
