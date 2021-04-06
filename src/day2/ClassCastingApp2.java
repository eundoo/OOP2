package day2;

public class ClassCastingApp2 {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new PoliceCar();
		Car car3 = new Panzer();
		
		System.out.println("### CarŸ���� ���������� Car��ü �����ϱ�");
		car1.drive();	//Car��ü�� ��� ����ϱ�
		car1.stop();	//Car��ü�� ��� ����ϱ�
		//PoliceCar car12 = (PoliceCar) car1;	//���� ����, Car1�� �����ϴ� ��ü���� PoliceCar�� ����
		//car12.patrol();
		//String car13 = (String) car1;	//������ ����, car1�� �����ϴ� ��ü�� String�� ��Ӱ��谡 �ƴϴ�.
		
		System.out.println("### CarŸ���� ���������� PoliceCar��ü �����ϱ�");
		car2.drive();	//Car��ü�� ��� ����ϱ�
		car2.stop();	//Car��ü�� ��� ����ϱ�
		PoliceCar car22 = (PoliceCar) car2;	//car2�� �����Ǵ� ��ü���� PoliceCar ��ü�� �Űܰ���
		car22.patrol();	//PoliceCar��ü�� ��� ����ϱ�
		
		((PoliceCar) car2).patrol();	//((PoliceCar) car2).patrol();�̰Ŷ��� �ٸ�����
		//PoliceCar��ü�� �Űܼ� ������� ����
		
		System.out.println("### CarŸ���� ���������� Panzer��ü �����ϱ�");
		car3.drive();	//Car��ü�� ��� ����ϱ�
		car3.stop();	//Car��ü�� ��� ����ϱ�
		PoliceCar car32 = (PoliceCar) car2;	//car2�� �����Ǵ� ��ü���� PoliceCar ��ü�� �Űܰ���
		car32.patrol();	//PoliceCar��ü�� ��� ����ϱ�
		Panzer car33 = (Panzer) car3;	//Car3�� �����Ǵ� ��ü���� Panzer��ü�� �Űܰ���
		car33.fireWeapon();
	}
}
