package co.edu.app;

public class Account {
	// 필드 : 계좌번호, 예금주, 잔액 
	private int ano;
	private String owner;
	private int balance;

	
	
	// 생성자 : 
	
	public Account(int ano, String owner, int balance) {
		super();
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}



	
	// Getter,Setter 만들기.


	public int getAno() {
		return ano;
	}



	public void setAno(int ano) {
		this.ano = ano;
	}



	public String getOwner() {
		return owner;
	}



	public void setOwner(String owner) {
		this.owner = owner;
	}



	public int getBalance() {
		return balance;
	}



	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	

}
