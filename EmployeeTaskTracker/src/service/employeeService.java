package service;

import java.util.List;

import Exceptions.employeeException;
import bo.Employee;

public interface employeeService {
	
	public int registerEmployee(String tenantId ,Employee employee) throws employeeException;
	public boolean updateEmployee(String tenantId,Employee emp) throws employeeException;
	public boolean archiveEmployee(String tenantId, String employeeId) throws employeeException;
	public Employee getEmployee(String tenantId, String eployeeId) throws employeeException;
	public List<Employee> getAllEmployee(String tenantId) throws employeeException;

}
