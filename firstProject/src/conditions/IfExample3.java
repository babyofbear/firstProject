package conditions;

import java.util.Scanner;

public class IfExample3 {
	public static void main(String[] args) {
	
		// 사용자에게 콘솔창에 값을 입력하도록 함.(1,2,3 중에 입력)
		// 1:가위 2: 바위 3:보
	
		// 임의의 수 1,2,3 을 생성.	
		int ran = (int) (Math.random()*3) + 1;
		String anyVal = "";
		if (ran == 1) {
			anyVal = "가위";
		} else if (ran ==2) {
			anyVal = "바위";
		} else if (ran ==3) {
			anyVal = "보";
		}
		
		
		/*가위바위보 게임 만들기(미완성)
		
		Scanner scanner2 = new Scanner(System.in); {
		System.out.println("묵지빠 게임하기 1.묵 2.찌 3.빠 선택하세요.");
		}
		String name2 = scanner2.nextLine(); {
		System.out.println("선택값: " + name2);
		}
		*/
		// 사용자에게 콘솔창에 값을 입력하도록 함.(1,2,3 중에 입력)
	
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("컴퓨터와 가위바위보 게임을 합니다.");
		String name = scanner1.nextLine();
		System.out.println("입력값: " + name);
		
		if ("가위".equals(name)) {
			System.out.println("맞습니다.");
		} else {
			System.out.println("다릅니다.");
		}
		int val = (int) (Math.random()*3) + 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1,2,3 중에서 숫자를 입력하세요.");
		
		int score = scanner.nextInt();
		System.out.println("입력값: " + score);
	
		// 임의의 값 = 사용자 입력 값(같습니다. 다릅니다 출력)	
		
		if(anyVal.equals(val) ) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}

	}//end of main()

}//end of class
