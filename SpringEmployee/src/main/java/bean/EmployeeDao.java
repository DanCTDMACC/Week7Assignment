package bean;

import java.util.List;

import model.Employee;

public interface EmployeeDao {

	public void insert(Employee employee);
	public void update(Employee employee);
	public void update(List<Employee> employees);
	public void delete(int employeeId);
	public Employee find(int employeeId);
	public List<Employee> findAll();
}
