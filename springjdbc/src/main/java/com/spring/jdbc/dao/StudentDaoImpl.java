package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entities.Student;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	public int insert(Student student) {
		//insert query
        String query="insert into student(id,name,city) values(?,?,?)";
        int r=this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}

	public int change(Student student) {
		//Updating data
		String query="update student set name=?, city=? where id=?";
		int r=this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return r;
	}

	public int delete(int studentID) {
		//delete operation
		String query="delete from where id=?";
		int id=this.jdbcTemplate.update(query,studentID);
		return id;
	}

	
	public Student getStudent(int studentId) {
		//Select operation
		String query="select * from student where id=?";
		RowMapper<Student>rowMapper = new RowMapperimpl();
		Student student=this.jdbcTemplate.queryForObject(query,rowMapper,studentId);
		return student;
	}

	
	
	public List<Student> getAllStudents() {
		//Selecting multiple Students
		String query="select * from Student";
		List<Student> students=this.jdbcTemplate.query(query,new RowMapperimpl());
		return students;
	}
	
	



}
