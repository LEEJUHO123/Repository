package co.edu.nested;

import co.edu.nested.Outer.Inner2;

public class Main {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.method1();
		
		//instance 멤버클래스.
		Outer.Inner1 inner = outer.new Inner1(); //static이 아님
		inner.method2();
		
		//static 멤버클래스
		Outer.Inner2.method5();
		
		// static 클래스의 인스턴스 메소드 호출하기.
		Outer.Inner2 inner2 = new Outer.Inner2();
		inner2.method4(); //인스턴스 메소드.
		inner2.method5(); //정적 메소드.
		
	}
}
