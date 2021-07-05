package co.yedam.account;

// 실행클래스(main)
public class Main {
	public static void main(String[] args) {
		//AccountApp app = new AccountApp() ;//기본 생성자
		//AccountApp app = AccountApp.app;
		AccountApp app = AccountApp.getInstance();
		app.exe();
		// AccountApp.getInstance().exe();//위의 두 줄의 의미를 한 줄로 표현한 것과 같음
		
		
	}

}
