package bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext appContext = new
				AnnotationConfigApplicationContext(BeanConfig.class);
		
		EmployeeService empService = 
				appContext.getBean("employeeService", EmployeeService.class);
		
		empService.showAllEmployee();
		empService.raiseWageAll(0.2);
		empService.showAllEmployee();
		
		appContext.close();
	}

}
