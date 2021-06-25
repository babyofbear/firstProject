package conditions;

public class ForExample3 {
	public static void main(String[] args) {
		// 1~50 까지 수 중에서 2 또는 3의 배수의 합
		int sum = 0;
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {         //if (i % 2 == 0 || i % 3 == 0)
				sum = sum + i; 
			} else if (i % 3 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
		
	}
}
