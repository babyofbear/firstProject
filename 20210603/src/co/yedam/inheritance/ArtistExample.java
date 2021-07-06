package co.yedam.inheritance;

public class ArtistExample {
	public static void main(String[] args) {
		
		Shape shape = new Shape();
		Triangle tri = new Triangle();
		Circle cir = new Circle();
		Rectangle rect = new Rectangle();
		
		Artist artist = new Artist();
		artist.paint(rect); //상속의 관계에 있을 때 매개변수의 다형성.
		
		
	}

}
