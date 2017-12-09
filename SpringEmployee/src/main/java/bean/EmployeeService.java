package bean;

import java.util.List;

import model.Employee;

public class EmployeeService {
	EmployeeDao dao;

	public EmployeeService(EmployeeDao dao) {
		this.dao = dao;
	}

	public EmployeeDao getDao() {
		return dao;
	}
	
	public void showAllEmployee() {
		List<Employee> employees = dao.findAll();
		System.out.println("First\t\tLast\t\tWage\t\tCity\t\tState");
		System.out.println("----------------------------------------------------");
		for (Employee emp : employees) {
			System.out.println(emp.getFirstname() + "\t\t" + emp.getLastname() + 
					"\t\t" + emp.getWage() + "\t\t" + emp.getCity() + 
					"\t\t" + emp.getState() + "\t\t");
		}
		System.out.println();
	}

	public void setDao(EmployeeDao dao) {
		this.dao = dao;
	}
	
	public void raiseWageAll(double rateOfraise) {
		List<Employee> employees = dao.findAll();
		
		for (Employee emp : employees) {
			emp.setWage(emp.getWage() * (1 + rateOfraise));
		}
		/**
		for (int i = 0; i < employees.size(); i++) {
			employees.get(i).setWage(employees.get(i).getWage() * rateOfraise);
		}
		*/
		dao.update(employees);
	}
}
