package day1;

public class LaserPrinter extends Printer{
	
		@Override
		public void print() {
			System.out.println("레이저 흑백 출력");
		}
		public void refill() {
			System.out.println("레이저 흑백 리필");
		}
}
