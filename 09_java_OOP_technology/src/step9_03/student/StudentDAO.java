package step9_03.student;

import java.util.Map;

public class StudentDAO {
	
	public void insert(StudentVO st) {
		StudentRepository.getStDB().put(st.getId(), st);
	}
	
	public StudentVO select(String id) {
		return StudentRepository.getStDB().get(id);
		// get > key 값으로 value 불러오기
	}
	
	public Map<String , StudentVO> getStudentDB(){
		return StudentRepository.getStDB();
	}

}
