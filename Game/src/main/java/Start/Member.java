package Start;

import java.util.Scanner;

import Service.MemberService;
import VO.MemberVO;
import serviceImpl.MemberServiceImpl;

public class Member {

	private Scanner sc = new Scanner(System.in);
	private MemberService dao = new MemberServiceImpl();
	
	private void memberJoinTitle() {
		
		System.out.println("=============================");
		System.out.println("=======회   원   가    입======");
		System.out.println("=============================");
	}
	
	//회원가입
	private void memberJoin() {
		memberJoinTitle();
			System.out.println("아이디를 입력하세요.");
			String id = sc.next();
			System.out.println("비번을 입력하세요");
			String pw = sc.next();
			System.out.println("이름을 입력하세요");
			String name = sc.next();
			
			MemberVO member = new MemberVO(id, pw, name);
			String[] checkIdPw = dao.check(id);
			String checkId = checkIdPw[0];
			if(checkId != null && checkId.equals(id)) {
				System.out.println("이미 존재하는 아이디입니다.");
			}else {
				dao.insertMember(member);
				System.out.println(member.getName()+ "환영합니다.");
			}
	}
			public void run() {
				memberJoin();
			}
	}
	

