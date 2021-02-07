package org.student.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.student.pojo.Student;
import org.student.service.StudentService;
import org.stundet.mapper.StudentMapper;

import com.alibaba.dubbo.config.annotation.Service;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentMapper studentMapper;
	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		studentMapper.addStudent(student);
	}

	@Override
	public Student queryStudentByStuNo(int stuNo) {
		// TODO Auto-generated method stub
		Student student = studentMapper.queryStedentByStuNo(stuNo);
		return student;
	}

}
