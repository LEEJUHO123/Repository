package co.edu.collection;

import java.util.ArrayList;
import java.util.Scanner;

import co.edu.friend.Friend;
import co.edu.friend.Gender;

//컬렉션 ArrayList 활용
public class FriendServiceList implements FriendService {

	ArrayList<Friend> friends = new ArrayList<Friend>();
	Scanner scn = new Scanner(System.in);
	
	
	@Override
	public void addFriend(Friend friend) {
		friends.add(friend);
		
	}

	@Override
	public void modFriend(Friend friend) {
		for(int i=0; i<friends.size(); i++) {
			if(friends.get(i).getName().equals(friend.getName())) {
				System.out.println("수정할 번호 입력>");
				String updateNum = scn.next();
				friends.get(i).setPhone(updateNum);
				System.out.println("수정완료");
			break;
			
			}	
			}
			
		
	}

	@Override
	public void remFriend(String name) {
		for(int i=0; i<friends.size(); i++) {
	//		Friend findFriend = (Friend)friends.get(i);
			if (friends.get(i).getName().equals(name)) {
				friends.remove(i);
				System.out.println("삭제 완료");
			}else {
				System.out.println("조회할 이름이 없음.");
			}
		}
		
		
	}

	@Override
	public Friend findFriend(String name) {
		for(int i=0; i<friends.size(); i++) {
			if(friends.get(i).getName().equals(name)) {
				System.out.println(friends.get(i).toString());
			}else {
				System.out.println("조회할 이름이 없음.");
			}
		}
		
		
		return null;
	}
	
	
	public ArrayList<Friend> findGender(Gender gender){
		ArrayList<Friend> list = new ArrayList<Friend>();
		for(int i=0; i<friends.size(); i++) {
			if(friends.get(i).getGender() == gender) {
				//열거형타입 클래스타입 같은 참조타입.
				//기본타입 == 비교연산자.  //열거형은 .equals 대신에 ==씀
				// 열거형 == 비교연산자로 비교.
				list.add(friends.get(i));
			}
		}
		return list;
	}
	
	
	

}
