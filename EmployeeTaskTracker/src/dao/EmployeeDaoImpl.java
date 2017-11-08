package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import bo.Employee;
@Repository("employeeDado")
public class EmployeeDaoImpl implements employeeDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public int registerEmployee(String tenantId, Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean updateEmployee(String tenantId, Employee emp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean archiveEmployee(String tenantId, String employeeId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Employee getEmployee(String tenantId, String eployeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployee(String tenantId) {
		// TODO Auto-generated method stub
		return null;
	}

}
