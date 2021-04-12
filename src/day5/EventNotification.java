package day5;

public class EventNotification {

	//EventNotification객체가 의존하는 객체의 주소값을 저장할 참조변수 정의 
	private Mail mail;		
	//private GoogleMail mail = new GoogleMail(); 이렇게 안한다는거지
	//이렇게 하면 코드를 하나하나 만들어 줘야 되는데 
	//private Mail mail;로하면 App에서만 바꿔주면 됨
	//이렇게 인터페이스로 하면 어떤게 조립될지만 바꾸면됨
	//이것 마저도 코드가아니고 환경설정으로 뽑아낼 수 있어 그래서 더 쉽게 교체가 가능
	
	private Messenger messenger;
	private SNS sns;
	
	//EventNotification객체가 의존하는 객체의 주소값을 전달받아서
	//멤버변수에 대입하는 Setter메소드 정의
	//이 Setter 메소드는 EventNotification객체가 필요로 하는 객체를
	//제공하는 측에서 호출하는 메소드
	public void setMail(Mail mail) {
		this.mail = mail;
	}

	public void setMessenger(Messenger messenger) {
		this.messenger = messenger;
	}

	public void setSns(SNS sns) {
		this.sns = sns;
	}
	
	public void notice(String from, String to, String title, String content) {
		//메일, 메신저, SNS에 이벤트 내용
		mail.sendMail(from,to,title,content);
		messenger.send(from,to,content);
		sns.post(title,from,content);
	}
	
}
