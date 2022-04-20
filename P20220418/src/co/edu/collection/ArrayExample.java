package co.edu.collection;

import java.util.ArrayList;

import co.edu.friend.Friend;

//배열 vs. 컬렉션
//배열활용한 프로그램, 컬렉션을 활용한 프로그램
//인터페이스 선언 => 구현하는 클래스.
public class ArrayExample {
	public static void main(String[] args) {
		// 배열은 크기 변경 불가능. vs 크기
		Friend[] friendAry = new Friend[10];
		friendAry[0] = new Friend("홍길동", "010-1111");
		friendAry[1] = new Friend("김길동", "010-2222");
//		friendAry[10] = null;
		for(int i=0; i<friendAry.length; i++) {
			if(friendAry[i] !=null) {
				System.out.println(friendAry[i].toString());
		}
		}
		Friend f1 = friendAry[0];
		
		//컬렉션을 활용. 인터페이스 => List : 컬렉션 => ArrayList
		ArrayList friendList = new ArrayList();
		friendList.add(new Friend("박길동", "010-3333")); // 추가
		friendList.add(new Friend("최길동", "010-4444"));
		friendList.remove(0); //삭제
		
		for(int i=0; i<friendList.size(); i++) {
			System.out.println(friendList.get(i));
		}
		
		Friend f2 = (Friend) friendList.get(0); //get(인덱스) => Object. / (Friend)는 캐스팅작업, 즉 형변환.
		
	}
}
