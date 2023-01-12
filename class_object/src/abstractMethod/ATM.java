package abstractMethod;

public class ATM implements Transaction{

	
	public void withdraw() {
	System.out.println("Withdraw process is done");	
	}

	
	public void verifypin() {
	System.out.println("Pin is verified");
	}

}
