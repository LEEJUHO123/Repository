package homework;

import java.util.ArrayList;
import java.util.Scanner;

import co.edu.friend.Friend;

public class BoardApp implements BoardService {
	//인터페이스 상속후 메소드 구현
	
	Scanner scn = new Scanner(System.in);
	
	ArrayList<Board> boards = new ArrayList<Board>();

	@Override
	public void addBoard(Board bo) {
		boards.add(bo);
		
	}

	@Override
	public void modBoard(int A) {
		System.out.println("수정할 제목을 입력하세요.");
		String modtitle = scn.next(); 
		for(int i=0; i<boards.size(); i++) {
			if(boards.get(i).getTitle().equals(modtitle)){
				boards.get(i).setTitle(modtitle);
				System.out.println("수정 완료");
				break;
			}
		}
		
		
	}

	@Override
	public void delBoard(int B) {
		for(int i = 0; i<boards.size(); i++) {
			if(boards.get(i).getNum().equals(B)) {
				boards.get(i).setNum(null);
				break;
				
				
			}
		}
		
		
	}

	@Override
	public void searchBoard(int C) {
		for(int i=0; i<boards.size(); i++) {
			if(boards.get(i).getNum().equals(C)) {
				System.out.println(boards.get(i));
				break;
			}
		}
		
		
	}

	@Override
	public void findBoard (Board bo) {
		for(int i=0; i<boards.size(); i++) {
			
				System.out.println(boards.get(i).toString());
				
			
		}
	}

	@Override
	public void exitBoard(Board bo) {
		
		
	}

	
	
	
	
	
	
	
}
