package service;

import java.util.List;

public interface TestService {

	
	void insertTest(TestVO test); //등록
	void updateTest(TestVO test);  //수정
	void deleteTest(String name); //삭제
	TestVO selectTestInfo(String name); //단건조회
	
	List<TestVO> selectAllList(); //전체조회
}
