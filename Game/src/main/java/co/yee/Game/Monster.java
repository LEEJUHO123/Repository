package co.yee.Game;

import java.util.Random;

import Item.HpPotion;
import Item.MpPotion;
import VO.CharacterVO;

public class Monster extends CharacterVO {
	
		protected HpPotion hpPotion;
	    protected MpPotion mpPotion;
	    protected String script;//대사

	    public Monster(String name, double hp, double maxhp, double strength, double defense, int money, int exp, int lev, String defaultAttackName, HpPotion hpPotion, MpPotion mpPotion, String script) {
	        super(name, hp, maxhp, strength, defense, money, exp, lev, defaultAttackName);
	        this.hpPotion = hpPotion;
	        this.mpPotion = mpPotion;
	        this.script = script;
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
	        int potionDropCount = random.nextInt(5) + 1;
	        double moneyDropPercentage = 0.1 * (random.nextInt(3) + 8);
	        adventurer.setMoney((int) (adventurer.getMoney() + this.money * moneyDropPercentage));
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
	        return potionDropCount;
	    }

	    public HpPotion getHpPotion() {
	        return hpPotion;
	    }

	    public void setHpPotion(HpPotion hpPotion) {
	        this.hpPotion = hpPotion;
	    }

	    public MpPotion getMpPotion() {
	        return mpPotion;
	    }

	    public void setMpPotion(MpPotion mpPotion) {
	        this.mpPotion = mpPotion;
	    }

	    public String getScript() {
	        return script;
	    }

	    public void setScript(String script) {
	        this.script = script;
	    }
	
}
