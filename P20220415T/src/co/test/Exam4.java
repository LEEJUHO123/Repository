package co.test;

//클래스의 생성과 필드, 메소드, 생성자.
public class Exam4 {
	// 친구의 이름, 생일, 연락처(중복값이 없는 키의 역할)
	private String name;
	private String birth;
	private String PhoneNo;
	
	
	//생성자
	public Exam4(String name, String birth, String phoneNo) {
		super();
		this.name = name;
		this.birth = birth;
		this.PhoneNo = phoneNo;
	}


	
	
	//메소드
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBirth() {
		return birth;
	}


	public void setBirth(String birth) {
		this.birth = birth;
	}


	public String getPhoneNo() {
		return PhoneNo;
	}


	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}
	
	



}
