package step9_03.student.copy;

import java.util.HashMap;
// 자료형 구조 > 해쉬맵으로 구현

public class StudentRepository {

	private static HashMap<String, StudentVO> stDB = new HashMap<String, StudentVO>();
	// 해쉬맵 메소드 만들기(공간 지정)
	
	public static HashMap<String, StudentVO> getStDB(){
		return stDB;
	}
	
	public static void setStDB(HashMap<String, StudentVO> stDB) {
		StudentRepository.stDB = stDB;
	}
	
	
}
