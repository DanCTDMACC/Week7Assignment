package bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
	
	@Bean
	public EmployeeDao employeeDao() {
		EmployeeDaoDatabase bean = new EmployeeDaoDatabase();
		return bean;
	}
	
	@Bean
	public EmployeeService employeeService() {
		EmployeeService bean = new EmployeeService(employeeDao());
		return bean;
	}
}
