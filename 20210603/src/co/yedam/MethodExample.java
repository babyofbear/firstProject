package co.yedam;

public class MethodExample {

	public static main(String[] args) {
		
		// 이름 : 홍길동
		// 생일 : 1990년 01월 01일
		// 전화 : 01012345678
		String str1 = new String ("유재석 19900101 01012345678");
		String str2 = new String ("박명수 19900101 01012345678");
		String str3 = new String ("하하하 19900101 01012345678");
		

	}
	public static String makeUsefulInfo(String str) {
		
		
		String info[] = str.split(" ");
		
		String name = info[0];
		String birth = info[1];
		String phone = info[2];
		
		name = "\n이름 :" + name;
		birth = "\n생일 :"+ birth.substring(0,4) + "년 "+ birth.substring(5,6) + "월 "+ birth.substring(7,8) + "일";
		phone = "\n전화 :" + phone.substring(0,3) +"-" + phone.substring(4,7) +"-"+ phone.substring(8,11);
		
		
		
		String info[] = str.split(" ");
		String info[0] = str.split(0,3);
		String info
		
		
	}

}
