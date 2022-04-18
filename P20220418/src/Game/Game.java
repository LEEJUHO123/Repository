package Game;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int Ary[] = new int[5];

		for (int i = 0; i < Ary.length; i++) {
			Ary[i] = (int) ((Math.random() * 5) + 1);

			for (int j = 0; j < i; j++) {
				if (Ary[i] == Ary[j]) {
					i--;
					break;
				}
			}

		}
		System.out.print("임의의 값 : ");
		for (int j = 0; j < Ary.length; j++) {
			System.out.print("[" + Ary[j] + "]");

		}
		
		while(true) {
			int select = scn.nextInt();
			if(Ary[select-1]==5) {
				System.out.println("정답입니다.");
				
			}else {
				System.out.println("틀렸습니다.");
				
			}
		}
		
	}
}
