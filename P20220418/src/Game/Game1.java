package Game;

import java.util.Scanner;

public class Game1 {
	Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
//		System.out.println("[*] [*] [*] [*] [*]");
//		System.out.println("[*] [*] [*] [*] [*]");
		
// 		5를 찾는다
// 		배열1번, 배열2번 이렇게 때려찍어서 5를 못찾으면 그 자리에 별은 지워짐.
// 		5를 끝까지 못찾으면 나머지 별들 다 보여짐.
		int[] problem = new int [5];
		for(int i = 0; i<5; i++) {
			problem[i] = i + 1;
			
		
		}
			
		
		
		for(int i = 0; i<5; i++) {
			if(i==0) {
				System.out.print("["+problem[i]+"]");
			}else {
				System.out.print("[*]");
			}
		}
		

		
		
		
		
	}
}
