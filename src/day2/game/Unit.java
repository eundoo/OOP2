package day2.game;

public class Unit {
	
	String Name;
	int Life;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getLife() {
		return Life;
	}
	public void setLife(int life) {
		Life = life;
	}
	
	//���ݱ��
	public void attack() {
		System.out.println("������ ������� 1���ҽ�Ų��.");
	}
	//������
	public void defense() {
		System.out.println("������ ������ ����Ѵ�.");
	}
	//�̵����
	public void move() {
		System.out.println("1ĭ �̵��Ѵ�.");
	}
}
