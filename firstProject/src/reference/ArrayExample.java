package reference;

import java.util.Scanner;

public class ArrayExample {
	public static void main(String[] arge) {
		Scanner scn = new Scanner (System.in);
		int[] intAry = new int[3];
		for(int i=0; i<3; i++) {
			System.out.println("값입력>>>");
			int num = scn.nextInt();
			intAry[i] = num;
		}
		System.out.println(intAry[0]);
		System.out.println(intAry[1]);
		System.out.println(intAry[2]);
	}
		
		

	public static void aryExam() {
		int[] scores = new int [5];
		scores[0] = 70;
		scores[1] = 75;
		scores[2] = 80;
		scores[3] = 85;
		scores[4] = 90;
		
		int sum = 0 ;
	
		for (int i = 0; i <5; i++); {
			sum += scores[i];
			System.out.println(scores[i]); //scores[0] 첫번째 값
			
		}
		
		double avg = sum / 5.0;
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);
	}
	
	
	
	

	

	public static void intExam(String[] args) {
		int score1 = 70;
		int score2 = 75;
		int score3 = 80;
		int score4 = 85;
		int score5 = 90; //학생이 30명이면 변수 30개 선언하고 30개를 합하는 복잡한 코드가 됨
		int sum = 0;
		sum = score1 + score2 + score3 + score4 + score5;
		double avg = sum / 5.0;
		System.out.println("평균: " + avg);
	
	}

}
