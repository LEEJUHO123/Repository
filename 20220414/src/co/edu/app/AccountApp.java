package co.edu.app;

import java.util.Scanner;

public class AccountApp {

 private static Account[] accounts = new Account[100]; // 계좌정보를 저장하기 위한 배열.
 private static Scanner scanner = new Scanner(System.in);
 public static void main(String[] args) {
	
}
 
 static int num = 0;
 


	
	public void execute() {
		
		while(true) {
			System.out.println("1.계좌생성 2.입금 3.출금 4.목록조회 5.종료"); 
			System.out.println("선택>>");
			int menu =scanner.nextInt();
			
			if(menu == 1) {
				creatAccount();
				
			}else if(menu ==2) {
				accountList();
			}else if(menu == 3) {
				deposit();
			}else if(menu == 4) {
				withdraw();
			}else if(menu == 5) {
				System.out.println("프로글매을 종료");
				break;
			}
		}
		System.out.println("end of prog.");
	}
	
	//계좌 생성 시 실행할 메소드.
	public void creatAccount() {
		String ano = scanner.next();
		String owner = scanner.next();
		String balance = scanner.next();
		
		Account newAccount = new Account(ano, owner, balance);
		System.out.println("=============");
		System.out.println("계좌생성");
		System.out.println("==============");
		System.out.println("계좌번호");
		
		accounts[0].setAno(ano);
		System.out.println("계좌주");
		
		accounts[0].setOwner(owner);
		System.out.println("초기입금액");
		
		accounts[0].setBalance(balance);
		System.out.println("결과 : 계좌가 생성되었습니다.");
		
		num++;
		
	
		
		
		
		
		
	}
	//입금처리 시 실행할 메소드.
	public void deposit() {
		System.out.println("------------------");
		System.out.println("예금");
		System.out.println("------------------");
		System.out.println("계좌번호 입력>>>>");
		String ano = scanner.next();
		System.out.println("예금액 입력>>>");
		findAccount(ano).setBalance(findAccount(ano).getBalance()+scanner.nextInt());
		
		
	}
	//출금처리 시 실행할 메소드.
	public void withdraw() {
		System.out.println("-------------------");
		System.out.println("출금");
		System.out.println("-------------------");
		System.out.println("계좌번호 입력>>>");
		String ano = scanner.next();
		System.out.println("출금액 :");
		int remain = findAccount(ano).getBalance() - scanner.nextInt();
		if(remain<0) {
			System.out.println("결과:출금이 실패");
		}else {
			findAccount(ano).setBalance(remain);
			System.out.println("결과 : 출금이 성공되었습니다.");
		}
		
	}
	// 전체목록 실행 메소드.
	public void accountList() {
		System.out.println("--------------------");
		System.out.println("계좌목록");
		System.out.println("--------------------");
		for(int i = 0; i<num; i++) {
			System.out.println(accounts[i].getAno()+"\t"+accounts[i].getOwner()+accounts[i].getBalance());
		}
		
		}
	private static Account findAccount(int ano) {
		
		return null;
	}
	
	
	
	
	
	
}
