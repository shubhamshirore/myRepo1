package Test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class EmployeeController {
	@Autowired
	EmployeeService studService;
	
	@GetMapping("/search")
	public ResponseEntity<List<Employee>> getAllEmployees()
	{
		List<Employee> studes= studService.getAllEmployee();
		return new ResponseEntity<>(studes,HttpStatus.OK);
	}
	
	
	@PostMapping("/add")
	public ResponseEntity<String> addStude(@RequestBody Employee stud)
	{
		studService.addEmployee(stud);
		return new ResponseEntity<>("Employee added", HttpStatus.OK);
	}
	
	@GetMapping("/Employee/{id}")
	public ResponseEntity<Employee>  getEmployee(@PathVariable("id") int id)
	{
		Employee stu= studService.getEmployee(id);
		return new ResponseEntity<>(stu, HttpStatus.OK);
	}
	
	@DeleteMapping("/Employee/{id}")
	public ResponseEntity<String>  deleteEmployee(@PathVariable("id") int id)
	{
		String status= studService.deleteEmployee(id);
		return new ResponseEntity<String>(status, HttpStatus.OK);
	}
	
	@PutMapping("/Employee")
	public ResponseEntity<String> updateEmployee(@RequestBody Employee stud)
	{
		String str= studService.updateEmployee(stud);
		return new ResponseEntity<>(str, HttpStatus.OK);
	}
	
	@GetMapping("/Employee/name/{name}")
	public ResponseEntity<Employee> getEmployeeByname(@PathVariable("name") String name)
	{
		Employee stud= studService.getByNAme(name);
		return new ResponseEntity<>(stud, HttpStatus.OK);
		
	}
	
}
