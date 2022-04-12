package co.edu.loop;

import java.util.Scanner;

public class WhileExample3 {
	public static void main(String[] args) {
		//Math.random()의 생성범위 1 ~ 10 까지가 되도록.
		//사용자의 입력값을 담는 변수 randomVal.
		
		//while 구문을 사용해서 임이의 값이랑 입력값이 같으면 종료.
		// 사용자 값 비교 랜덤값이랑 비교
		Scanner scn = new Scanner(System.in);
		boolean isTrue = true;
		while(isTrue) {
			System.out.println("입력해보셈");
			int val = scn.nextInt();
			
		
		int randomVal = (int)(Math.random()*10) + 1;
		if (randomVal == val) {
			System.out.println("같습니다.");
			isTrue = false;
		}
		
		if (randomVal > val) {
			System.out.println("입력값이 큽니다");
			if (randomVal < val) {
				System.out.println("입력값이 작습니다.");

			
		
				
				
				
				
				
				System.out.println("=====================");
		
		
	//	while(true) {
	//		System.out.println("값을 입력하셈");
	//		int val = scn.nextInt();
	//		if (randomVal )
		}
			
			
			
			
			
			
			}
		}
		}	
	}
//}


