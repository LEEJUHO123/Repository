package co.edu.friend;

import java.util.Scanner;

public class FriendList {
	public static void main(String[] args) {
		
		final String val = "Hong";
//		val = "Hong2"; final 하면 변경 불가.
		
		Friend[] friends = new Friend[10];
//		friends[0] = new UnivFriend("홍길동","010-1321-3233", "대구대", "컴정");
//		friends[1] = new ComFriend("김길동", "010-3456-2345","네이버", "개발팀");
//		friends[2] = new Friend("박길동", "010-3343-3123");
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("1.친구등록 2.리스트 3.조회(이름) 4.종료");
			int menu = scn.nextInt();
			if(menu == 1) {
				Friend friend = null;
				System.out.println("1.회사친구 2.학교친구 3.친구");
				menu = scn.nextInt();
				
				System.out.println("친구이름>>>");
				String name = scn.next();
				System.out.println("친구연락처>>");
				String phone = scn.next();
				if(menu ==1) {
					System.out.println("회사정보>>");
					String company = scn.next();
					System.out.println("부서정보>>");
					String depart = scn.next();
					friend = new ComFriend(name, phone, company, depart);
				}else if(menu ==2) {
					System.out.println("대학정보>>");
					String univ = scn.next();
					System.out.println("전공>>");
					String major = scn.next();
					friend = new UnivFriend(name, phone, univ, major);
				}else if(menu ==3) {
					
					friend = new Friend(name, phone);
				}
				
				//비어있는 위치배열 저장.
				for(int i=0; i<friends.length; i++) {
					if(friends[i] == null) {
						friends[i] = friend;
						break;
					}
				}
				
				//이름과 전화번호는 공통으로 입력할 필드.
//				System.out.println("친구이름>>");
//				String name = scn.next();
//				System.out.println("친구연락처>>");
//				String phone = scn.next();
				
			}else if(menu == 2) {
				 for(Friend friend : friends) {
					 if(friend != null) {
						 
					 }
				 }
			}else if(menu == 3) {
				
			}else if(menu == 4) {
				System.out.println("프로그램 종료.");
				break;
			}
		}
		
		
		
		
		
		
		for(Friend friend : friends) {
			if(friend != null) {
				System.out.println("친구정보 : " + friend.toString());
			}
		}
	}
}
