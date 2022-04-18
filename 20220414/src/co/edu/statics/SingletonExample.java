package co.edu.statics;

class Car{
	
	
}
public class SingletonExample {		
	public static void main(String[] args) {   //main(메소드)을 호출할때 void(반환)할 값이 없다 는 뜻
		// privte 라서 못함 .Singleton s1 = new Singleton();  //public 접근지정자
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		if (s1 == s2) {
			System.out.println("same");
			
		}else {
			System.out.println("diff");
		}
	}
}
