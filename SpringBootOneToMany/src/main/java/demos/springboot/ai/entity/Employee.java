package demos.springboot.ai.entity;

import jakarta.persistence.*;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private String designation;

	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;

	public Employee() {
	}

	public Employee(String name, String designation) {
		this.name = name;
		this.designation = designation;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDesignation() {
		return designation;
	}

	public Department getDepartment() {
		return department;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}