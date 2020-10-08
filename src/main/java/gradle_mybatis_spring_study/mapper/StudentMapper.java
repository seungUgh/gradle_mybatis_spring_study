package gradle_mybatis_spring_study.mapper;

import java.util.List;

import gradle_mybatis_spring_study.dto.Student;

public interface StudentMapper {
	//TypeHandler 사용
	Student selectStudentByNo(Student student);
	//ResultMap 이용
	Student selectStudentByNoWithResultMap(Student student);

	//List반환
	List<Student> selectStudentByAll();
	
}
