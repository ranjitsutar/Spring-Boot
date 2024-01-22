package com.ranjit.SpringCore.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee{

	
	private int emptId;
	private String empName;	
	private List<String> empContactNumber;
	private Set<String> empAddress;
	private Map<String, String> empDept;
	private Properties properties;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	public Employee(int emptId, String empName, List<String> empContactNumber, Set<String> empAddress,
			Map<String, String> empDept, Properties properties) {
		super();
		this.emptId = emptId;
		this.empName = empName;
		this.empContactNumber = empContactNumber;
		this.empAddress = empAddress;
		this.empDept = empDept;
		this.properties = properties;
	}



	public int getEmptId() {
		return emptId;
	}
	public void setEmptId(int emptId) {
		this.emptId = emptId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<String> getEmpContactNumber() {
		return empContactNumber;
	}
	public void setEmpContactNumber(List<String> empContactNumber) {
		this.empContactNumber = empContactNumber;
	}
	public Set<String> getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(Set<String> empAddress) {
		this.empAddress = empAddress;
	}

	public Map<String, String> getEmpDept() {
		return empDept;
	}

	public void setEmpDept(Map<String, String> empDept) {
		this.empDept = empDept;
	}



	public Properties getProperties() {
		return properties;
	}



	public void setProperties(Properties properties) {
		this.properties = properties;
	}



	@Override
	public String toString() {
		return "Employee [emptId=" + emptId + ", empName=" + empName + ", empContactNumber=" + empContactNumber
				+ ", empAddress=" + empAddress + ", empDept=" + empDept + ", properties=" + properties + "]";
	}

	
	
	
		
}
