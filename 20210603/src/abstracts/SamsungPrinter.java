package abstracts;

public class SamsungPrinter extends Printer {

	public SamsungPrinter(String modelName) {
		super(modelName);
	}
	
	@Override
	public void printing() { //자식 메소드에서 추상메소드를 반드시 구현하게 만든다.
		System.out.println("삼성프린터를 출력합니다.");
		
	}

}
