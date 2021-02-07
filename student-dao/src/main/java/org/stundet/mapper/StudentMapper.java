package org.stundet.mapper;
//bb
import org.student.pojo.Student;

public interface StudentMapper {
	Student queryStedentByStuNo(int stuNo);
	void addStudent(Student stu);

	
}
