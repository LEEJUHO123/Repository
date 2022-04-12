package co.edu.loop;

import java.util.Scanner;

public class WhileExample2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean isTrue = true;
		int sum = 0;
		// 200이 넘게되면 반복문 빠져나오도록.
		while(isTrue) {
			System.out.println("더할 값을 입력하셈");
			int val = scn.nextInt();
			sum += val;
			// sum = sum+val;
			if (sum >= 200) {
				isTrue = false;
		}
		}
		System.out.println(sum);
			
			
		}
	}
