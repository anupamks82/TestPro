package com.btc.app.service;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.btc.app.dao.EmployeeDao;
import com.btc.app.dao.EmployeeDaoImpl;
import com.btc.app.model.Employee;

class EmployeeServiceImplTest {
	EmployeeDao dao=new EmployeeDaoImpl();

	@Test
	public void addEmployee(Employee employee) throws SQLException {
		Employee emp=new Employee(1006,"Uttam Reddy","uttam@gmail.com",LocalDate.parse("1994-02-10"));
		
		assertEquals(emp, dao.addEmployee(emp));
	}

	@Test
	public void searchEmployeeById(int employeeId) throws SQLException {
		assertTrue(dao.searchEmployeeById(1006));
	}

	@Test
	public void deleteEmployeeById(int employeeId) throws SQLException {

		assertTrue(dao.deleteEmployeeById(1006));
	}

	@Test
	public void updateEmployee(Employee employee) throws SQLException {

	}

	@Test
	public void getAllEmployee() throws SQLException {
		
		}
	}

