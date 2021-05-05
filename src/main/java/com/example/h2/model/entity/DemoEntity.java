package com.example.h2.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="demo_table")

public class DemoEntity {
	@Id
	@GeneratedValue
	int emp_id;
	String emp_name;
	int emp_age;
	String emp_department;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public int getEmp_age() {
		return emp_age;
	}
	public void setEmp_age(int emp_age) {
		this.emp_age = emp_age;
	}
	public String getEmp_department() {
		return emp_department;
	}
	public void setEmp_department(String emp_department) {
		this.emp_department = emp_department;
	}
	
	
}
