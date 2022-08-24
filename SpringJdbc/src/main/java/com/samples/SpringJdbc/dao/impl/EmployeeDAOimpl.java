package com.samples.SpringJdbc.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.samples.SpringJdbc.dao.EmployeeDAO;
import com.samples.SpringJdbc.dao.rowmapper.EmployeeRowMapper;
import com.samples.SpringJdbc.dto.Employee;

@Component("employeedao")
public class EmployeeDAOimpl implements EmployeeDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int create(Employee emp) {
		String sql = "insert into employee values (?, ?, ?)";
		int result = jdbcTemplate.update(sql, emp.getId(), emp.getFirstname(), emp.getLastname());
		System.out.println("Employee created");
		return result;
	}

	@Override
	public int update(Employee emp) {
		String sql = "update employee set firstname=?, lastname=? where id=?";
		int result = jdbcTemplate.update(sql, emp.getFirstname(), emp.getLastname(), emp.getId());
		System.out.println("Employee updated");
		return result;
	}

	@Override
	public int delete(int id) {
		String sql="delete from employee where id=?";
		int result=jdbcTemplate.update(sql,id);
		System.out.println("Employee Deleted");
		return result;
	}

	@Override
	public Employee read(int id) {
		String sql="select * from employee where id=?";
		EmployeeRowMapper mapper=new EmployeeRowMapper();
		Employee employee=jdbcTemplate.queryForObject(sql, mapper, id);
		return employee;
	}

	@Override
	public List<Employee> read() {
		String sql="select * from employee";
		EmployeeRowMapper mapper=new EmployeeRowMapper();
		List<Employee> employees=jdbcTemplate.query(sql, mapper);
		return employees;
		
	}
}
