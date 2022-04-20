package co.edu.nested;

import java.util.Scanner;

class Friend{
	String name;
	String phone;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Friend [name=" + name + ", phone=" + phone + ", age=" + age + "]";
	}
	
	
}
// 중첩클래스, 중첩인터페이스.
public class NestedApp {

	static Scanner scn = new Scanner(System.in);
	static Friend[] friends = new Friend[10];
	
	// 중첩인터페이스.
	interface FriendService{
		int ADD = 1;
		int MOD = 2;
		int LIST = 3;
		void add();
		void modify();
		void list();
		
	}
	
	//중첩클래스.
	static class FriendApp implements FriendService {

		
		
		@Override
		public void add() {
			System.out.println("이름>>");
			String name = scn.next();
			System.out.println("연락처>");
			String phone = scn.next();
			System.out.println("나이>>");
			int age = scn.nextInt();
			
			Friend friend = new Friend();
			friend.setName(name);
			friend.setPhone(phone);
			friend.setAge(age);
			
			
			for(int i=0; i<friends.length; i++) {
				if(friends[i]==null) {
					friends[i] = friend;
					break;
				}
			}
			
			
			//배열에 비어있는 위치에 저장.
		}

		@Override
		public void modify() {
			System.out.println("수정할 이름>");
			String name = scn.next();
			System.out.println("수정할 연착처>");
			String phone = scn.next();
			System.out.println("수정할 나이>");
			int age = scn.nextInt();
			
			for(int i=0; i<friends.length; i++) {
				if(friends[i].getName(()){
					friends[i].setName(name);
				}
			}
			
			
			
		}

		@Override
		public void list() {
			//배열에 저장되어있는 값을 출력.
			
		}
		
	}
	
	public static void main(String[] args) {
	
		FriendApp app = new FriendApp();
	
		
		app.add();
		app.add();
//		app.modify();
		app.list();
	}
}
