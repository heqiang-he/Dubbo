package org.stundet.mapper;
//aa+bb
import org.student.pojo.Student;

public interface StudentMapper {
	Student queryStedentByStuNo(int stuNo);
	void addStudent(Student stu);

	
}
