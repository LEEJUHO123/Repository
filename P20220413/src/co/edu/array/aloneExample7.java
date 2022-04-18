package co.edu.array;

public class aloneExample7 {
	public static void main(String[] args) {
	
		String[] days = {"Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat"};
		int month = 4;
		int lnth = 30;
		int[] intAry = new int[lnth];
		
		for(int i=0; i<days.length; i++) {
			System.out.printf("%4s", days[i]);
		}
		
		
		for(int i=0; i<intAry.length; i++) {
			intAry[i] = i + 1;
		}
		
	
}
}
