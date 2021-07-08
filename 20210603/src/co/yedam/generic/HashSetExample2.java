package co.yedam.generic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Apple {
	String group;
	int price;
	Apple(String group, int price){
		this.group = group;
		this.price = price;
		
	}
	@Override
	public int hashCode() {
		return this.group.hashCode()+ this.price; //해시코드 같게 만들어줌. 종류와 가격이 같으면 같은 객체로 만들어줌.
	}
	// String 타입의 '문자'는 문자가 같다면 해시코드와 이퀄즈가 같다고 디폴트로 설정되어있음. 
	@Override
	public boolean equals(Object obj) {
		Apple other = (Apple) obj;
		return this.group.equals(other.group) && this.price == other.price;
		 //이퀄즈로 같은 가격은 같은 객체로 만들어줌.super.equals(obj);
	}
}		// 해시코드와 이퀄즈가 같으면 동등한 객체이다.

public class HashSetExample2 {

	public static void main(String[] args) {
		// Set : 중복된 값을 허용하지 않음.
		Set<Apple> set = new HashSet<Apple>();
		set.add(new Apple("부사",1000));
		set.add(new Apple("부사",1000));
		set.add(new Apple("홍옥",1500));
		set.add(new Apple("아오리",1500)); //주소값이 다르다.
		
		Iterator<Apple> iter = set.iterator();
		while(iter.hasNext()) {
			Apple app = iter.next();
			//System.out.println(app);
			//System.out.println(app.price);
			//System.out.println("해시코드: "+app.hashCode()); //해시코드가 다르면 논리적으로 다른 값
			System.out.println("종류: "+app.group+" 가격: "+app.price);
		}
		
	}

}
