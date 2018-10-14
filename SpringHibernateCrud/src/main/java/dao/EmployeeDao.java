package dao;

import java.util.List;

import pojo.Employee;

public interface EmployeeDao {
	public void save(Employee e);

	public List<Employee> list();
}
