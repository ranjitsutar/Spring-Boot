package com.ranjit.SpringCore.jdbc.dao;

import java.util.List;

import com.ranjit.SpringCore.jdbc.entity.Student;

public interface StudentDao {
	public int insert(Student student);
	public int change(Student student);
	public int delete(int id);
	public Student getSingleStudent(int id);
	public List<Student>  getAllStudent();
	

}
