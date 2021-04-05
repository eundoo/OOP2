package day1;

public class LaserColorPrinter extends LaserPrinter {
	
		@Override
		public void print() {
			System.out.println("레이저 컬러 출력");
		}
		public void refill() {
			System.out.println("레이저 컬러 리필");
		}
}
