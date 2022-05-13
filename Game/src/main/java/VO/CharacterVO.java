package VO;

public class CharacterVO {

	private String id;
	private String name;
	private double hp;
	private double maxHp;
	private double strength;
	private double defense;
	private int money;
	private int exp;
	private int lev;
	private String defaultAttackName;  //기본 공격
	
	
	public CharacterVO() {
		
	}


	
	
	
	
	public CharacterVO(String id, String name, double hp, double maxHp, double strength, double defense, int money,
			int exp, int lev, String defaultAttackName) {
		super();
		this.id = id;
		this.name = name;
		this.hp = hp;
		this.maxHp = maxHp;
		this.strength = strength;
		this.defense = defense;
		this.money = money;
		this.exp = exp;
		this.lev = lev;
		this.defaultAttackName = defaultAttackName;
	}



	
	



	public String getId() {
		return id;
	}






	public void setId(String id) {
		this.id = id;
	}






	public String getName() {
		return name;
	}






	public void setName(String name) {
		this.name = name;
	}






	public double getHp() {
		return hp;
	}






	public void setHp(double hp) {
		this.hp = hp;
	}






	public double getMaxHp() {
		return maxHp;
	}






	public void setMaxHp(double maxHp) {
		this.maxHp = maxHp;
	}






	public double getStrength() {
		return strength;
	}






	public void setStrength(double strength) {
		this.strength = strength;
	}






	public double getDefense() {
		return defense;
	}






	public void setDefense(double defense) {
		this.defense = defense;
	}






	public int getMoney() {
		return money;
	}






	public void setMoney(int money) {
		this.money = money;
	}






	public int getExp() {
		return exp;
	}






	public void setExp(int exp) {
		this.exp = exp;
	}






	public int getLev() {
		return lev;
	}






	public void setLev(int lev) {
		this.lev = lev;
	}






	public String getDefaultAttackName() {
		return defaultAttackName;
	}






	public void setDefaultAttackName(String defaultAttackName) {
		this.defaultAttackName = defaultAttackName;
	}






	@Override
	public String toString() {
		return " id : " + this.id
				+"캐릭명 : " + this.name
				+ ", hp : " + this.hp
				+ ", maxHp : " + this.maxHp
				+ ", 공격력 : " + this.strength
				+ ", 방어력 : " + this.defense
				+ ", 골드 : " + this.money
				+ ", 경험치 : " + this.exp
				+ ", 레벨 : " + this.lev
				+ ", 일반공격 : " + this.defaultAttackName;
	}
	

	
	
	
	
}
