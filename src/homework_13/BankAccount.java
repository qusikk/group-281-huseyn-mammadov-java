package homework_13;

public class BankAccount {
	double balance;
	
	public BankAccount(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Popolneno balans" + balance );
	}
	
	 public void withdraw(double amount) {
	        if (amount > balance) {
	            System.out.println("bomj!");
	        } else {
	            balance -= amount;
	            System.out.println("snato  " + balance);
	        }
	    }

	    public double getBalance() 
	    { return balance; }		
	    
	    public static void main(String [] args) {
	    	BankAccount acc = new BankAccount(1000.0);
	    	acc.deposit(500.0);
	    	acc.withdraw(200.0);
	    	acc.withdraw(5000.0);
	    	
	    }
	    
			
				
			
		
	

}
