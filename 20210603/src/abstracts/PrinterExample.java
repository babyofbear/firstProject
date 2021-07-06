package abstracts;

public class PrinterExample {

	public static void main(String[] args) {
		//new Printer() ; //추상클래스는 인스턴스 못 만듦.
		Printer printer = null; // new Printer() => 사용할 수 없음, 왜냐면 추상클래스라서
		
		printer = new SamsungPrinter("ML6");
		printer.turnOn();
		printer.printing();		
		printer.turnOff();
		System.out.println();
		printer = new CannonPrinter("Epson");
		printer.turnOn();
		printer.printing();
		printer.turnOff();

	}

}
