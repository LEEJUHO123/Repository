package Start;

import java.util.Scanner;

import Service.MemberService;
import serviceImpl.MemberServiceImpl;

public class InfoUpdate {

	private Scanner sc = new Scanner(System.in);
	private MemberService ms = new MemberServiceImpl();
	
	
	private void updateInfoTitle() {
		System.out.println("==================================");
		System.out.println(" ====1. 비밀번호 ====== 2.되돌아가기====");
		System.out.println("==================================");
	}
	
	//접속 user 정보
		private void loginInfo() {
			System.out.println("ID : " + Login.loginMember.getId());
			System.out.println("이름 : " + Login.loginMember.getName());
			
		}
		//정보 수정
		private void updateInfo() {
			// 접속자 정보 출력
			loginInfo();
			updateInfoTitle();
			int menu = sc.nextInt();
			switch(menu) {
			case 1:
				//비번 변경
				cgPw();
				break;
			case 2 :
				//되돌아가기
				break;
			}
		}
		
		//비번 변경
		private void cgPw() {
			System.out.println("현재 비번을 입력하세요 ");
			String pw = sc.next();
			System.out.println("변경할 비번을 입력하세요");
			String cgPw = sc.next();
			
			String[] checkIdPw = ms.check(Login.loginMember.getId());
			String checkPw = checkIdPw[1];
			
			if(checkPw != null && checkPw.equals(pw)) {
				Login.loginMember.setPw(cgPw);
				ms.updateMember(Login.loginMember);
				System.out.println("비번 변경완료!");
			}else if(!checkPw.equals(pw)) {
				System.out.println("현재 비번이 맞지 않습니다.");
			}
		}
		public void run() {
			updateInfo();
		}
		
		
}
