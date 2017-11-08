package service;

import java.util.List;

import Exceptions.taskServiceException;
import bo.EmployeeTask;

public interface employeeTaskService {
	public int addTask(String tenantId, EmployeeTask employeeTask) throws taskServiceException;
	public boolean updateTaskDetails(String tenantId, String userId, EmployeeTask employeeTask) throws taskServiceException;
	public EmployeeTask getTaskDetails(String tenantId, String taskId);
	public List<EmployeeTask> allTasks(String tenantId) throws taskServiceException;

}
