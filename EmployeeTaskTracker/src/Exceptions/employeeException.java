package Exceptions;

public class employeeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String exceptionStri;
	
	public employeeException(String exceptionString)
	{
		super(exceptionString);
		this.exceptionStri = exceptionString;
		
		
	}
	
	public String toString()
	{
		return exceptionStri;
		
	}
	
	

}
