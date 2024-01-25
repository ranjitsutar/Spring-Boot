package com.ranjit.SpringCore.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

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
	@Override
	public Student getSingleStudent(int id) {
		String query= "select * from student where id=?";
		RowMapper rowMapper = new RowMapperImp();
		Student student=this.jdbcTemplate.queryForObject(query, rowMapper,id);
		return student;
	}
	@Override
	public List<Student> getAllStudent() {
		String query= "select * from student";
		List<Student> listStudent = this.jdbcTemplate.query(query, new RowMapperImp() );
		
		return listStudent;
	}



	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	

}
