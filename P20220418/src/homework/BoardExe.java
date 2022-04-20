package homework;

import java.util.Scanner;

public class BoardExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int menu = scn.nextInt();
		BoardApp board = new BoardApp();
		
		while(true) {
			System.out.println("1.글등록 2.글수정 3.글삭제 4.글상세조회(글번호) 5.전체목록 6.종료");
			System.out.println("메뉴판 번호를 입력하세요.");
			if(menu == BoardService.ADD) {
				System.out.println("제목");
				String title = scn.next();
				System.out.println("내용");
				String story = scn.next();
				System.out.println("작성자");
				String writer = scn.next();
				Board boards = new Board(title, story, writer); 
				board.addBoard(boards);
				
				
				
			}else if(menu == BoardService.MOD) {
				System.out.println("수정할 글을 조회하세요.(번호)");
				int A = scn.nextInt();
				board.modBoard(A);
				System.out.println("제목수정하세요");
				
			}else if(menu==BoardService.DEL) {
				System.out.println("삭제할 글을 선택하세요.(번호)");
				int B = scn.nextInt();
				board.delBoard(B);
				
			}else if(menu==BoardService.SEARCH) {
				System.out.println("글 상세조회 (번호)");
				int C = scn.nextInt();
				board.searchBoard(C);
			}else if(menu==BoardService.LIST) {
				System.out.println("전체목록입니다.");
				
			}else {
				System.out.print("종료");
			}
		
		}
		
		
		
	}
}
