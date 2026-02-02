package excephandling;

public class LoginException extends RuntimeException{
	
	public LoginException() {
		
		super("unauthorized personal");
	}

}
