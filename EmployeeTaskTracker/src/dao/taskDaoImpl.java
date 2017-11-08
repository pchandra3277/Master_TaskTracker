package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import bo.EmployeeTask;
@Repository("taskDao")
public class taskDaoImpl implements taskDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Override
	public int addTask(String tenantId, EmployeeTask employeeTask) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean updateTaskDetails(String tenantId, String userId, EmployeeTask employeeTask) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EmployeeTask getTaskDetails(String tenantId, String taskId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeTask> allTasks(String tenantId) {
		// TODO Auto-generated method stub
		return null;
	}

}
