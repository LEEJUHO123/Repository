package co.test;

import java.util.Scanner;

// 종합.
// 클래스의 인스턴스와 배열의 활용.
// 친구의 소중한 정보를 관리하는 앱을 구현하세요.
// Exam4(친구정보) 클래스의 인스턴스를 저장, 수정, 삭제, 조회 처리.
public class Exam5 {
	public static void main(String[] args) {
		private static Exam4 [] members = new Exam4[10];
	    private static	Scanner scanner = Scanner(System.in);
	    static int num = 0;
	    boolean run = true;
	    
		while (true) {
			System.out.println("1.추가 2.수정 3.삭제(이름) 4.조회(이름) 5.종료");
			System.out.println("선택>>");
			
			int selectNo = scanner.nextInt();
			
		
			if(selectNo ==1) {
				CreatAccount();
			}
		
		
		
		
		
		}
		
		
		System.out.println("end of prog.");
	}
}
