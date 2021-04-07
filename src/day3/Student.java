package day3;

public class Student extends Person {
	
	private int grade;
	private String dept;
	
	//이 super가 뭐냐면 부모가 setter도 안 가지고 있고, private이야 그래서 내가 접근할 수가 없잖어 
	//그럴때 부모한테 접근할 수 있는게 super메소드인거야!!!
	public Student() {
		super(); //super()가 생략된거임
	}
	
	public Student(String name, int grade, String dept) {
		super(name);				//부모객체의 생성자 실행
		this.grade = grade;
		this.dept = dept;
	}
	
	public Student(String name, String email, String tel, int grade, String dept) {
		super(name, email, tel);	//부모객체의 생성자 실행
		this.grade = grade;
		this.dept = dept;
	}
		
	public int getGrade() {
		return grade;
	}

	public String getDept() {
		return dept;
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("학년: " + getGrade());
		System.out.println("학과: " + getDept());

	}
}
