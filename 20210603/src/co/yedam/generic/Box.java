package co.yedam.generic;

public class Box<T> { //any클래스(<T> 로 표현)가 올 수 있다. 정의하는 시점이 아닌 사용하는 시점에 정한다
	private T obj; //모든 유형의 클래스들을 사용할 수 있음.

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
}
