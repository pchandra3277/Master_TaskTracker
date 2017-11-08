package TenantInfo;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity(name="TENANT_ENTITY")
public class TenantEntity {
	
	public enum statusConstant {
		
		ACTIVE(0),INACTIVE(2);
		
		public int code;
		
		private statusConstant( int code)
		{
			this.code = code;
		}
		
		public static statusConstant forStatus(int code)
		{
			return Arrays.stream(statusConstant.values()).filter(e->e.code==code).findFirst().get();
			
		}
		
	}
	@Column
	@NotNull
	private String tenantId = null;
	@Column
	private String tenantName = null;
	@Column
	private int status = statusConstant.ACTIVE.code ;
	
	
	public String getTenantId() {
		return tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
	public String getTenantName() {
		return tenantName;
	}
	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
	

}
