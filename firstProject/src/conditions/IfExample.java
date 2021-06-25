package conditions;

public class IfExample {

	public static void main(String[] args) {
		System.out.println((int)(Math.random()*6)+1);// 1부터 6사이 랜덤의 더블 타입 수 만들어 줌
		int ran = (int) (Math.random()*6)+1;
		if(ran ==1) {
			System.out.println("1번이 나왔습니다.");
		} else if (ran == 2) {
			System.out.println("2번이 나왔습니다.");
		} else if (ran == 3) {
			System.out.println("3번이 나왔습니다.");
		} else if (ran == 4) {
			System.out.println("4번이 나왔습니다.");
		} else if (ran == 5) {
			System.out.println("5번이 나왔습니다.");
		} else if (ran == 6) {
			System.out.println("6번이 나왔습니다.");
	    }

		
		// 1~ 100 까지의 임의의 수.
		// score ==> 변수에 담아서 80점대 B학점입니다. 90점대 A학점입니다.
		
		
	
			int score = (int) (Math.random()*100)+1;
			if(score >=90) {
				//90점 이상 A학점
				if(score >=95) {
					System.out.println("A+");
				} else {
					System.out.println("A학점");
				}
			} else if (score >= 80 ) {
				if(score >= 85) {
					System.out.println("B+");
				} else {
					System.out.println("B학점");
				}	
			} else if (score >= 70 ) {
				if(score >= 75) {
					System.out.println("C+");
				} else {
					System.out.println("C학점");
				}
			} else if (score >= 60 ) {
				if(score >= 65) {
					System.out.println("D+");
				} else {
					System.out.println("D학점");
				}	
			} else {
				System.out.println("F학점");
			} 
			
				
			}//end of main()
   }//

