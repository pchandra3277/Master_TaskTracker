package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import Exceptions.employeeException;
import bo.Employee;
import dao.employeeDao;
@Service("employeeService")
@Transactional(propagation= Propagation.REQUIRES_NEW,isolation =Isolation.SERIALIZABLE , rollbackFor= {employeeException.class,Exception.class})
public class employeeServiceImpl implements employeeService {
	
	@Autowired
	private employeeDao employeeDao;
	
	public void setEmployeeDao(employeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public int registerEmployee(String tenantId, Employee employee) throws employeeException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean updateEmployee(String tenantId, Employee emp) throws employeeException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean archiveEmployee(String tenantId, String employeeId) throws employeeException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Employee getEmployee(String tenantId, String eployeeId) throws employeeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployee(String tenantId) throws employeeException {
		// TODO Auto-generated method stub
		return null;
	}

}
