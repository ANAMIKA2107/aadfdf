package b;

public class AccountUtility {

	public static void withDraw(Account account,int amount){
		if(account.balance>=amount){
			account.balance=account.balance-amount;
			System.out.println("WithDrawn "+amount +"from account with number "+account.accountNumber);
		}else{
			System.out.println("WithDraw failed .....balance is "+account.balance);
		}
		
	}

}
