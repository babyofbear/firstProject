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
		
		
		int[] scores = { 90, 80, 84 };
		int sum = 0;
		double avg = 0.0;
		for(int i = 0; i < scores.length ; i++) {
			scores[i] = (int)(Math.random()*20) + 80 ;
			
			sum = sum + scores[i]; 
			
		}
		avg = sum / 3;
		System.out.println("평균은 " + avg + "점 입니다.");
		
		
		
		
		
		System.out.println("최고점수는 " + avg + "점 입니다.");

	}

}
