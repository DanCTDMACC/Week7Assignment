package bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Employee;

public class EmployeeDaoDatabase implements EmployeeDao {
	EntityManagerFactory emFactory;
	
	public EmployeeDaoDatabase() {
		emFactory = Persistence.createEntityManagerFactory("SpringEmployee");
	}
	
	public void insert(Employee employee) {
		// TODO Auto-generated method stub

	}

	public void update(Employee empToUpdate) {
		EntityManager eManager = emFactory.createEntityManager();
		
		eManager.getTransaction().begin();
		
		Employee empUpdating = eManager.find(Employee.class, empToUpdate.getId());
		
		// Updating new information and commit.
		empUpdating.setLastname(empToUpdate.getLastname());
		empUpdating.setFirstname(empToUpdate.getFirstname());
		empUpdating.setWage(empToUpdate.getWage());
		empUpdating.setCity(empToUpdate.getCity());
		empUpdating.setState(empToUpdate.getState());
		eManager.getTransaction().commit();
		
		// Clean the memory.
		eManager.close();
	}

	public void update(List<Employee> employees) {
		for (Employee emp : employees) {
			update(emp);
		}
	}

	public void delete(int employeeId) {
		// TODO Auto-generated method stub

	}

	public Employee find(int employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> findAll() {
		List<Employee> employees = new ArrayList<Employee>();
		EntityManager eManager = emFactory.createEntityManager();
		
		eManager.getTransaction().begin();
		
		TypedQuery<Employee> typedQuery = eManager.createQuery("SELECT c FROM Employee c", Employee.class);
		try {
			employees = typedQuery.getResultList();
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		} finally {
			eManager.close();
		}
		return employees;
	}

}
