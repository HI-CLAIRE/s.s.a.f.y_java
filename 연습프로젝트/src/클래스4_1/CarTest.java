package 클래스4_1;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();

		// car1의 필드값을 작성해보자.
		// 자동차 등록번호
		car1.setVIN("KNHXX00XXXX000000");
		// 자동차 모델이름
		car1.setModelName("K5");
		// 자동차 색상
		car1.setColor("white");
		// 자동차 주행거리
		car1.setMileage(35000);
		
		Car car2 = new Car("KNHXX00XXXX000000", "K5", "White", 35000);

		System.out.println("자동차 등록번호 : " + car1.getVIN());
		System.out.println("자동차 모델이름 : " + car1.getModelName());
		System.out.println("자동차 색상 : " + car1.getColor());
		System.out.println("자동차 주행거리 : " + car1.getMileage());
		System.out.println("-------------------------------");
		System.out.println("자동차 등록번호 : " + car2.getVIN());
		System.out.println("자동차 모델이름 : " + car2.getModelName());
		System.out.println("자동차 색상 : " + car2.getColor());
		System.out.println("자동차 주행거리 : " + car2.getMileage());
	
	}

}
