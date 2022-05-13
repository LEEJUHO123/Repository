package Start;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Service.GameService;
import Service.MemberService;
import Service.RingService;
import VO.CharacterVO;
import VO.RingVO;
import serviceImpl.GameServiceImpl;
import serviceImpl.MemberServiceImpl;
import serviceImpl.RingServiceImpl;

public class GameMain {
	private Scanner sc = new Scanner(System.in);
	private GameService gs = new GameServiceImpl();
	private MemberService ms = new MemberServiceImpl();
	private List<RingVO> Rings = new ArrayList<RingVO>();
	private RingService rs = new RingServiceImpl();
	private RingVO vo = new RingVO();
	
	//접속유저 캐릭터 정보 출력

	
	private void gameTitle() {
		System.out.println("=================================");
		System.out.println("                            ");
		System.out.println("                            ");
		System.out.println("           엘든링             ");
		System.out.println("                             ");
		System.out.println("==================================");
	}
	
	private void gameMenuTitle() {
		System.out.println("======================================");
		System.out.println("==========1. 말레니아와 한판만 ===========");
		System.out.println("==    2. 수련  3. 상태창   4. 게임종료     ");
		System.out.println("=======================================");
	}
	
	private void gameMenu() {
		checkChar();
		boolean b = true;
		do {
			gameMenuTitle();
			int menu = sc.nextInt();
			switch(menu) {
			case 1 :
				GoAttack();
				break;
			case 2 :
				burning();
				break;
			case 3 :
				getStatus();
				break;
			case 4 :
				b = false;
				break;
			}
		}
		while(b);
	}
	

	//접속 user 캐릭터 유무 확인
	private void checkChar() {
		gameTitle();
		String name = gs.nameCheck(Login.loginMember.getId());
		if(name != null) {
			System.out.println("         "+ name + "님 어서오세요");
		}else if(name == null) {
			System.out.println(" 	캐릭터가 존재하지 않습니다     ");
			System.out.println("=============================");
			insertChar();
			
	
		}
	
}
	//캐릭터 생성
	private void insertChar() {
		System.out.println("캐릭터 생성중입니다. 닉네임을 입력하세요.");
		String name = sc.next();
		if(gs.nameCheck(name)==null) {
			gs.insertChar(name);
			System.out.println("생성 완료");
			checkChar();
		}else if(gs.nameCheck(name).equals(name)) {
			System.out.println("이미 존재하는 닉네임입니다.");
			insertChar();
		}
	}
	
	private void burning() {
			boolean b = true;
		
		while(b) {
			System.out.println("\n");
			System.out.println("수련하십시오.");
			System.out.println("1. 지건 연습(공격력) 2.텟카이 연습(방어력) 3.살크업(생명력) 4.되돌아가기");
			int menu = sc.nextInt();
			
			if(menu ==1) {
				increStrengthInfo();
			}else if(menu ==2) {
				increDefenseInfo();
			}else if(menu == 3) {
				increHpInfo();
			}else if(menu == 4) {
				gameMenu();
				b = false;
			}
			
			
		}
		
	}
	
	
	
	//피 증가
	private void increHpInfo() {
		System.out.println("생명력이 100 증가했습니다.");
		CharacterVO character = new CharacterVO();
		rs.increHp(character);
		
	}

	//방어력증가
	private void increDefenseInfo() {
		System.out.println("방어력이 10 증가했습니다.");
		CharacterVO character = new CharacterVO();
		rs.increDefense(character);
	}
	//공격력 증가
	private void increStrengthInfo() {
		System.out.println("공격력이 10 증가했습니다.");
		CharacterVO character = new CharacterVO();
		rs.increStrength(character);
		
	}

	//상태창
	private void getStatus() {
		System.out.println("상태창 입니다.");
			
			CharacterVO character = rs.characterSelect(Login.loginMember.getName());
					
					
			System.out.println(character);
			
		
	}
	
	private String inputCharacterName() {
		String name = null;
		System.out.println("");
		return null;
	}

	
	
	//사냥하러 이동
	
	private void GoAttack() {
		
		
		
		
		
		
	}



	
	public void run() {
		gameMenu();
	}
	
	
	}
