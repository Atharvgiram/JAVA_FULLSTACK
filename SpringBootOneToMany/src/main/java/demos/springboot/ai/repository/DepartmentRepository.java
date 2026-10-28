package demos.springboot.ai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demos.springboot.ai.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}