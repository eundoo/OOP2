package day3.template;

public abstract class AbstractBanking {

	//모든 뱅킹작업에서 항상 실행하는 전처리 작업 - 변하지 않는 부분
	private void before() {
		System.out.println("은행 전산시스템과 연결하기");
		System.out.println("사용자 인증");
	}
	//모든 뱅킹작업에서 항상 실행하는 후처리 작업 - 변하지 않는 부분
	private void after() {
		System.out.println("은행 전산시스템과 연결해재하기");
	}
	
	//실제로 수행하는 작업에 대한 메소드만 설계 - 변하는 부분
	//AbstractBanking를 상속 받는 하위 클래스가 구현해야할 부분.
	public abstract void job();
	
	
	// 이 아이는 약간 깔끔하게 종합하는 메소드
	//뱅킹작업에 참여하는 모든 작업을 순서에 맞게 실행해주는 메소드
	void process() {
		before();
		job();		//여기서 정의하는게 아니고 하위클래스에서 재정의한 job()이 실행 될 것이다.
		after();
	}
}
