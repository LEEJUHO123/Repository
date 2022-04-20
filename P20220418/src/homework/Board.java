package homework;

public class Board  {

//게시글 번호/ 제목/ 내용/ 작성자 /작성일시
	
	private String num;
	private String title;
	private String story;
	private String writer;
	private String date;
	
	public Board(String title, String story, String writer) {
		
	}

	
	public Board(String num, String title, String story, String writer, String date) {
		super();
		this.num = num;
		this.title = title;
		this.story = story;
		this.writer = writer;
		this.date = date;
	}


	
	public String getNum() {
		return num;
	}


	public void setNum(String num) {
		this.num = num;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getStory() {
		return story;
	}


	public void setStory(String story) {
		this.story = story;
	}


	public String getWriter() {
		return writer;
	}


	public void setWriter(String writer) {
		this.writer = writer;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}
	
	
	
	
	
	
	
	
}
