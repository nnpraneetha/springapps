package springapps.springjdbcemployee.dao;

import java.util.List;

import springapps.springjdbcemployee.dto.Employee;

public interface EmployeeDao {

	int create(Employee employee);
	int update(Employee employee);
	int delete(Employee employee);
	
	Employee read(int id);
	
	List<Employee> read();
}
