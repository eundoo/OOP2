package day1;

public class FeaturePhone extends Phone {

	//모든 전화기들이 공통 속성과 기능은 상위 클래인 Phone으로 부터 상속 받았다.
	//(전화번호, 전화걸기, 전화받기)
	//FeaturePhone 클래스를 작성할 때 전화관련 기능은 Phone으로 상속받기 때문에, FeaturePhone의
	//고유한 속성과 고유한 기능의 구현에만 집중할 수 있다.
	//FeaturePhon 외 다른 전화기 관련 클래스를 작성할 때도 Phone을 상속받아서 작성하면 되기 때문에
	//전화기 관련 기능은 Phone클래스에서만 작성하면 된다. 따라서, 코드의 중복을 제거할 수 있다.
	
	//FeaturePhone의 고유한 속성
	private int pixel;
	
	
	public int getPixel() {
		return pixel;
	}
	public void setPixel(int pixel) {
		this.pixel = pixel;
	}
	
	//FeaturePhone의 고유한 기능
	public void takePicture() {
		System.out.println("["+pixel+"]화소의 화질로 사진을 찍습니다.");
	}
	
}
