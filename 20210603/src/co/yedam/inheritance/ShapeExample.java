package co.yedam.inheritance;

public class ShapeExample {

	public static void main(String[] args) {//메소드가 상속되어 다양하게 실행됨
		Shape shape = new Shape() ;
		shape.draw();
		
		shape = new Triangle();
		shape.draw();
		
		shape = new Rectangle();
		shape.draw();
		
		shape = new Circle();
		shape.draw();
		

	}

}
