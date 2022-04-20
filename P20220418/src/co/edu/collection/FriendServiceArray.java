package co.edu.collection;

import java.util.ArrayList;
import java.util.Scanner;

import co.edu.friend.Friend;
import co.edu.friend.Gender;

//배열의 기능 활용.
public class FriendServiceArray implements FriendService {
	Friend[] friends = new Friend[10];
	Scanner scn = new Scanner (System.in);
	
	@Override
	public void addFriend(Friend friend) {
		for(int i =0; i<friends.length; i++) {
			if(friends[i]==null) {
				friends[i]= friend;
				break;
			}
		}
		
	}

	@Override
	public void modFriend(Friend friend) {
		for(int i=0; i<friends.length;i++) {
			if(friends[i].getName().equals(friend.getName())) {
				
				System.out.print(friends[i].getName()+"의 수정할 번호 입력 >");
				String updateNum = scn.next();
				friends[i].setPhone(updateNum);
				System.out.println("수정 완료");
				break;
			} else {
				System.out.println("입력한 이름이 없음");
			}
		}
		

	}

	@Override
	public void remFriend(String name) {
		for(int i = 0; i < friends.length; i++) {
			if(friends[i].getName().equals(name)) {
				friends[i] = null;
				break;
			} else {
				System.out.println("이름이 없음 ");
			}
		}
		
	}

	@Override
	public Friend findFriend(String name) {
		for(int i = 0; i < friends.length; i++) {
			if(friends[i].getName().equals(name)) {
				System.out.println(friends[i]);
				break;
			}
		}
		
		return null;
		
	}

	@Override
	public ArrayList<Friend> findGender(Gender gender) {
		// TODO Auto-generated method stub
		return null;
	}

}
