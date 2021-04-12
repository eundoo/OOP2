package day6;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GuiApp extends JFrame {
	
	JButton closeBtn = new JButton("닫기");
	JButton cancelBtn = new JButton("취소");
	JButton saveBtn = new JButton("저장");
	JButton exitBtn = new JButton("종료");

	public GuiApp() {
								//FlowLayout누르고 ctrl+space누르면 위에 임포트 됨
		setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		add(closeBtn);
		add(cancelBtn);
		add(saveBtn);
		add(exitBtn);
		
		//이벤트 핸들러(이벤트 리스너) 작성하기
		//버튼을 클릭했을 때, 입력필드에서 Enter키를 눌렀을 때는 ActionEvent가 발생한다.
		//이벤트 소스 : JButton
		//선정된 이벤트 : ActionEvent
		//이벤트 핸들러 : ActionListener 인터페이스를 구현해서 작성한다.
		
		ActionListener listener1 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("저장이 완료되었습니다.");
			}
		};
		
		//종료하기 버튼에서 이벤트 발생시 실행할 내용이 구현된 익명클래스 및 객체 생성
		ActionListener listener2 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("프로그램을 종료합니다.");
			}
		};
		
		//(new ActionListener(){
		//public void actionPerformed(ActionEvent e) -> 이미 이렇게 들어갈것을 자바가 
		//알고 있기 때문에 "e->" (이 화살표 람다표현식을 이용해 보다 간결하게 만든다.)
		//그래서 람다표현식을 써도 하위처럼 소스가 자동으로 바뀐다.
		closeBtn.addActionListener(e -> System.out.println("닫기를 실행함"));
		
		//이벤트 소스에 이벤트 핸들러(이벤트리스너) 연결하기
		//saveBtn, exitBtn처럼 따로 객체생성해도 되고 cancelBtn처럼 한번에 객체생성까지 해도된다.
		cancelBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.out.println("실행을 취소합니다.");
			}
		});
		saveBtn.addActionListener(listener1);
		exitBtn.addActionListener(listener2);

		
		setVisible(true);
		setBounds(200, 200, 300, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
		public static void main(String[] args) {
			new GuiApp();
		}
}
