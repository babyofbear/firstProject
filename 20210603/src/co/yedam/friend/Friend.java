package co.yedam.friend;

public class Friend {
	//필드
	private String name;
	private String phone;
	
	//생성자
	public Friend(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	//메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "동네친구 [이름 : " + name + ", 연락처: " + phone + "]";
	}
	
	
	
}
