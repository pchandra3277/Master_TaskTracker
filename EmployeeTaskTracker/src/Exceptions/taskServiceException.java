package Exceptions;

public class taskServiceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String exceptionStri;
	
	public taskServiceException(String exceptionString)
	{
		super(exceptionString);
		this.exceptionStri = exceptionString;
		
		
	}
	
	public String toString()
	{
		return exceptionStri;
		
	}
	
	

}
