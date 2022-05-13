package Service;

import java.util.List;

import VO.MemberVO;

public interface MemberService {

	//회원가입
	int insertMember(MemberVO member);
	//아디 중복체크
	String[] check(String id);
	//회원조회(전체)
	List<MemberVO> selectListMember();
	//회원조회(하나)
	MemberVO selectMember(String id);
	//회원수정
	int updateMember(MemberVO member);
	//회원탈퇴
	int deleteMember(MemberVO member);
}
