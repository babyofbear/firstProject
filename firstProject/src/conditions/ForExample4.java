package conditions;

public class ForExample4 {

	public static void main(String[] args) {
		whileSum();
		forSum();
	}

	public static void whileSum() {
		// 1부터 10까지 합 while 반복문으로 만들기
		int sum = 0;
		int i = 0;
		while (i < 10) {
			i++;
			if (i % 2 == 0) {//증감식이 if절 안에 들어가면 실행 값이 달라진다.
				
			sum = sum + i;
			}
			
		}System.out.println("1부터 10까지 짝수의 합: " + sum);
	}

	public static void forSum() {
		// 1부터 10까지 i 변수 활용.
		// int sum = 0;
		// 1~10까지 홀수의 합 구하는 프로그램

		int sum = 0;
		for (int i = 1; i <= 10; i++) { // for 구문 안에 sum 이 선언되는 것과
			if (i % 2 == 1) {
				// for 구문 밖에서 선언되는 것은 출력 결과가 다르다.
			sum = sum + i;
			System.out.println("sum> " + sum + ", i> " + i);
			}

		}
		System.out.println("1부터 10까지 홀수의 합: " + sum);
	}
}