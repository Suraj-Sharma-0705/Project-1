package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My Program Started" );
        // spring jdbc=> JdbcTemplate
        
        //Using XML
        //ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        
        ApplicationContext context= new AnnotationConfigApplicationContext(JdbcConfig.class);
        
        
        StudentDao studentDao=context.getBean("StudentDao",StudentDao.class);
        
//        Student student=new Student();
//        student.setId(420);
//        student.setName("Ashu");
//        student.setCity("Delhi");
//        
//       int result=studentDao.insert(student);
//       System.out.println("Student Added"+result);
       
//        Student student=new Student();
//        student.setId(245);
//        student.setCity("JSR");
//        student.setName("Jabba");
//        int res=studentDao.change(student);
//        System.out.println("data Changed"+res);
//        
//        int result=studentDao.delete(666);
//        System.out.println("Delete"+result);
        
        Student st=studentDao.getStudent(666);
        System.out.println(st);
        
        List<Student> allstudents=studentDao.getAllStudents();
        for(Student s:allstudents) {
        	System.out.println(s);
        	
        }
        
    }
}
