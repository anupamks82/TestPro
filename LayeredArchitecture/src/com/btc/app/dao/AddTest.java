package com.btc.app.dao;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;

import org.junit.jupiter.api.Test;

import com.btc.app.model.Employee;

class AddTest {
	EmployeeDao dao=new EmployeeDaoImpl();

	@Test
	void testAddEmployee() throws SQLException {
		Employee emp=new Employee(1006,"Uttam Reddy","uttam@gmail.com",LocalDate.parse("1994-02-10"));
		
		assertEquals(emp, dao.addEmployee(emp));
		
	}
	@Test
	void testDeleteEmployeeById() throws SQLException {
		assertTrue(dao.deleteEmployeeById(1006));
	}

	@Test
	void testSearchEmployeeById() throws SQLException {
		//assertTrue(dao.searchEmployeeById(1005));
	}
	@Test
	void testUpdateEmployee() {
		
	}

	@Test
	void testGetAllEmployee() {
		
	}

}
