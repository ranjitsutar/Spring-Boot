package com.ranjit.SpringCore.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.ranjit.SpringCore.jdbc.entity.Student;


public class StudentDaoImp implements StudentDao {

	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public int insert(Student student) {
		
		String query= "insert into student(id,name,city) values(?,?,?)";
		int res = jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return res;
	}


	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	

}
