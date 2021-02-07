package org.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.student.pojo.Student;
import org.student.service.StudentService;

import com.alibaba.dubbo.config.annotation.Reference;

@Controller
@RequestMapping("controller")
public class StudentController {

	@Reference
	StudentService studentservice;
	
	@RequestMapping("query")
	public ModelAndView queryStudentByNo() {
		ModelAndView modelAndView = new ModelAndView("success");
		Student student = studentservice.queryStudentByStuNo(1);
		modelAndView.addObject("student", student);
		System.out.println(student.getStuNo()+student.getStuName()+student.getStuAge());
		return modelAndView;
	}
	@RequestMapping("add")
	public String addStudent() {
		Student student = new Student();
		student.setStuNo(66);
		student.setStuName("hq");
		student.setStuAge(20);
		studentservice.addStudent(student);
		return "success";
		
	}
}
