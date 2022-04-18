package co.edu.inherit;

public class CarExample {
	public static void main(String[] args) {
		Bus bus = new Bus ();
		//부모에게 상속받은 필드, 메소드.
		bus.model = "45인승버스";
		bus.drive();	//bus는 자식, drive는 부모가 가진 메소드.
		
		// 자식클래스에서 새로 추가된 필드, 메소드들이 호출.
		bus.busNo = "240";
		bus.fee();
		System.out.println(bus.toString());
		
		Taxi taxi = new Taxi();
		taxi.model = "SonataTaxi";
		taxi.drive();
		
		taxi.type = "개인택시";
		taxi.metering();
		System.out.println(taxi.toString());
		
		// 자식클래스의 인스턴스 => 부모 참조변수 할당 가능.
		Bus[] buses = new Bus[10];
		Taxi[] taxies = new Taxi[10];
		
		Car[] cars = new Car[10];
		cars[0] = bus; //promotion 자동형변환
		cars[1] = taxi; // promotion
	
		}
	}

