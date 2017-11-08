package bo;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Address {
	
	enum AddressStatus{
		Active(1),INACTIVE(2);
		
		public int code;
		
		private AddressStatus(int code )
		{
			this.code = code;
		}
		
		private static AddressStatus forStatus(int code) 
		{
			return Arrays.stream(AddressStatus.values()).filter(e->e.code == code).findFirst().get();
		}
	}
	@Id
	private String addressId = null;
	@Column
	private String state = null;
	@Column
	private String city = null;
	@Column
	private int pincode =0;
	@Column
	private int status = AddressStatus.Active.code;
	@ManyToOne
	private Employee employee;
	
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	
	
}
