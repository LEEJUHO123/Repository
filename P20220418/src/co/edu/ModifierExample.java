package co.edu;

import co.edu.friend.Friend;


class Friend2 extends Friend{
	
	public Friend2() {
		super(); //생성자 호출은 super로 가능.
		this.getName(); //protect 된 것은 this로 접근 가능.
		
	}
}
public class ModifierExample {
	public static void main(String[] args) {
		Friend friend = new Friend();
	}
}
