package co.yedam.api;
class Apple implements Cloneable{
	int price;
	Apple(int price) {
		this.price = price;
	}
	
	@Override
	public boolean equals(Object obj) {
		Apple ap = (Apple) obj;
		return this.price == ap.price ;
	}

	
}
public class ObjectExample {

	public static void main(String[] args) {
		Object obj = new Object();
		obj.equals(new Object()); //교재p.458
		System.out.println(obj.equals(new Object())); //두 개의 주소값과 오브제 자체를 비교하니 다르다.
		
		Apple ap1= new Apple(1000);
		Apple ap2= new Apple(1000);
		
		try {
			Apple ap3 = (Apple) ap1.clone();
			System.out.println("ap3: "+ ap3.price);
			
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println(ap1.equals(ap2));
		
	}



}
