package reference;

public class ArrayExample2 {

	public static void main(String[] args) {
		int[] intAry = { 10, 20, 30, 33, 22, 17 };
		System.out.println("배열크기: " + intAry.length);
		System.out.println(intAry[0]);
		intAry[0] = 11;
		int sum = 0;
		int maxValue = 0; //제일 큰 값을 찾아와서 담는 변수
		
		for (int i = 0; i < intAry.length; i++) {
			System.out.println("intAry[" + i + "]의 값:" + intAry[i]);
			sum = sum + intAry[i];
			// 제일 큰 값을 찾아내는 for문 속의 if
			if ( maxValue < intAry[i]) {
				maxValue = intAry[i];
			}
		}
		System.out.println("합계: " + sum);
		System.out.println("가장 큰 값 : " + maxValue);
		
		
		
		
		
	/*	double[] dblAry = { 1.0, 2.0, 3.0,};
		String[] names = {"Hong", "Kim", "Park"};
		names[0] = "Hwang";
		
		//향상된 for문.
		for(String name : names) {//names의 변수 만큼 반복
			System.out.println(name);
		}
		
		for(double num : dblAry) {
			System.out.println(num);
		} */
		
		
	} // end of main()

}// end of class
