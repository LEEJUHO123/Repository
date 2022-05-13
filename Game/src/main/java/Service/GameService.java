package Service;

import VO.CharacterVO;

public interface GameService {

	
	//캐릭터 생성
	int insertChar(String name);
	//닉네임 중복체크
	String nameCheck(String name);
	//현재상태보기 / 캐릭터 잇는지 확인
	CharacterVO selectChar(String name);
	
	
	
	
}
