package co.edu.dimension;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		boolean run = true;
		int[] scores = null;
		int studentNum = 0;
		Scanner scn = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5. 종료");
			System.out.println("---------------------------");
			System.out.print("선택>");
			
			int selectNo = Integer.parseInt(scn.nextLine());
			
			if(selectNo == 1) {
				System.out.println("학생수 >>>");
				studentNum = Integer.parseInt(scn.nextLine());
				scores = new int[studentNum];  // new 생성하는거
				
			}else if(selectNo == 2) {
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores["+i+"]>");
					scores[i] = Integer.parseInt(scn.nextLine()); //문자열을 숫자로
				}
				
			}else if(selectNo == 3) {
				for (int i=0; i<scores.length; i++) {
					System.out.println("scores["+i+"]>" + scores[i]);
				}
				
			}else if(selectNo == 4 ) { //분석
				int maxVal, sum;
				maxVal = sum = 0; 	//변수 초기화
				for(int i = 0; i < scores.length; i++) {
					sum += scores[i];
					if(maxVal < scores[i]) {
						maxVal = scores[i];
					}
				}
				System.out.println("최고 점수 : " + maxVal);
				System.out.printf("평균 점수 : %.2f", (double) sum / scores.length);
			}else if(selectNo == 5 ) { //종료
				run = false;
				
			}
			
			
		}
		System.out.println("프로그램 종료");
	}
}
