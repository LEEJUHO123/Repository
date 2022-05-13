package co.yee.Game;

import java.util.HashMap;

import java.util.List;
import java.util.Random;

import Item.Armor;
import Item.HpPotion;
import Item.Item;
import Item.MpPotion;
import Item.Weapon;
import VO.CharacterVO;


public class Adventurer extends CharacterVO{

	private double mp;
	private double maxMp;
	private int maxExp;
	private Weapon weapon;
	private Armor armor;
	
	private List<Weapon> weapons;
	private List<Armor> armors;
	private List<HpPotion> lowHpPotions;
	private List<HpPotion> midHpPotions;
	private List<HpPotion> highHpPotions;
	
	private List<MpPotion> lowMpPotions;
	private List<MpPotion> midMpPotions;
	private List<MpPotion> highMpPotions;
	
	private HashMap<String, String> scripts;

	
	public Adventurer(String name, double hp, double maxHp, double strength, double defense, int money, int exp,
			int lev, String defaultAttackName, double mp, double maxMp, int maxExp, Weapon weapon, Armor armor,
			List<Weapon> weapons, List<Armor> armors, List<HpPotion> lowHpPotions,
			List<HpPotion> midHpPotions, List<HpPotion> highHpPotions, List<MpPotion> lowMpPotions,
			List<MpPotion> midMpPotions, List<MpPotion> highMpPotions, HashMap<String, String> scripts) {
		super(name, hp, maxHp, strength, defense, money, exp, lev, defaultAttackName);
		this.mp = mp;
		this.maxMp = maxMp;
		this.maxExp = maxExp;
		this.weapon = weapon;
		this.armor = armor;
		
		this.weapons = weapons;
		this.armors = armors;
		this.lowHpPotions = lowHpPotions;
		this.midHpPotions = midHpPotions;
		this.highHpPotions = highHpPotions;
		this.lowMpPotions = lowMpPotions;
		this.midMpPotions = midMpPotions;
		this.highMpPotions = highMpPotions;
		this.scripts = scripts;
	}
	
	
			public int attack(CharacterVO target) {
	        Random random = new Random();
	        double percentage = 0.1 * (random.nextInt(3) + 8);//80~100%데미지
	        int damage = 0;
	        if(this.strength > target.getDefense()) {
	            damage = (int) ((int) (this.strength - target.getDefense()) * percentage);
	        }
	        target.setHp(target.getHp() - damage);
	        return damage;
	    }

	  
	  		public void levelUp() {
	        this.lev++;
	        this.exp = this.exp - this.maxExp;
	        this.maxExp += 200;
	        this.maxHp += 50;
	        this.maxMp += 50;
	        this.hp = this.maxHp;
	        this.mp = this.maxMp;
	        this.strength += 50;
	        this.defense += 50;
	       
	    }


	    public void buyItem(Item item) {
	        if(item instanceof Weapon) {
	            Weapon weapon = (Weapon) item;
	            this.weapons.add(weapon);//무기 추가
	            this.money -= weapon.getPrice();//돈 차감
	        }
	        else if(item instanceof Armor) {
	            Armor armor = (Armor) item;
	            this.armors.add(armor);//방어구 추가
	            this.money -= armor.getPrice();//돈 차감
	        }
	    }

	    public void buyItem(Item item, int count, String grade) {
	        if(item instanceof HpPotion) {
	            HpPotion hpPotion = (HpPotion) item;
	            if(grade.equals("low")) {
	                for(int i = 0; i < count; i ++) {
	                    this.lowHpPotions.add(hpPotion);
	                }
	            }
	            else if(grade.equals("mid")) {
	                for(int i = 0; i < count; i ++) {
	                    this.midHpPotions.add(hpPotion);
	                }
	            }
	            else if(grade.equals("high")) {
	                for(int i = 0; i < count; i ++) {
	                    this.highHpPotions.add(hpPotion);
	                }
	            }
	        }
	        else if(item instanceof MpPotion) {
	            MpPotion mpPotion = (MpPotion) item;
	            if(grade.equals("low")) {
	                for(int i = 0; i < count; i ++) {
	                    this.lowMpPotions.add(mpPotion);
	                }
	            }
	            else if(grade.equals("mid")) {
	                for(int i = 0; i < count; i ++) {
	                    this.midMpPotions.add(mpPotion);
	                }
	            }
	            else if(grade.equals("high")) {
	                for(int i = 0; i < count; i ++) {
	                    this.highMpPotions.add(mpPotion);
	                }
	            }
	        }
	    }

	   


	    public double getMp() {
	        return mp;
	    }

	    public void setMp(double mp) {
	        this.mp = mp;
	    }

	    public double getMaxMp() {
	        return maxMp;
	    }

	    public void setMaxMp(double maxMp) {
	        this.maxMp = maxMp;
	    }

	    public int getMaxExp() {
	        return maxExp;
	    }

	    public void setMaxExp(int maxExp) {
	        this.maxExp = maxExp;
	    }

	    public Weapon getWeapon() {
	        return weapon;
	    }

	    public void setWeapon(Weapon weapon) {
	        this.weapon = weapon;
	    }

	    public Armor getArmor() {
	        return armor;
	    }

	    public void setArmor(Armor armor) {
	        this.armor = armor;
	    }

	    public List<Weapon> getWeapons() {
	        return weapons;
	    }

	    public void setWeapons(List<Weapon> weapons) {
	        this.weapons = weapons;
	    }

	    public List<Armor> getArmors() {
	        return armors;
	    }

	    public void setArmors(List<Armor> armors) {
	        this.armors = armors;
	    }

	    public List<HpPotion> getLowHpPotions() {
	        return lowHpPotions;
	    }

	    public void setLowHpPotions(List<HpPotion> lowHpPotions) {
	        this.lowHpPotions = lowHpPotions;
	    }

	    public List<HpPotion> getMidHpPotions() {
	        return midHpPotions;
	    }

	    public void setMidHpPotions(List<HpPotion> midHpPotions) {
	        this.midHpPotions = midHpPotions;
	    }

	    public List<HpPotion> getHighHpPotions() {
	        return highHpPotions;
	    }

	    public void setHighHpPotions(List<HpPotion> highHpPotions) {
	        this.highHpPotions = highHpPotions;
	    }

	    public List<MpPotion> getLowMpPotions() {
	        return lowMpPotions;
	    }

	    public void setLowMpPotions(List<MpPotion> lowMpPotions) {
	        this.lowMpPotions = lowMpPotions;
	    }

	    public List<MpPotion> getMidMpPotions() {
	        return midMpPotions;
	    }

	    public void setMidMpPotions(List<MpPotion> midMpPotions) {
	        this.midMpPotions = midMpPotions;
	    }

	    public List<MpPotion> getHighMpPotions() {
	        return highMpPotions;
	    }

	    public void setHighMpPotions(List<MpPotion> highMpPotions) {
	        this.highMpPotions = highMpPotions;
	    }

	    public HashMap<String, String> getScripts() {
	        return scripts;
	    }

	    public void setScripts(HashMap<String, String> scripts) {
	        this.scripts = scripts;
	    }
	



	

}
