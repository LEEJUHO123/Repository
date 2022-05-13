package app;

import java.util.List;
import java.util.Scanner;

import service.TestVO;

import service.TestService;
import service.TestServiceImpl;


public class Test {
	TestService dao = new TestServiceImpl();
	
	public void main() {
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		while(run) {
			System.out.println("========================================");
			System.out.println("1.등록 2.수정 3.삭제 4.메모조회 5.전체조회 9.종료");
			System.out.println("========================================");
			System.out.print("선택>>");

			int select = sc.nextInt();
			switch (select) {
			case 1:
				insert();
				break;
			case 2:
				modify();
				break;
			case 3:
				delete();
				break;
			case 4:
				selectMemo();
				break;
			case 5:
				selectAllMemo();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			}
		}
	}
	
	public void insert() {

		Scanner sc = new Scanner(System.in);
		TestVO test = new TestVO();
		System.out.print("메모번호>>");
		String num = sc.nextLine();
		test.setNum(num);
		System.out.print("메모제목>>");
		String title =sc.nextLine();
		test.setTitle(title);
		System.out.print("메모작성자>>");
		String writer = sc.nextLine();
		test.setWriter(writer);
		System.out.print("메모내용>>");
		String content = sc.nextLine();
		test.setContent(content);
		dao.insertTest(test);
		
		}
	
	public void modify() {
		TestVO test = new TestVO();
		Scanner sc = new Scanner(System.in);
		System.out.print("메모번호>>");
		String num = sc.nextLine();
		test.setNum(num);
		System.out.print("메모내용>>");
		String content = sc.nextLine();
		test.setContent(content);
		dao.updateTest(test);
	}
	
	public void delete() {
		Scanner sc = new Scanner(System.in);
		System.out.print("메모번호>>");
		String num = sc.nextLine();
		dao.deleteTest(num);
		
	}
	
	public void selectMemo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("메모번호>>");
		String num = sc.nextLine();
		TestVO test = dao.selectTestInfo(num);
		if(test == null) {
			System.out.println("메모가 등록되어있지 않습니다.");
		}else {
			System.out.println(test);
		}
		
	}
	
	public void selectAllMemo() {
		List<TestVO> list = dao.selectAllList();
		for (TestVO test : list) {
			System.out.println(test);
		}
	
	
	}
}

	