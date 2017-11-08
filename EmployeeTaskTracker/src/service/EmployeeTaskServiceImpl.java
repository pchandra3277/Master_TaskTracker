package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import Exceptions.employeeException;
import Exceptions.taskServiceException;
import bo.EmployeeTask;
@Service(value="employeeTaskService")
@Transactional(propagation= Propagation.REQUIRES_NEW,isolation =Isolation.SERIALIZABLE , rollbackFor= {employeeException.class,Exception.class})
public class EmployeeTaskServiceImpl implements employeeTaskService {

	@Autowired
	private employeeTaskService taskService;
	
	public void setTaskService(employeeTaskService taskService) {
		this.taskService = taskService;
	}
	
	@Override
	public int addTask(String tenantId, EmployeeTask employeeTask) throws taskServiceException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean updateTaskDetails(String tenantId, String userId, EmployeeTask employeeTask)
			throws taskServiceException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	@Transactional(readOnly=true)
	public EmployeeTask getTaskDetails(String tenantId, String taskId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeTask> allTasks(String tenantId) throws taskServiceException {
		// TODO Auto-generated method stub
		return null;
	}

}
