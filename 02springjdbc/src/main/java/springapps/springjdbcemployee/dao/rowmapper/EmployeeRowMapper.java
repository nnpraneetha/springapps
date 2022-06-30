package springapps.springjdbcemployee.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import springapps.springjdbcemployee.dto.Employee;

public class EmployeeRowMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee =new Employee();
		employee.setId(rs.getInt(1));
		employee.setFirstname(rs.getString(2));
		employee.setLastname(rs.getString(3));
		return employee;
	}
	
	
}
