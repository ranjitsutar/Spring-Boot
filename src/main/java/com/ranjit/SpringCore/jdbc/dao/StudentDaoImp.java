package com.ranjit.SpringCore.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.ranjit.SpringCore.jdbc.entity.Student;


public class StudentDaoImp implements StudentDao {
	
	

	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public int insert(Student student) {
		
		String query= "insert into student(id,name,city) values(?,?,?)";
		int res =this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return res;
	}
	@Override
	public int change(Student student) {
		String query = "update student set name=?, city=? where id=?";
		int update = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		
		return update;
	}
	@Override
	public int delete(int id) {
		String query= "delete from student where id=?";
		int update = jdbcTemplate.update(query, id);
		return update;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}



	
	

}
