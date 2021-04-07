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
	
	//공격기능
	public void attack() {
		System.out.println("상대방의 생명력을 1감소시킨다.");
	}
	//수비기능
	public void defense() {
		System.out.println("상대방의 공격을 방어한다.");
	}
	//이동기능
	public void move() {
		System.out.println("1칸 이동한다.");
	}
}
