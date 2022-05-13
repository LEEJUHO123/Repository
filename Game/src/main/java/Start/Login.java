package Start;

import java.util.Scanner;

import Service.GameService;
import Service.MemberService;
import VO.CharacterVO;
import VO.MemberVO;

import serviceImpl.MemberServiceImpl;

public class Login {

	private UserMenu userMenu = new UserMenu();
	private Scanner sc = new Scanner(System.in);
	private MemberService ms = new MemberServiceImpl();
	
	
	
	
	//접속 user 정보 저장
	public static MemberVO loginMember = new MemberVO();
	//접속 캐릭터 정보 저장
	public static CharacterVO loginCharacter = new CharacterVO();
	
	public void loginTitle() {
		System.out.println("===============================");
		System.out.println("===========  로 그 인 ===========");
		System.out.println("===============================");
	}
	
	
	
	
	
	//로그인
	
	private void login() {
		loginTitle();
		System.out.println("아이디 입력하세요");
		String id = sc.next();
		System.out.println("비번 입력하세요");
		String pw = sc.next();
		
		String[] checkIdPw = ms.check(id);
		String checkId = checkIdPw[0];
		String checkPw = checkIdPw[1];
		
		if(checkId != null && checkId.equals(id) && checkPw.equals(pw)) {
			loginMember = ms.selectMember(id);
			System.out.println("로그인 성공!");
			loginMember.setId(checkId);
			userMenu.run();
		
		}else if(checkId == null) {
			System.out.println("존재하지않는 아이디입니다.");
			loginMember.setId("0");
		}else if(checkId != null && !checkPw.equals(pw)) {
			System.out.println("비번이 틀렸습니다.");
		}
		
	}
	
	
	
	




	public void run(){
		login();
	}
	
}
