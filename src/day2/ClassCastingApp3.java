package day2;

public class ClassCastingApp3 {

	public static void main(String[] args) {

		Car[] carList = new Car[5];
		
		carList[0] = new Car();
		carList[1] = new Panzer();
		carList[2] = new FireTruck();
		carList[3] = new PoliceCar();
		carList[4] = new Panzer();
		
		//���� for���� �̿��ؼ� �迭�� ����� �پ��� Car��ü�� ������� ��ȸ�ؼ�
		//Car��ü�� �������, �������, �����غ���
		//PoliceCar��ü�� �������, �������, ������� �����غ���
		//FireTruck��ü�� �������, �������, ȭ�����б�� �غ���
		//Panzer��ü�� �������, �������, �������, ����߻��� �����غ���
		
		for (Car car : carList) {
			System.out.println();
			System.out.println("car ���������� �����ϴ� ��ü �ֿ��� Ȯ��");
			car.drive();
			car.stop();
			
			if (car instanceof FireTruck) {
				FireTruck x = (FireTruck) car;
				x.suppressFire();
			}
			if (car instanceof PoliceCar) {
				PoliceCar x = (PoliceCar) car;
				x.patrol();
			}
			if (car instanceof Panzer) {
				Panzer x = (Panzer) car;
				x.fireWeapon();
			}
			System.out.println(car);
			System.out.println(car instanceof Car);
			System.out.println(car instanceof FireTruck);
			System.out.println(car instanceof PoliceCar);
			System.out.println(car instanceof Panzer);
			System.out.println();
		}
	}
}
