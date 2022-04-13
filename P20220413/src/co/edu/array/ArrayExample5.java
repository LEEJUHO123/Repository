package co.edu.array;

import java.util.Scanner;

public class ArrayExample5 {
	public static void main(String[] args) {
	
		
		
		Scanner scn = new Scanner(System.in);
		//학생 5명의 수학점수를 담을 수 있도록 배열공간을 선언
		
		int[] scores = new int[5];
		
		for (int i = 0; i<scores.length; i++) {
			System.out.println("학생점수를 입력>>");
			scores[i] = scn.nextInt();
		}
		
		// 학생중에 최고점, 최저점. 얼마인가?
		
		
		int max = 0;
		int min = scores[0];
		
		for (int i = 0; i < scores.length; i++) {
			if(max < scores[i]) {
				max = scores[i];
			}
			if(min > scores[i]) {
				min = scores[i];
			}
			
			
		}///학생중에 최고점. 최저점.
		System.out.println(max +","+ min);
		
		//학생이름, 점수
		//배열, 배열 0 => 학생, 90
		
		
		
		
	
}
}
