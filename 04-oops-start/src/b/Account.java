package b;

public class Account {

	long accountNumber;
	int balance;	 
	String accountHolderName;
	static String bankName;
	static {
		System.out.println("in the static block of account==");
		bankName="Citi bank";
	}
		 public Account() {
		 }
		 
		 
		 
		public Account(long accountNumber, int balance, String accountHolderName) {
			super();
			this.accountNumber = accountNumber;
			this.balance = balance;
			this.accountHolderName = accountHolderName;
		}



		public void withDraw(int amount){
			if(balance>=amount){
				balance=balance-amount;
				System.out.println(" WithDrawn "+amount +" from account with number  "+accountNumber);
			}else{
				System.out.println("WithDraw failed .....balance is "+balance);
			}		
		}
		
		
		public void deposit(int amount){
			balance=balance+amount;
			System.out.println("Deposited "+amount+" in account with number "+accountNumber);
		}
		
		public String toString() {		
			return accountNumber+","+accountHolderName+","+balance;
		}




}
