package co.edu.inherit;

public class Bus extends Car {

	//필드.
	String busNo;
	
	//생성자.
	public Bus() {
		super(); //부모자식의 관계에서는 super는 부모를 가리킨다. 부모가 가지고 있는 기본 생성자를 호출한다는 뜻.
		System.out.println("Bus() 생성자 호출.");
	}
	
	//메소드.
	public void fee() {
		System.out.println("요금을 받습니다.");
	}
	
	@Override
	public void drive() {
		System.out.println("버스가 운행을 합니다.");
	}

	@Override
	public String toString() {
		return "Bus [busNo=" + busNo + ", model =" +super.model +"]";
//		return super.toString();
	}
	
	
	
	
}
