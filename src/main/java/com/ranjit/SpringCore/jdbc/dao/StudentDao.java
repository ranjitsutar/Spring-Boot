package com.ranjit.SpringCore.jdbc.dao;

import com.ranjit.SpringCore.jdbc.entity.Student;

public interface StudentDao {
	public int insert(Student student);
	public int change(Student student);
	public int delete(int id);
	

}
