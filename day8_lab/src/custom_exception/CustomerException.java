package custom_exception;


public class CustomerException extends RuntimeException{
	public CustomerException(String errMsg) {
		super(errMsg);
	} 
}
