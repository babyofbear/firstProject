package practice;

public class Multiply01 {

		public static void main(String[] args) {
			for (int i = 2; i < 10; i++) {
				for (int j = 2; j < 10; j++) {
					System.out.println(i + "단:" + i + "x" + j + "=" + i*j);
					try {
						Thread.sleep(700);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					//if (i == 9 ) {
					//	System.out.print(\n);
					//}
				}
			}
		}
	}

