package bo;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class EmployeeTask {

public enum taskStatus {
		
		ACTIVE(0),INACTIVE(2),PENDING(3),DECLIENED(4),AWAITING_CUSTOMER_RESPONSE(5);
		
		public int code;
		
		private taskStatus( int code)
		{
			this.code = code;
		}
		
		public static taskStatus forStatus(int code)
		{
			return Arrays.stream(taskStatus.values()).filter(e->e.code==code).findFirst().get();
			
		}
	}
	@Id
	private String tastId = null;
	@Column
	private String taskName = null;
	@Lob
	private String desciption = null;
	@Temporal(TemporalType.DATE)
	private Date createOn = null;
	@Temporal(TemporalType.DATE)
	private Date taskUpdateOn = null;
	@Column
	private String taskUpdatedBy = null;
	@Column
	private int tastStatus = taskStatus.PENDING.code;
	@Column
	private String taskPendingWith = null;
	@ManyToMany
	@JoinColumn(name = "EMPLOYEE_ID")
	private List<Employee> taskAssignedTo = new ArrayList<>();
	@Column
	private boolean isAdminAction = false;
	
	public String getTastId() {
		return tastId;
	}
	public void setTastId(String tastId) {
		this.tastId = tastId;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getDesciption() {
		return desciption;
	}
	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}
	public Date getCreateOn() {
		return createOn;
	}
	public void setCreateOn(Date createOn) {
		this.createOn = createOn;
	}
	public Date getTaskUpdateOn() {
		return taskUpdateOn;
	}
	public void setTaskUpdateOn(Date taskUpdateOn) {
		this.taskUpdateOn = taskUpdateOn;
	}
	public String getTaskUpdatedBy() {
		return taskUpdatedBy;
	}
	public void setTaskUpdatedBy(String taskUpdatedBy) {
		this.taskUpdatedBy = taskUpdatedBy;
	}
	public int getTastStatus() {
		return tastStatus;
	}
	public void setTastStatus(int tastStatus) {
		this.tastStatus = tastStatus;
	}
	public String getTaskPendingWith() {
		return taskPendingWith;
	}
	public void setTaskPendingWith(String taskPendingWith) {
		this.taskPendingWith = taskPendingWith;
	}
	public List<Employee> getTaskAssignedTo() {
		return taskAssignedTo;
	}
	public void setTaskAssignedTo(List<Employee> taskAssignedTo) {
		this.taskAssignedTo = taskAssignedTo;
	}
	public boolean isAdminAction() {
		return isAdminAction;
	}
	public void setAdminAction(boolean isAdminAction) {
		this.isAdminAction = isAdminAction;
	}
	
	

}
