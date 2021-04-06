package day1;

public class PrinterApp {

	public static void main(String[] args) {
		
		System.out.println("### Printer객체 사용하기");
		Printer p1 = new Printer();
		p1.print();
		p1.refill();
		
		System.out.println("### ColorPrinter객체 사용하기");
		ColorPrinter p2 = new ColorPrinter();
		p2.print();
		p2.refill();
		
		System.out.println("### LaserPrinter객체 사용하기");
		LaserPrinter l1 = new LaserPrinter();
		l1.print();
		l1.refill();
		
		System.out.println("### LaserColorPrinter객체 사용하기");
		LaserColorPrinter l2 = new LaserColorPrinter();
		l2.print();
		l2.refill();
	}
}
