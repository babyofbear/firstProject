package co.yedam.pilates;

public class Main {
	public static void main(String[] args) {
		
		PilatesApp app = PilatesApp.getInstance();
		app.main();
		
		PilatesApp app2 = PilatesApp.getInstance();
		//app2.main();
		
		// 메모리 절약하는 법 두개의 인스턴스가 같은 주소를 가지고 있다 교재 234페이지
		System.out.println(app == app2);
	}

}
