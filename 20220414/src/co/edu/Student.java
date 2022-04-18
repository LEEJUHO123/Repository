package co.edu;


public class Student {  
	
	// 필드. 뒤에 괄호가 없음.
	String name;
	String studNo;
	int age;
	double height;
	
	// 생성자. => 인스턴스를 만들어줄때 처리할 기능을 정의함.
	// 매개값이 없는 생성자를 기본생성자라고 말함. 기본생성자 -> public Student() { 생성자는 반환값이 없음.  
	public Student() {
		System.out.println("Student() 생성자가 호출되었습니다.");
	}
	
	//생성자는 필드의 값을 지정할 때  자주 사용함.
	public Student(String nm, String sn ) {
		name = nm;
		studNo = sn;
	
	}
	
	//생성자는 이름,학번, 나이 채워주는 생성자
	
	public Student(String nm, String sn, int ag) {
		name = nm;
		studNo = sn;
		age = ag;
	}
	
	public Student(String name, String studNo, int age, double height) {
		this.name =  name; // this.필드 = 변수
		this.studNo = studNo;
		this.age = age;
		this.height = height;
	}
	
	
	
	
	// 메소드. 무조건 뒤에 괄호있음. 메소드는 void -> 반환값이 있어야함.
	void study() {
		System.out.println(name + "가 공부를 합니다.");
		
	}
	


	void eat() {
		System.out.println(name + "가 식사를 합니다.");
}

	void showInfo()	{
		System.out.println("이름은" + name + "이고 학생 번호는" + studNo + "이고 나이는" + age +"그리고 키는 " + height + "입니다.");
}
}