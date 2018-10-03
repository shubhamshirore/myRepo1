package Test;

import java.util.List;

import org.springframework.stereotype.Service;

	@Service
	public interface EmployeeService {

		public String addEmployee(Employee emp);
		public String deleteEmployee(int id);
		public List<Employee> getAllEmployee();
		public Employee getEmployee(int id);
		public String updateEmployee(Employee emp);
		public Employee getByNAme(String name);


}
