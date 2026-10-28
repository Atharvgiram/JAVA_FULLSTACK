package demos.springboot.ai.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demos.springboot.ai.entity.Department;
import demos.springboot.ai.entity.Employee;
import demos.springboot.ai.repository.DepartmentRepository;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

	private final DepartmentRepository departmentRepository;

	public DepartmentController(DepartmentRepository departmentRepository) {
		this.departmentRepository = departmentRepository;
	}

	// Create a department with multiple employees
	@PostMapping
	public Department createDepartment(@RequestBody Department department) {

		for (Employee employee : department.getEmployees()) {
			employee.setDepartment(department);
		}

		return departmentRepository.save(department);
	}

	// Get all departments with their employees
	@GetMapping
	public List<Department> getAllDepartments() {
		return departmentRepository.findAll();
	}

	// Get a department by ID
	@GetMapping("/{id}")
	public ResponseEntity<Department> getDepartmentById(@PathVariable Long id) {

		return departmentRepository.findById(id).map(ResponseEntity::ok)
				.orElseGet(() -> ResponseEntity.notFound().build());
	}
}
