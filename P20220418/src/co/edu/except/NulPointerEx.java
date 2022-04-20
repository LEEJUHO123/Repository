package co.edu.except;

public class NulPointerEx {
	public static void main(String[] args) {
		String str = "Hello";
		str=null;
		
		try {
			System.out.println(str.toString());
		}catch(NullPointerException e) {
			//예외처리..
			System.out.println("Null값을 참조");
		}
		
		System.out.println("end of prog");
	}
}
