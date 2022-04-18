package co.edu.dimension;

import java.util.Scanner;

public class AloneExam {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scn = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------");
			System.out.println("1.학생수 2. 점수입력 3.점수리스트 4.분석 5.종료");
			System.out.println("--------------------------");
			System.out.println("선택 >");
			
			int selectNo = Integer.parseInt(scn.nextLine());
			
			
			if(selectNo == 1) {
				System.out.println("학생수를 입력하시오.");
				studentNum = Integer.parseInt(scn.nextLine());
				scores = new int[studentNum];
			}else if(selectNo ==2) {
				
			}
		}
	}

}
