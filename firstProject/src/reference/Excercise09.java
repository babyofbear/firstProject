package reference;

import java.util.Scanner;

public class Excercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.println("선택> ");

			int selectNo = scanner.nextInt();
			

			if (selectNo == 1) {
				System.out.println("학생수> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];

			} else if (selectNo == 2) {
				if (scores == null) {
					System.out.println("학생수를 다시 입력하세요.");
				} else {
					System.out.println("점수입력> ");

					for (int i = 0; i < scores.length; i++) {
						System.out.println("scorses[" + i + "]>");
						scores[i] = scanner.nextInt();
						if (scores[i]>100 || scores[i]<0) {
							System.out.println("점수 범위가 맞지 않습니다. 다시 입력하세요.");
							i--;
						} 
					}
				}
			} else if (selectNo == 3) {
				if (scores == null) {
					System.out.println("학생수를 다시 입력하세요.");
				} else {
					for (int i = 0; i < scores.length; i++) {
						System.out.println("scorses[" + i + "]:" + scores[i]);
					}
				}
			} else if (selectNo == 4) {
				int sum = 0;
				double avg = 0.0;
				int maxScore = 0;
				for (int i = 0; i < scores.length; i++) {
					sum = sum + scores[i];

					if (maxScore < scores[i]) {
						maxScore = scores[i];
					}
				}
				avg = sum / (double) scores.length;

				System.out.println("최고점수: " + maxScore);
				System.out.println("평균점수: " + avg);
			} else if (selectNo == 5) {

				break;
			} else {
				System.out.println("1~5사이의 메뉴를 선택하세요.");
			}

		}
		System.out.println("프로그램이 종료되었습니다.");

	}
}