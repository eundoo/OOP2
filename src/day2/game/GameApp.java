package day2.game;

public class GameApp {

	public static void main(String[] args) {

		Marine unit1 = new Marine();
		FireBat unit2 = new FireBat();
		Ghost unit3 = new Ghost();
		BattleCruiser unit4 = new BattleCruiser();
		
		System.out.println("### Marine객체의 이동하기/공격하기");
		unit1.move();
		unit1.attack();
		
		System.out.println("### FireBat객체의 이동하기/공격하기");
		unit2.move();
		unit2.attack();
		
		System.out.println("### Ghost객체의 이동하기/공격하기");
		unit3.move();
		unit3.attack();
		
		System.out.println("### BattleCruiser객체의 이동하기/공격하기");
		unit4.move();
		unit4.attack();
	}

}
