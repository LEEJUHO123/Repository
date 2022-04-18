package co.edu;

public class OperatorExample3 {
	public static void main(String[] args) {
		// 비교연산자, 논리연산자
		int num1 = 10;
		int num2 = 20;
		
		if(num1 == num2) {
			System.out.println("두 수는 값습니다.");
			}
		
		if(num1 != num2) {
			System.out.println("두 수는 같지 않습니다.");
		}
		if(num1 >= num2) {
			System.out.println(num1 + "이" + num2 + "보다 큽니다.");
		}
		
		
		
		
		if((num1 % 2 == 0) && (num2 % 2 == 0)) {     // && <- 이건 둘중 하나만 false 여도 else 됨. but , & 하나만 있으면 실행됨.
			System.out.println("두 수는 짝수입니다.");
		} else {
			System.out.println("두 수가 짝수는 아닙니다.");
		}
		System.out.println(num1 + "," + num2);
		
		
		
		if((num1 % 2 == 0) || (num2 % 2 == 0)) {    // ||는 or 임. 둘중에 하나라도 참이면 "두수는 짝수' 를 실행함.
			System.out.println("두 수는 짝수입니다.");     //  
		} else {
			System.out.println("두 수가 다 홀수 입니다.");
		}
		
		System.out.println("end of prog");
	}
}
