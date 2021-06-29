package reference;

public class ArrayExample3 {

	public static void main(String[] args) {
			// 크기순 정렬 하기. 미완성
		int[] intAry = { 25, 22, 29 };
		int num1 = 25;
		int num2 = 22;
		int num3 = 29;
		int i = 0;

		int[] intAry = new int[3];
		int max = 0;

		if (num1 > num2) { 

			if (num2 > num3) {//1,2,3
			}	max = num1;
			

			if (num3 > num2) {
				if (num3 > num1)
				max = num3; //3,1,2
					
			} else {
				max = num2; // 1,3.2
			}
				

			}
			
			else if (num2 > num1) { // 크기 두 번 비교
				if (num3 > num1) {
					max = num2;
					if (num3 > num2) {
						max = num3;
					} else {
						max = num2;
					}
				}

			}

			System.out.println("가장 큰 값: " + max);
		}
	}
}
