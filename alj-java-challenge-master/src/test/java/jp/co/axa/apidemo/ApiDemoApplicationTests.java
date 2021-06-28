package jp.co.axa.apidemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

import jp.co.axa.apidemo.entities.Employee;

import jp.co.axa.apidemo.services.EmployeeServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiDemoApplicationTests {
	
	@Autowired
	EmployeeServiceImpl employeeService ;
	
// This Method is to test Successful Fetch and save in DB 
	@Test
	public void contextLoads() {
		
		Employee employee= new Employee();
		
		employee.setName("RAJ");
		employee.setSalary(3000);
		employee.setDepartment("textAxa");
		employeeService.saveEmployee(employee);
		assertNotNull(employeeService.getEmployee(employee.getId()));
	}

}
