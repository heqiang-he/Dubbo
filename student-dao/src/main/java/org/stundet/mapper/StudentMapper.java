package org.stundet.mapper;

import org.student.pojo.Student;

public interface StudentMapper {
	Student queryStedentByStuNo(int stuNo);
	void addStudent(Student stu);

	
}
