package classwork_6;

public class PiggyBank {
	private double balance = 0;
	boolean isBroken;
	
	public void addMoney (double amount) {
		if (isBroken != true) {
			balance += amount;
		}
		else {System.out.println("ne");}
	}
	
	public double breakOpen() {
		isBroken = true;
		return balance;
		
	}
	public void getBalance() {
		if(isBroken == false) {
			System.out.println(balance);
		}
	}

}
