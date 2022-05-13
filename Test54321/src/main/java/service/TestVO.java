package service;

public class TestVO {

	private String num;
	private String title;
	private String writer;
	private String content;
	
	
	public TestVO() {
		
	}
	
	
	public TestVO(String num, String title, String writer, String content) {
		super();
		this.num = num;
		this.title = title;
		this.writer = writer;
		this.content = content;
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


	public String getWriter() {
		return writer;
	}


	public void setWriter(String writer) {
		this.writer = writer;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "메모번호 : " + num + ", 메모제목 : " + title + ", 메모 작성자 : " + writer + ", 메모 내용 : " + content;
	}
	
	
}
