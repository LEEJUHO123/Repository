package co.edu.loop;

import java.util.Scanner;

public class AccountExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int balance = 0;
		int money = 0;
		boolean run = true;

		while (run) {
			System.out.println("========================");
			System.out.println("1.예금 2.출금 3.조회 4.종료");
			System.out.println("선택>>>");
			int menu = scn.nextInt();
			

			if (menu == 1) {
				// 예금기능.
				System.out.println("예금액>");
				money = scn.nextInt();
				balance += money;
			} else if (menu == 2) {
				// 출금기능.
				System.out.println("출금액");
				money = scn.nextInt();
				balance -= money;
				if (balance < money) {
					System.out.println("잔고가 부족합니다.");
					System.out.println("인출할 금액을 입력해주세요");
					if (balance >= money) {
						balance -= money;
						System.out.println("출금이 완료되었습니다.");
					}
				}

			} else if (menu == 3) {
				// 조회기능.
				System.out.println("잔금");
			
				

				System.out.println("잔고>" + balance);
			} else if (menu == 4) {
				// 종료

				run = false;

			} else {
				System.out.println("잘모소딘 메뉴를 선택했습니다.");
			}

		} // end of while(run)

		System.out.println("프로그램 종료.");

	}
}
