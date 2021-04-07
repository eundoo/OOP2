package day3;

public class Professer extends Person {

	private String dept;
	private String position;
	
	public Professer() {}
	
	public Professer(String dept, String position) {
		this.dept = dept;
		this.position = position;
	}
	
	public Professer(String name, String email, String tel, String dept, String position) {
		super(name, email, tel);
		this.dept = dept;
		this.position = position;
	}
	
	public String getDept() {
		return dept;
	}
	public String getPosition() {
		return position;
	}
	
	public void displayInfo() {
		System.out.println("학과: " + dept );
		System.out.println("직책: " + position);
	}
	
}

