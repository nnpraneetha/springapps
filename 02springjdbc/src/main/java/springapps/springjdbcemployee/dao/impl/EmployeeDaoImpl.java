package springapps.springjdbcemployee.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import springapps.springjdbcemployee.dao.EmployeeDao;
import springapps.springjdbcemployee.dao.rowmapper.EmployeeRowMapper;
import springapps.springjdbcemployee.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int create(Employee employee) {
		String sql = "insert into employee values(?,?,?)";
		int result = jdbcTemplate.update(sql, employee.getId(), employee.getFirstname(), employee.getLastname());
		return result;
	}

	@Override
	public int update(Employee employee) {

		String sql = "update employee set firstname=?,lastname=? where id=?";
		int result = jdbcTemplate.update(sql, employee.getFirstname(), employee.getLastname(), employee.getId());
		return result;
	}

	@Override
	public int delete(Employee employee) {
		String sql = "delete from employee where id=?";
		int result = jdbcTemplate.update(sql, employee.getId());
		return result;
	}

	@Override
	public Employee read(int id) {
		String sql="select * from employee where id=?";
		EmployeeRowMapper rowMapper=new EmployeeRowMapper();
		Employee employee=jdbcTemplate.queryForObject(sql,rowMapper,id);
		return employee;
	}

	@Override
	public List<Employee> read() {
		String sql="select * from employee";
		EmployeeRowMapper rowMapper=new EmployeeRowMapper();
		List<Employee> employees=jdbcTemplate.query(sql,rowMapper);
		return employees;
	}

}
