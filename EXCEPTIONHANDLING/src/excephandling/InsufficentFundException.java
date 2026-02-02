package excephandling;

public class InsufficentFundException extends RuntimeException {
	
	public InsufficentFundException() {
		super("insufficient funds transfer ");
	}

}
