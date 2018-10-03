package Test;

import java.util.List;

import com.student.DemoRestSevice.models.Student;



public class EmployeeServiceImpl implements EmployeeService {

	
	EmployeeRepository empRepo;
	
	@Override
	public String addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		empRepo.save(emp);
		return "Saved";
	}

	@Override
	public String deleteEmployee(int id) {
		// TODO Auto-generated method stub
		empRepo.deleteById(id);
		return "Deleted";
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> employees= (List<Employee>)empRepo.findAll();
		return employees;
	}

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		Employee emp= empRepo.findByid(id);
		return emp;
	
	}

	@Override
	public String updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		empRepo.save(emp);
		return "Updated";
	}

	@Override
	public Employee getByNAme(String name) {
		// TODO Auto-generated method stub
		
		return empRepo.findByfname(name);
	}

}
