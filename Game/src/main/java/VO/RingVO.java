package VO;

public class RingVO {

	private int attack; //공격하기
	
	private int strengthIncre; // 지건연습 (공격력증가)
	
	private int defenseIncre; // 텟카이 ( 방어력 증가)
	
	private int HpIncre; // 살크업(생명력 증가)

	
	public RingVO() {
		
	}
	
	
	public RingVO(int attack, int strengthIncre, int defenseIncre, int hpIncre) {
		super();
		this.attack = attack;
		this.strengthIncre = strengthIncre;
		this.defenseIncre = defenseIncre;
		HpIncre = hpIncre;
	}


	public int getAttack() {
		return attack;
	}


	public void setAttack(int attack) {
		this.attack = attack;
	}


	public int getStrengthIncre() {
		return strengthIncre;
	}


	public void setStrengthIncre(int strengthIncre) {
		this.strengthIncre = strengthIncre;
	}


	public int getDefenseIncre() {
		return defenseIncre;
	}


	public void setDefenseIncre(int defenseIncre) {
		this.defenseIncre = defenseIncre;
	}


	public int getHpIncre() {
		return HpIncre;
	}


	public void setHpIncre(int hpIncre) {
		HpIncre = hpIncre;
	}
	
	
	
	
	
	
	
}
