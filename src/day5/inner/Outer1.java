package day5.inner;

public class Outer1 {

	private int x;
	private static int y = 20;		//Static이 있기 때문에 "= 값;"이 설정되어 있는건가봐
	public void test1() {
		System.out.println("외부클래스 인스턴스 메소드test1() 실행");
	}
	public static void test2() {
		System.out.println("외부클래스 정적 메소드 test2() 실행");
	}
	//내부 클래스로 객체를 생성해서 반환하는 메소드
	//getInner()는 외부 클래스로 객체 생성해야만 사용할 수 있는 메소드이다.
	//따라서 내부클래스로 만든 객체는 외부 클래스로 객체 생성한 후에만 사용할 수 있는 것이다.

	//인스턴스 내부 클래스

	//외부 클래스를 객체 생성 후 사용할 수 있는 내부 클래스 (static 키워드가 없기 때문이다.)
	//외부 클래스의 모든변수 모든 메소드를 사용할 수 있다.
	//외부 클래스의 모든 구성요소와 마우 밀접한 관계가 있는 작업을 수행하는 클래스다.
	
	class Inner {
		public void innerMethod() {
			System.out.println("외부 클래스의 인스턴스 변수: " + x);
			System.out.println("외부 클래스의 클래스 변수: " + Outer1.y);
			test1();
			Outer1.test2();
		}
		
	}
 }
