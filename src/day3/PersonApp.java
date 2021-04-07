package day3;

public class PersonApp {

	public static void main(String[] args) {
		Student student = new Student("홍길동", "hong@gmail.com", "010-1111-1111", 3, "컴퓨터공학과");
		student.displayInfo();

		Professer professor = new Professer("홍길동", "hong@gmail.com", "010-1111-1111", "컴퓨터공학과", "교수");
		professor.displayInfo();
	}
	
}
