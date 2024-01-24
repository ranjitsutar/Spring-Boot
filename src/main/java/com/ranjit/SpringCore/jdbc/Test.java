package com.ranjit.SpringCore.jdbc;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.ranjit.SpringCore.jdbc.dao.StudentDao;
import com.ranjit.SpringCore.jdbc.entity.Student;

public class Test {

	public static void main(String[] args) {

		// Not recomended
		/*
		 * ApplicationContext context = new ClassPathXmlApplicationContext("com/ranjit/SpringCore/jdbc/congigurationjdbc.xml");
		 *  JdbcTemplate bean = context.getBean("jdbcTemplate", JdbcTemplate.class); String
		 * query="insert into student(id,name,city) values(?,?,?)"; int result =
		 * bean.update(query,456,"ranjit Sutar","Rourkela"); System.out.println(result);
		 */

		 ApplicationContext context = new ClassPathXmlApplicationContext("com/ranjit/SpringCore/jdbc/congigurationjdbc.xml");
		 StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
		 Student student1= new Student();
		 
		 student1.setId(123);
		 student1.setName("CHandan Mohapatra");
		 student1.setCity("Bhubaneswar");
		 
		 int insert = studentDao.insert(student1);
		 System.out.println(insert);
		 
	}
}
