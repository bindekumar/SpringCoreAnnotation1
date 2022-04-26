package com.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class TestBean implements Test{
	@Autowired
	private Employee employee;

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public void display() {
		System.out.println(employee);
	}
}
