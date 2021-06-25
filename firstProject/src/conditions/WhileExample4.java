package conditions;

public class WhileExample4 {
	public static void main(String[] args) {
		// 1~50 까지 수 중에서 2 또는 3의 배수의 합
		// while 구문 사용.
		int sum = 0;
		int i = 0;
		while (i <= 50) {
			if (i % 2 == 0 || i % 3 == 0) {
				sum = sum + i;
			}
			i++;
		}
		System.out.println("합계는 :" + sum);

	}

}
