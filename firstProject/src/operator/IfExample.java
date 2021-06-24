package operator;

public class IfExample {
	public static void main(String[] args) {
		// if 조건식을 (이것을 만족하면) 안에 작성 {이것을 실행하라} 
		int v1 = 20;
		int v2 = 20;
		
		if(v1 > v2) {
			System.out.println("v1 이 v2보다 큽니다.");
		} else if (v1 == v2 ) {
			System.out.println("v1은 v2와 같습니다.");
		} else {
			System.out.println("v2 이 v1보다 큽니다.");
		}
		
		
		String str1 = "홍길동";//숫자와 문자는 저장하는 형태가 다르다. 문자는 주소를 저장한다.
		String str2 = "홍길동";//str1,str2는 같은 주소값으로 저장한다.
		String str3 = new String("홍길동");//힙 영역에 새로운 주소로 저장한다
		
		if (str1.equals(str3)) {//문자 간에 "="가 아니라 "equals"로 같음을 판단함
			System.out.println("같은 이름입니다.");
		} else {
			System.out.println("다른 이름입니다.");
		}
		
		
		System.out.println("end of prog.");
	}

}
