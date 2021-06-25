package conditions;

public class ForExample {
	public static void main(String[] args) {
		// 1~10 합을 구하는 프로그램.
		int sum = 0;
		for (int i = 1; i <= 10; i++) { // for (int 초기값 ; 조건식 ; 증감식)

			if (i % 2 == 0) {
				System.out.println("현재 i: " + i);
				System.out.println("합계" + sum);

				sum = sum + i;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();

				}

			} else if (i == 5) {
				break;
			}
		}

	}
}