package co.edu;

public class Member {
	// 필드 = > 회원아이디, 회원이름, 회원연락처, 회원 나이.
	private String memberId; // member class 안에서만 접근함
	private String memberName;
	private String memberPhone;
	private int memberAge; // 마이너스 값이 들어가면 안됨.
	
	
	
	
	//생성자
	public Member(String memberId, String memberName, String memberPhone, int memberAge) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberPhone = memberPhone;
		this.memberAge = memberAge;
	}
	
	
	
	
	
	
	// 메소드 
	void setMemberId(String memberId) {
		this.memberId = memberId; 
	}
	
	String getMemberId() {
		return memberId; 
	}
	
	
	
	
	
	
	
	public String getMemberName() {
		return memberName;
	}






	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}






	public String getMemberPhone() {
		return memberPhone;
	}






	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}






	void setMemberAge(int age) { //void는 return 을 쓸게 없을때 쓴다.
		if(age < 0 ) {
			memberAge = age;
		}else {
			memberAge = age;
		}
		
		
	}
	
	int getMemberAge(){ //반환내용이 있어야함. 메소드
		return memberAge;
	}
	
	
	void showInfo() {
		System.out.printf("회원 이름 %4s \n 연락처 %13s\n 나이 %2d\n", memberName, memberPhone, memberAge);
	}
	
	
	
	
	
}
