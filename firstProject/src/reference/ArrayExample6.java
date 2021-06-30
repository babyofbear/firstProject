package reference;

public class ArrayExample6 {

	public static void main(String[] args) {
		// 배열을 선언, 학생의 점수 scores 예제 5번 참고
		// 평균점수와 가장 높은 점수를 구하기
		
//		String[] names = new String[3];
//		names[0] = 김하나;
//		names[1] = 남하나;
//		names[2] = 최하나;
//		
//		int sum = 0 ;
//		int[] scores = { 90, 80, 85 };
//		for(int i=0 ; i < scores.length ; i++) {
//			scores[i] = (int)(Math.random()*20) + 80 ;
//			
//		}		
//		
//		double avg = 0.0;
//		int maxValue = 0;
//		
		// 여기에서부터 코딩하세요.
		
		
		int[] scores = null; //{ 90, 80, 84 }; //scores라는 정수 타입의 변수를 선언
		scores = new int[3]; // int[] scores = new int[3]; { 0,0,0 } 초기 값이 0,0,0
		//
		int sum = 0;
		int maxScore = 0;
		double avg = 0.0;
		
		
		for(int i = 0; i < scores.length ; i++) {
			scores[i] = (int)(Math.random()*20) + 80 ;
			System.out.print(i + "번 학생 점수는 " + scores[i] + "입니다.") ;
			
			// 점수는 랜덤으로 생기는데 학생 수는 2명만 생기는가? 
			// 배열 수i와 학생 수가 같아서 "0"으로 나눈 수 없다.
			// 평균을 구할 때 나누어 주는 수를 "i+1"로 나누어야 하나??
			sum = sum + scores[i]; 			
			avg = sum / (double)scores.length;
			
			if (maxScore < scores[i]) {
				maxScore = scores[i];
			}
			
			
		}
		System.out.println("평균은 " + avg + "점 입니다.");
		System.out.println();
		System.out.println("최고점수는 " + maxScore + "점 입니다.");
		
	}

}
