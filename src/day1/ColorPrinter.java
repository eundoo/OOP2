package day1;

public class ColorPrinter extends Printer {
	
	//부모로부터 물려받은 void print()기능은 흑백으로 출력하는 기능이다.
	//ColorPrinter는 상속받은 void print() 메소드의 내용을 컬러로 출력하기
	//메소드 구현부(내용)을 변경할 수 있다.
	//부모로부터 상속받은 메소드를 자신에게 맞게 메소드의 구현부(내용)을 재 정의 할 수 있다.
	
	//@Override는 Annotation이다.
	//Annotation은 컴파일러, 편집기, 애플리케이션에게 부가적인 정보를 전달할 목적으로 사용되는 것이다.
	//@Override Annotation이 부착된 메소드는 상위클래스로부터 상속받은 메소드를 재정의 메소드임을 
	//나타내는 Annotation이다.
	//Override Annotation이 부착된 메소드는 메소드의 반환값, 이름, 매개변수를 상위클래스의 그것과
	//동일하게 작성해야 한다. 만약 다르게 작성하면 오류로 표시된다.
	
	@Override
	public void print() {
		//Printer로부터 상속받은 public void print() { ... }를 
		//ColorPrint에게 맞게 메소드의 내용음 변경하였음
		//이름, 메소드 재정의 (Method Overriding)라고 한다.
		System.out.println("컬러로 출력하기");
	}
	@Override
	public void refill() {
		System.out.println("컬러 잉크 채우기");
	}
}
