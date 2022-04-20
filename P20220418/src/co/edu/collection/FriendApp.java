package co.edu.collection;

import java.util.ArrayList;
import java.util.Scanner;

import co.edu.friend.Friend;
import co.edu.friend.Gender;

// 친구목록저장하기 위한 App.
// 추가, 수정, 삭제, 조회.
// 1)배열 2)컬렉션 <= 인터페이스 구현.
public class FriendApp {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		FriendService service = new FriendServiceArray();
		int menu = scn.nextInt();
		FriendService service = new FriendServiceList();
		// 추가, 수정, 삭제, 조회 => 컨트롤 역할
//		service.addFriend(null);
//		service.modFriend(null);
		
		
		while(true) {
			System.out.println("1.추가 2.수정 3.삭제 4.조회 5.남자 6.여자 7.종료");
			System.out.println("선택>");
			if(menu == FriendService.ADD) {
				System.out.println("이름 입력>");
				String name = scn.next();
				System.out.println("전번 입력>");
				String phone = scn.next();
				System.out.println("성별(남자,여자)>>");
				String gender = scn.next();
				Gender gen = Gender.MEN;
				if(gender.startsWith("남")) {
					gen=Gender.MEN;
				}else if(gender.startsWith("여")){
					gen=Gender.WOMEN;
				}
				Friend friend = new Friend(name, phone,gen);
				service.addFriend(friend);
				break;
				
			}else if(menu==2) {
				
				System.out.println("수정할 이름 입력>");
				String name = scn.next();
				Friend updateFriend = new Friend(name,null);
				service.modFriend(updateFriend);
				break;
				
				
				
			}else if(menu==3) {
				System.out.println("삭제할 이름 입력 >");
				String deleteName = scn.next();
			
				service.remFriend(deleteName);
				break;
				
				
				
				
			}else if(menu==FriendService.SEARCH) {
				System.out.println("조회할 이름 입력>");
				String selectName = scn.next();
				service.findFriend(selectName);
				break;
				
				
				
			}else if(menu ==FriendService.FINE_MEN ) {
				ArrayList<Friend> list = service.findGender(Gender.MEN);
				for (Friend friend : list) {
					System.out.println(friend.toString());
				}
			}else if(menu ==FriendService.FIND_WOMEN) {
				ArrayList<Friend> list = service.findGender(Gender.WOMEN);
				for(Friend friend : list) {
					System.out.println(friend.toString());
				}
			
			}else {
				System.out.println("프로그램을 종료.");
				break;
			}
		}
		System.out.println("end of prog");
		
	}
	
}
