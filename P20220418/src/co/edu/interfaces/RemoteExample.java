package co.edu.interfaces;

public class RemoteExample {
	public static void main(String[] args) {
		//상속관계에서는 부모클래스의 참조변수 자식클래스의 인스턴스가 할당.
		
		RemoteControl rc = null;
//		rc = new Television(); //RemoteControl 인터페이스를 구현하는 Television.
		rc = new Audio();
		
		rc.turnOn();
		rc.turnOn();
		rc.volumeUp();
		rc.volumeDown();
	
		RemoteControl.changeBattery();
	}
}
