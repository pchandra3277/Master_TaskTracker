package dao;

import java.util.List;

import bo.Employee;

public interface employeeDao {
	
	public int registerEmployee(String tenantId ,Employee employee);
	public boolean updateEmployee(String tenantId,Employee emp);
	public boolean archiveEmployee(String tenantId, String employeeId);
	public Employee getEmployee(String tenantId, String eployeeId) ;
	public List<Employee> getAllEmployee(String tenantId) ;


}
