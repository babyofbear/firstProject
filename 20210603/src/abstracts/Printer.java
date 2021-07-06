package abstracts;

//추상클래스. 직접 생성자를 호출해서 인스턴스를 만들지는 못함.
// 상속을 위해서 존재하고 상속을 통해서 인스턴스를 만듦.
// 자식 클래스에서 반드시 구현되어야 하는 추상 메소드.
public abstract class Printer {
	private String modelName;
	
	public Printer() {
		
	}
	
	public Printer(String modelName) {
		this.modelName = modelName;
	}

	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
	public abstract void printing(); //추상메소드. 기능 구현 안된 추상 메소드
}
