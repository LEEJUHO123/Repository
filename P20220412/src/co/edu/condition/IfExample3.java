package co.edu.condition;

public class IfExample3 {
	public static void main(String[] args) {
		//중첩 구문.
		// 90점 이상 = A , 80점 이상 = B, 70점 이상 = C, 그외 F
		int score = 88;
		
		if(score >= 90) {
			if(score >= 95) {
				System.out.println("A+학점.");
			}else {
			System.out.println("90점 이상이라서 A");
			}
		}else if(score >=80) {
			System.out.println("B학점.");
		}else if(score >=70) {
			System.out.println("C학점");
		}else {
			System.out.println("F학점");
		}
		
		

		}
}
