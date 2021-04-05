package day1;

public class Phone extends Object{
							//extends Object는 쓰지 않아도 자동 생성되고 Object는 상속의 맨위라서 
							//위에 상속받을게 남아있지 않다.
	private String tel;
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public void call() {
		System.out.println("지정된 번호 ["+tel+"]로 전화를 겁니다.");
	}
	
	public void receive() {
		System.out.println("전화를 받습니다.");
	}
}
