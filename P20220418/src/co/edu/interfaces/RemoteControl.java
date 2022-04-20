package co.edu.interfaces;

public interface RemoteControl {
	//상수
	public static final int MAX_VOLUME = 10; //상수는 값을 바꿀수도 없고, 이 인터페이스에서 종속적임. static final 이 붙으면 상수임
	
	public void turnOn(); //구현부분이 없는 이런걸 추상메소드.
	public void turnOff();
	public void volumeUp();
	public void volumeDown();
	public default void adjustScreen() {
		System.out.println("화면을 조정합니다.");
	}
	
	public static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
	
	
}
