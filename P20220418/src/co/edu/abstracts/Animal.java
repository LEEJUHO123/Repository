package co.edu.abstracts;

public abstract class Animal {
	//Animal() 클래스의 생성자로 인스턴스 생성을 못하게 하기 위함임.
	
	public Animal() {
		
		
	}
	
	//추상 클래스
	public abstract void eat(); //강제로 eat() 구현하도록.
	
	public abstract void run();

	public void sleep() {
		System.out.println("동물이 잠을 잡니다.");
	}
}
