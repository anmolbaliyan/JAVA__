package excephandling;

public class TestAccount {
	
	public static void main(String[] args) {
		Account a = new Account();
		
		a.setBalance(55000.55);
		
		System.out.println("Balance: " + a.getBalance());
		
		a.withdraw(100000.00);
		
	}

}
