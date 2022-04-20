package co.edu.interfaces;

//인터페이스를 구현하는 구현클래스를 통해 구현이 되어야함.
public class Television implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
		
	}

	@Override
	public void volumeUp() {
		System.out.println("Volume을 올립니다.");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("Volume을 내립니다.");
		
	}

	@Override
	public void adjustScreen() {
		
	//	RemoteControl.super.adjustScreen();
	System.out.println("TV 화면을 조정합니다.");
	}
	
	

	
}
