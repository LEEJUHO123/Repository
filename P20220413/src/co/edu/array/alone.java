package co.edu.array;

import java.util.Scanner;

public class alone  {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String[] names = new String [3]; //이름
		int[] scores = new int[3]; // 점수
		
		for (int i=0; i<names.length; i++) {
			System.out.println("학생이름 입력>>");
			names[i] = scn.nextLine();
			
			System.out.println();
		}
		
		
	}

}
