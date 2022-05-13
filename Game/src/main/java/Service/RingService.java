package Service;


import VO.CharacterVO;

public interface RingService {

	// 공격하기
	int attack(CharacterVO target);
	
	//공격력 증가
	void increStrength(CharacterVO strength);
	
	//방어력 증가
	void increDefense(CharacterVO defense);
	
	//생명력 증가
	void increHp(CharacterVO hp);
	
	// 캐릭터 정보 가져오기
	CharacterVO characterSelect(String id);
	
	
	
	
	
	
	
}
