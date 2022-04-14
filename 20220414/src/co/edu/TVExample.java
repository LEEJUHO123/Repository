package co.edu;

public class TVExample {
	public static void main(String[] args) {
		//-> main 메소드가 있다는건 실행하는 데에 쓰겠다는 뜻
		
		int num = 10;
		String str = "Hello";
		
		//tv는 변수, public class Television 이라 설정해서 
		Television tv = new Television(); // new Televison 에 값을 담아줘야함
		tv.company = "삼성";
		tv.color = "검은색";   //괄호가 없는건 속성, 괄호가 있는건 
		tv.price = 300000;
		tv.model = "30Inch";
		tv.turnOn();
		tv.changeChanel(10);
		tv.turnOff();
		
		
		
		Television tv1 = new Television(); //tv 랑 tv1는 각각 다르 실체다 -> 객체 지향
//		tv != tv1;
		
		tv.company = "삼성";
		tv.color = "검은색";   //괄호가 없는건 속성, 괄호가 있는건 
		tv.price = 300000;
		tv.model = "30Inch";
		
		System.out.println(tv==tv1);
		System.out.println(tv1);
		System.out.println(tv1);
		
		Student stud1 = new Student();
		stud1.name = "홍길동";
		stud1.studNo = "22=1234567";
		stud1.age = 20;
		stud1.height = 174.5;
		
		Student stud2 = new Student();
		stud2.name = "우영원";
		stud2.studNo = "22-323456";
		stud2.age = 24;
		stud2.height = 165.3;
		
		Student stud3 = new Student("가나다" , "22-876543");
		stud3.age = 25;
		stud3.height = 163.5;
		
		Student stud4 = new Student("주호쨩","몰라",30);
		
		
		
		stud1.study();
		stud2.study();
		
		stud1.showInfo();
		
		stud4.showInfo();
		
		
		
		
	}
}
