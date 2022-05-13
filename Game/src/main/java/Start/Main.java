package Start;


import java.util.Scanner
;

import Service.MemberService;

import serviceImpl.MemberServiceImpl;



public class Main {
	private Scanner sc = new Scanner(System.in);
	private MemberService dao = new MemberServiceImpl();
	private Login login = new Login();
	private Member member = new Member();
	
	private void mainTitle() {
		System.out.println("============================");
		System.out.println("                            ");
		System.out.println("                            ");
		System.out.println("           엘든링             ");
		System.out.println("                             ");
		System.out.println("=============================");
		System.out.println("  1. 로그인 2. 회원가입  3. 종료  ");
		System.out.println("=============================");
	}
		
	private void mainMenu() {
		boolean b = true;
		do {
			mainTitle();
			System.out.println("메뉴를 선택하세요");
			int menu = sc.nextInt();
			switch(menu) {
			case 1:
				login.run();
				break;
			case 2 :
				member.run();
				break;
			case 3 :
				System.out.println("종료되었습니다.");
				b = false;
				break;
			}
		}
		while(b);
		
	}
		
	
		
	public void run() {
		mainMenu();
		
	}

	
	
	
	    
	
	
	
	





}
