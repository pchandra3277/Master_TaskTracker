package bo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity(name="EMPLOYEE")
public class Employee {
	@Column
	@NotNull
	private String tenantId = null;
	@Id
	private String employeeId = null;
	@Column
	private String employeeName= null;
	@OneToMany(mappedBy ="employee")
	private List<Address> addressList = new ArrayList<>();
	
	@ManyToMany (mappedBy = "taskAssignedTo")
	private List<EmployeeTask> tastDetails = new ArrayList<>();
	
	public String getTenantId() {
		return tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public List<Address> getAddressList() {
		return addressList;
	}
	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}
	public List<EmployeeTask> getTastDetails() {
		return tastDetails;
	}
	public void setTastDetails(List<EmployeeTask> tastDetails) {
		this.tastDetails = tastDetails;
	}

}
