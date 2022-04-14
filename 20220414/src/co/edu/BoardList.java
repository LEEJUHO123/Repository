package co.edu;

public class BoardList {
	private Board[] boards;
	//배열크기 초기화
	public void init(int size) {
		boards = new Board[size];
		
	}
	//배열에 한건 입력
	public boolean addBoard(Board board) {
		// 더이상 저장공간 없을때.. false
	//	boolean check = false;
		int errorCase = -1; // 저장공간이 없음.
		for(int i=0; i<boards.length; i++) {
			if(boards[i]!=null && boards[i].getBoardNo() == board.getBoardNo()) {
				errorCase = 1; //동일한 값이 있을경우의 에러.
				break;
			}
			if (boards[i] == null) {
				boards[i] = board;
				errorCase = 0; //정상처리.
				break;
			}
		}
		
		return check;
	}
	//수정 : 게시글 번호 찾아서 내용과 제목만 바꾸기
	public void modifyBoard(Board board) {
		for(int i=0; i<boards.length; i++) {
			if(boards[i].getBoardNo() == board.getBoardNo()) {
				boards[i].setContent(board.getContent());
				boards[i].setTitle(board.getTitle());
				check = true;
				break;
			}
		}
		return check;
	}
		//삭제 : 게시글번호
	public void removeBoard(int bNo) {
		for (int i = 0; i < boards.length; i++) {
			if(boards[i].getBoardNo()==bNo) {
				boards[i] = null; //배열의 위치 null 대입.
				break;
			}
		}
		return check;
	}
			
	
	//한건 조회 : 게시글 번호. 
	public Board searchBoard(int bNo) {
		for(int i = 0; i < boards.length; i++) {
			if(boards[i].getBoardNo() == bNo) {
				int currentCnt = boards[i].getSearchCnt();
				boards[i].setSearchCnt(i);
				return boards[i];
			}
		}
		
		return null;
	}
	
	
	
	
	
	
				
				
				
				
		
			}
		}
		
	}


	
	// 게시글 목록
	public Board[] boardList() {
		return boards;
	}
}	
	
}
