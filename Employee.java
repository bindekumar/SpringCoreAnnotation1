package com.spring.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("101")
	private Integer empNo;
	@Value("Binde kumar")
	private String empName;
	@Value("123.23")
	private Float empSal;
	@Value("101")
	
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	
	

}
