package com.ranjit.SpringCore.jdbc.dao;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = {"com.ranjit.SpringCore.jdbc"})
public class JdbcConfiguration {

	@Bean(name = {"ds"})
	public DataSource getDataSource() {
		
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("root");
		
		return ds;
	}
	
	@Bean(name = {"JdbcTemplate"})
	public JdbcTemplate getTemplet() {
		JdbcTemplate jdbcTemplate= new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
		
	}
	
	@Bean(name = {"studentDao"})
	public StudentDao getStudentDao() {
		StudentDaoImp studentDao = new StudentDaoImp();
		studentDao.setJdbcTemplate(getTemplet());
		return studentDao;
	}
}
