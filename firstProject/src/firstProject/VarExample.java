package firstProject;

public class VarExample {
  public static void main(String[] args) {
	int kor = 60;
	int eng;
	eng = 71;
	
	int sum =  kor + eng;
	System.out.println("합: " +  sum);
	
	sum = 100;
	
	double avg = sum / 2.0; //평균 65.5 == 실수를 정수로 변환시켜줌 더블타입이라도 
	System.out.println("평균: " + avg);
	
	System.out.println("두수의 곱: " + kor * eng);
	
}
}
