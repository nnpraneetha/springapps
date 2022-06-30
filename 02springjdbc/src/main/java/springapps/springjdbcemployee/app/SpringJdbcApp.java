package springapps.springjdbcemployee.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import springapps.springjdbcemployee.dao.EmployeeDao;
import springapps.springjdbcemployee.dto.Employee;

public class SpringJdbcApp {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("springapps/springjdbcemployee/config/config.xml");
		EmployeeDao employeedao=(EmployeeDao) context.getBean("employeedao");
//		createEmployee(employeedao);
//		readEmployee(employeedao);
		
		readEmployees(employeedao);
	}
	
	private static void readEmployees(EmployeeDao employeedao) {
		
		List<Employee> emps=employeedao.read();
		System.out.println(emps);
	}

	private static void readEmployee(EmployeeDao employeedao) {
		Employee emp=employeedao.read(2);
		System.out.println(emp);
		
	}

	private static void createEmployee(EmployeeDao employeedao) {
		
		Employee emp=new Employee();
		emp.setId(2);
		emp.setFirstname("M");
		emp.setLastname("R");
		//int result=employeedao.delete(emp);
		int result=employeedao.update(emp);
		//int result=employeedao.create(emp);
		System.out.println("No of records changed= " + result);
	}
}
