package co.edu.dimension;

import java.util.Scanner;

public class StudentExample2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Student s1 = new Student(); //이름 나이 점수 를 넣을수잇는 공간을 만든것!!
		
		System.out.println("학생이름 점수 나이"); // 홍길동 80 20
		s1.studName = scn.next();
		s1.score = Integer.parseInt(scn.next()); // 1 ! (정수형 1)  = "1" (문자 1)
		s1.age = Integer.parseInt(scn.next());
		
		Student[] students = {new Student(), new Student(), new Student()};
		students[0].studName = scn.next();
		students[0].score = Integer.parseInt(scn.next());
		students[0].age=Integer.parseInt(scn.next());
		
		// 조회하고 싶은 이름 입력..
		// 해당이름 홍길동은 20살이고 80점입니다.
		
		
		
		System.out.println(scn.next());   // next는 스페이스기준으로 하나씩 잘라서 오겠다.?
		System.out.println(scn.next());
		System.out.println(scn.next());
	}

}
