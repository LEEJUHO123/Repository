package co.edu.interfaces;

//구현클래스(인터페이스를! 구현) 클래스명.
interface Runnable{
	public void run();
}
class RunClass implements Runnable{

	@Override
	public void run() {
		System.out.println("움직입니다.");
		
	}
	
}
public class RunnableExample {
	public static void main(String[] args) {
		Runnable runnable = new RunClass();
		runnable.run();
		
		runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("멍멍이가 달립니다.");
				
			} //익명의 구현객체.
			
		};
		runnable.run();
		
		//익명의 구현객체. 람다표현식.
		runnable = () -> 
				System.out.println("야옹이가 달립니다.");
				
			
		runnable.run();
	}
}
