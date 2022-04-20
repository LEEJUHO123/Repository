package co.edu.collection;

import java.util.ArrayList;

import co.edu.friend.Friend;
import co.edu.friend.Gender;

public interface FriendService {
	//추가, 수정, 삭제, 조회
	public int ADD = 1;
	public int MOD = 2;
	public int DEL = 3;
	public int SEARCH = 4;
	public int FINE_MEN = 5;
	public int FIND_WOMEN = 6;
	
	
	
	public void addFriend(Friend friend);
//	public void modFriend(String name, String phone);
	public void modFriend(Friend friend);
	public void remFriend(String name);
	public Friend findFriend(String name);
	public ArrayList<Friend> findGender(Gender gender);
}
