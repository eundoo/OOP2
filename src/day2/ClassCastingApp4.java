package day2;

public class ClassCastingApp4 {

	public static void main(String[] args) {
		Car car1 = new Car();
		FireTruck car2 = new FireTruck();
		PoliceCar car3 = new PoliceCar();
		Panzer car4 = new Panzer();
		
		System.out.println("### drive/stop ��� �׽�Ʈ �ϱ�");
		testDriveAndStop(car1);
		testDriveAndStop(car2);
		testDriveAndStop(car3);
		testDriveAndStop(car4);
		
		System.out.println("### ������� �׽�Ʈ �ϱ�");
		//testPatrol(car1);	//������ ����
		//testPatrol(car2);	//������ ����
		testPatrol(car3);
		testPatrol(car4);
		
		System.out.println("### ����߻� ��� �׽�Ʈ�ϱ�");
		//testFireWeapon(car1);	//������ ����
		//testFireWeapon(car2);	//������ ����
		//testFireWeapon(car3);	//������ ����
		testFireWeapon(car4);
	}
	//������ ����, ���� ����� �׽�Ʈ�ϴ� �޼ҵ�
	public static void testDriveAndStop(Car car) {
		car.drive();
		car.stop();
	}
	//��������� �׽�Ʈ�ϴ� �޼ҵ�
	public static void testPatrol(PoliceCar car) {
		car.patrol();
	}
	//����߻����� �׽�Ʈ�ϴ� �޼ҵ� //������ Ÿ���� ���ؼ� ������ �Ǵ�.
	public static void testFireWeapon(Panzer car) {
		car.fireWeapon();
	}

}
