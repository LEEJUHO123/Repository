package homework;

import java.util.Scanner;

public class rock {
	public static void main(String[] args) {
		// 1(가위)=2(바위), 2(바위)=3(보), 3(보)=1(가위) 의 경우 이김
		// else 는 짐
		Scanner scn = new Scanner(System.in);
		System.out.println("1=가위, 2=바위, 3=보 입니다. 해당하는 숫자를 입력하세요.");
		int randomVal1 = (int)(Math.random()*3) +1;
		int userVal1= scn.nextInt();
		if((randomVal1 == 1 && userVal1 == 2) || (randomVal1 == 2 && userVal1 == 3) || (randomVal1 == 3 && userVal1 == 1)) {
			System.out.println("이겼습니다.");
			
		} else {
			System.out.println("졌습니다.");
			if(randomVal1 ==1) {
				System.out.println("상대는 가위 였습니다");
			}else if (randomVal1 ==2 ) {
				System.out.println("상대는 바위 였습니다.");
			}else if (randomVal1 ==3 ) {
				System.out.println("상대는 보 였습니다.");
			}
		}
		
	}

}
