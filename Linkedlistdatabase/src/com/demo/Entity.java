package com.demo;

public class Entity {
	int empId;
	String empName;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Entity(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

}
