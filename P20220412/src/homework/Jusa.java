package homework;

import java.util.Scanner;

public class Jusa {
	public static void main(String[] args) {
		// 임의의 값 범위 ( 1 ~ 6 : 주사위의 면의 갯수. )
		// 주사위 맞추기 게임.
		
		int randomVal = (int)(Math.random()*(6-1)) + 1; // 
			Scanner scn = new Scanner(System.in);
			
			while(true) {
				System.out.println("주사위 맞춰보세요~ 입력 >>> ");
				int userVal  = scn.nextInt();
				if(randomVal == userVal) {
					System.out.println("정답입니다.");
					break;
					}
				if(randomVal > userVal ) {
					System.out.println("입력값보다 큽니다.");
				} else {
					System.out.println("입력값보다 작습니다.");
					}
			}
			System.out.println("정답은" + randomVal + "입니다." );
	}
}
