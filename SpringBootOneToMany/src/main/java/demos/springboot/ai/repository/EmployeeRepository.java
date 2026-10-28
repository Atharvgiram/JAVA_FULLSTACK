package demos.springboot.ai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demos.springboot.ai.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}