package co.edu.collection.generic;

import java.util.ArrayList;

import co.edu.friend.Friend;

class Orange extends Object{
	
}

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.setField("Orange");
		String result = box.getField(); //Object -> String
		
		Box<Integer> box2 = new Box<Integer>();
		box2.setField(10);
		Integer result2 = box2.getField();
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동");
		
		ArrayList<Friend> friends = new ArrayList<Friend>();
		friends.add(new Friend("박길동", "010-2222"));
		
			//	Orange orange = (Orange)box.getField();
		
		System.out.println("end of prog");
	}
}
