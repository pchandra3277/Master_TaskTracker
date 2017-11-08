package dao;

import java.util.List;

import bo.EmployeeTask;

public interface taskDao {
	public int addTask(String tenantId, EmployeeTask employeeTask);
	public boolean updateTaskDetails(String tenantId, String userId, EmployeeTask employeeTask);
	public EmployeeTask getTaskDetails(String tenantId, String taskId);
	public List<EmployeeTask> allTasks(String tenantId);

}
