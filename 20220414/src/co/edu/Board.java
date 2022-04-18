package co.edu;

public class Board extends Object {   //Object 라는 클래스를 상속받아서 쓰고있음.
	//게시글 번호, 제목, 내용, 작성자, 조회회수(조회할때마다 증가)
	private int boardNo;
	private String title;
	private String content;
	private String writer;
	private int searchCnt =0;
	
	static String writerDate;
	static void writedate() {
		System.out.println("날짜 출력");
	}
	
	//생성자
	public Board(int boardNo, String title, String content, String writer) {
		this.boardNo = boardNo;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getSearchCnt() {
		return searchCnt;
	}

	public void setSearchCnt(int searchCnt) {
		this.searchCnt = searchCnt;
	}
	
	public void getInfo() {
		//게시글번호 작성자 내용 작성자 조회수
		System.out.printf("%3d %10s %15s %4s %2d", //
		this.boardNo, this.title, this.content, this.writer, this.searchCnt);
	}
	
	public void getDetailInfo() {
		//게시글 번호			작성자
		// 제목				조회수
		//내용
		String info = "===================================================" +
						"게시글번호 : %2d               작성자 : %-5s\n" +
						"제목 : %-10s                 조회수 : %3d\n "+
						"내용 : %-30s" + //
						"==================================================\n";
		System.out.printf(info, // 
				 this.boardNo, this.writer, this.title,this.searchCnt, this.content);
	}

	@Override // 부모클래스 toString -> 자식클래스 재정의.
	public String toString() {   //toString 은 Object라는 클래스가 가지고있음. toString->부모  String -> 자식
		return "Board [boardNo=" + boardNo + ", title=" + title + ", content=" + content + ", writer=" + writer
				+ ", searchCnt=" + searchCnt + "]";
	}
	
	
	
}
