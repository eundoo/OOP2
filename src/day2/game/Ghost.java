package day2.game;

public class Ghost extends Unit{

	@Override
	public void attack() {
		System.out.println("���� ������ ����ź�� �����Ѵ�.");
	}
	
	@Override
	public void move() {
		System.out.println("Ŭ��ŷ ����� �̿��ؼ� �̵��Ѵ�.");
	}
}
