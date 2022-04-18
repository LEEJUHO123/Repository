package co.edu.statics;
// co.edu.statics.Person => 
public class Person {
	final String nation = "Korea"; 
	final String ssn;	// ssn은 값을 할당하진않음. 생성자를 통해 값을 할당한다!
	static final double PI = 3.14; //fianl 이니까 PI값은 더이상 바꿀 수 없음.
									//static final이 있으면 한번 선언되어지면 이 3.14는 항상 공통.
	                                //클래스소속, 변경불가.final 이고 static = 상수 라고 표현 
	
	String name;
	
	
	
	
	//생성자
	public Person (String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
