package co.yee.Game;

import java.util.ArrayList;

import Item.Armor;
import Item.HpPotion;
import Item.MpPotion;
import Item.Weapon;

public class Shop {
	private ArrayList<Weapon> weapons;
	private ArrayList<Armor> armors;
	private ArrayList<HpPotion> hpPotions;
	private ArrayList<MpPotion> mpPotions;

	public Shop(ArrayList<Weapon> weapons, ArrayList<Armor> armors, ArrayList<HpPotion> hpPotions, ArrayList<MpPotion> mpPotions) {
		this.weapons = weapons;
		this.armors = armors;
		this.hpPotions = hpPotions;
		this.mpPotions = mpPotions;
	}


	public ArrayList<Weapon> getWeapons() {
		return weapons;
	}

	public void setWeapons(ArrayList<Weapon> weapons) {
		this.weapons = weapons;
	}

	public ArrayList<Armor> getArmors() {
		return armors;
	}

	public void setArmors(ArrayList<Armor> armors) {
		this.armors = armors;
	}

	public ArrayList<HpPotion> getHpPotions() {
		return hpPotions;
	}

	public void setHpPotions(ArrayList<HpPotion> hpPotions) {
		this.hpPotions = hpPotions;
	}

	public ArrayList<MpPotion> getMpPotions() {
		return mpPotions;
	}

	public void setMpPotions(ArrayList<MpPotion> mpPotions) {
		this.mpPotions = mpPotions;
	}
	
	
}
