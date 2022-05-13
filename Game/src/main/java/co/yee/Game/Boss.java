package co.yee.Game;

import java.util.Random;


import Item.Armor;
import Item.HpPotion;
import Item.MpPotion;
import Item.Weapon;
import VO.CharacterVO;

public class Boss extends Monster {
	 	
	
	private double mp;
	    private double maxMp;

	    private Weapon weapon;//무기
	    private Armor armor;//방어구



	    public Boss(String name,
	                double hp,
	                double maxhp,
	                double strength,
	                double defense,
	                int money,
	                int exp,
	                int lev,
	                String defaultAttackname,
	                HpPotion hpPotion,
	                MpPotion mpPotion,
	                double mp,
	                double maxMp,

	                Weapon weapon,
	                Armor armor,
	                String script) {
	        super(name, hp, maxhp, strength, defense, money, exp, lev, defaultAttackname, hpPotion, mpPotion, script);
	       
	        this.mp = mp;
	        this.maxMp = maxMp;
	        
	        this.weapon = weapon;
	        this.armor = armor;
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

	 

	    	public int dropItem(Adventurer adventurer) {
	        Random random = new Random();
	        int potionDropCount = (random.nextInt(5) + 1);
	        double moneyDropPercentage = 0.1 * (random.nextInt(3) + 8);
	        adventurer.setMoney((int) (adventurer.getMoney() + this.money * moneyDropPercentage));
	        adventurer.setExp(adventurer.getExp() + this.getExp());
	        for (int i = 0; i < potionDropCount; i++) {
	            if (this.hpPotion.getName().equals("하급 hp포션")) {
	                adventurer.getLowHpPotions().add(this.hpPotion);
	                adventurer.getLowMpPotions().add(this.mpPotion);
	            } else if (this.hpPotion.getName().equals("중급 hp포션")) {
	                adventurer.getMidHpPotions().add(this.hpPotion);
	                adventurer.getMidMpPotions().add(this.mpPotion);
	            } else {
	                adventurer.getHighHpPotions().add(this.hpPotion);
	                adventurer.getHighMpPotions().add(this.mpPotion);
	            }
	        }

	        if (!this.name.equals("말레니아")) {//무기 획득
	            adventurer.getWeapons().add( this.weapon);
	            adventurer.getArmors().add(this.armor);

	        } 
	        return potionDropCount;
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

	    public String getScript() {
	        return script;
	    }

	    public void setScript(String script) {
	        this.script = script;
	    }
}
