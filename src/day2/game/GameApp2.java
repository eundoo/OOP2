package day2.game;
import java.util.Scanner;

public class GameApp2 {

	public static void main(String[] args) {
	Unit[] units = new Unit[4];
	
	units[0] = new Marine();
	units[1] = new FireBat();
	units[2] = new Ghost();
	units[3] = new BattleCruiser();
	
	for (Unit unit : units) {
		// - unit ������������ �پ��� ������ Unit�� ��ü���� �����Ѵ�.
		// - unit ���������� �����ϴ� Unit�� ��ü�� ��� UnitŬ������ ����Ŭ������, 
		//Ŭ������ ������ �°� move()�� attack()�� �������ϰ� �ִ�.
		// - unit ���������� �����ϴ� ��ü�� ������ ��� ���� unit.move(); unit.attack();��
		//�����ϸ� ��ü�� ������ �� �����ǵ� move()�� attack()�� ����ȴ�.
		// - ���
		//		*Marine, Firebat, Ghost, BattleCruiser��ü�� �����ǵ� move()�� attack()�� 
		//		 �����ϱ� ���ؼ� �ش� ��ü Ÿ������ ����ȯ�� �ʿ��������.
		//		*UnitŬ������ ���� Ŭ������ ���߿� �߰��Ǵ���, �̵����, ���ݱ���� �����ϴ� ����� ������ �ʴ´�.
		//		*���α׷��� Ȯ�强�� ��������.
		
		unit.move();
		unit.attack();
		System.out.println();
	}
	
	}
}
