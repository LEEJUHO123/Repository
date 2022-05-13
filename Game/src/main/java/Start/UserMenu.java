package Start;

import java.util.Scanner;

import Service.MemberService;
import VO.CharacterVO;
import serviceImpl.MemberServiceImpl;

public class UserMenu {

	private Scanner sc = new Scanner(System.in);
	private GameMain game = new GameMain();
	private InfoUpdate infoUpdate = new InfoUpdate();
	private MemberService ms = new MemberServiceImpl();
	// 접속 user 캐릭터 정보 저장
	public static CharacterVO loginCharacter = new CharacterVO();
	
	
	private void userTitle() {
		System.out.println("=================================");
		System.out.println("1. 게임접속   2. 정보수정   3. 로그아웃");
		System.out.println("==================================");
		
	}
	
	//사용자 메뉴
	
		private void userMenu() {
			boolean b = true;
			do {
				userTitle();
				System.out.println("메뉴를 선택하세요");
				int menu = sc.nextInt();
				switch(menu) {
				case 1 :
					//겜 접속
					game.run();
					break;
				case 2 :
					//정보수정
					infoUpdate.run();
					break;
				case 3 :
					// 로그아웃
					b = false;
					break;
				}
				
			}
			while(b);
		}
		
		public void run() {
			userMenu();
		}
		
}
