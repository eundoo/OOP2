package day2;

public class ClassCastingApp {

	public static void main(String[] args) {
		Panzer car1 = new Panzer();
		PoliceCar car2 = new Panzer();
		Car car3 = new Panzer();

		System.out.println("### Panzer Ÿ���� ���������� Panzer Ÿ���� ���������� Panzer��ü �����ϱ�");
		//Panzer ��ü�� �޼ҵ� ��밡��
		car1.setWeapon("�����");
		car1.fireWeapon();
		//PoliceCar ��ü�� �޼ҵ� ��밡�� <- Panzer�� ���� Ŭ������
		car1.patrol();
		//Car��ü�� �޼ҵ� ��밡�� <- PoliceCar���� Ŭ������
		car1.setColor("������");
		car1.drive();
		car1.stop();
		
		System.out.println("### PoliceCar Ÿ���� ���������� Panzer ��ü �����ϱ�");
		//Panzer��ü�� �޼ҵ� ��밡��
		//Car2.setWeapon("�����")	//���� - ���Ұ�
		//Car2.fireWeapon();		//���� - ���Ұ�
		//PoliceCar ��ü�� �޼ҵ� ��밡�� <- Panzer�� ���� Ŭ������
		car2.patrol();
		//Car��ü�� �޼ҵ� ��밡�� <- PoliceCar���� Ŭ������
		car2.setColor("�Ķ���");
		car2.drive();
		car2.stop();
		
		System.out.println("### Car Ÿ���� ���������� Panzer��ü �����ϱ�");
		//Panzer��ü�� �޼ҵ� ��밡��
		//Car3.setWeapon("�����")	//���� - ���Ұ�
		//Car3.fireWeapon();		//���� - ���Ұ�
		//PoliceCar��ü�� �޼ҵ� ��밡�� <- Panzer�� ���� Ŭ������
		//car3.patrol();			//���� - ���Ұ�
		//Car��ü�� �޼ҵ� ��밡�� <- PoliceCar�� ���� Ŭ������
		car3.setColor("������");
		car3.drive();
		car3.stop();
	}
}
