package day2.game;

public class GameApp {

	public static void main(String[] args) {

		Marine unit1 = new Marine();
		FireBat unit2 = new FireBat();
		Ghost unit3 = new Ghost();
		BattleCruiser unit4 = new BattleCruiser();
		
		System.out.println("### Marine��ü�� �̵��ϱ�/�����ϱ�");
		unit1.move();
		unit1.attack();
		
		System.out.println("### FireBat��ü�� �̵��ϱ�/�����ϱ�");
		unit2.move();
		unit2.attack();
		
		System.out.println("### Ghost��ü�� �̵��ϱ�/�����ϱ�");
		unit3.move();
		unit3.attack();
		
		System.out.println("### BattleCruiser��ü�� �̵��ϱ�/�����ϱ�");
		unit4.move();
		unit4.attack();
	}

}
