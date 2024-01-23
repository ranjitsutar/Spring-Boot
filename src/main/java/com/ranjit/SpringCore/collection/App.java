package com.ranjit.SpringCore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new  ClassPathXmlApplicationContext("congigurationCollection.xml");
        Employee employee1 =(Employee) context.getBean("Emp1");
        System.out.println(employee1);
     
        
        System.out.println(employee1.getEmpName());
        System.out.println(employee1.getEmptId());
        System.out.println(employee1.getEmpAddress());
        System.out.println(employee1.getEmpDept());
        System.out.println(employee1.getEmpContactNumber()); 
        System.out.println(employee1.getProperties());
        
        
        System.out.println(employee1.getEmpContactNumber().getClass().getName());
    }
}
