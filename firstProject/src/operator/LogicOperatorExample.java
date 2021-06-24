package operator;

public class LogicOperatorExample {
	public static void main(String[] args) {
		int val1 = 9;
		
		if((val1 % 2 == 0) && (val1 % 3 == 0)) {//논리곱 && 논리합 ||
			System.out.println("2와 3의 공배수입니다.");
		} else if (val1 % 3 == 0 ) {
			System.out.println("3의 배수입니다.");
		}	else if(val1 % 2 == 0 ) {
			System.out.println("2의 배수입니다.");
			
			
		
		} if(val1 % 2 == 0 ) {
			System.out.println("짝수입니다.");
			
		} else {
			System.out.println("홀수입니다.");
		}
	}
}
