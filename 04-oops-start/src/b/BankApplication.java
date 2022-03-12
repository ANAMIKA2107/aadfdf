package b;


public class BankApplication {

	public static void main(String[] args) {
		Account firstAccount= new Account(4,4000,"y");

		///count a=new Account(1,10000,"Aditya");
		//Account b=new Account(2,20000,"Pal");
		
		//accountService.createAccount(a);
		//accountService.createAccount(b);
		
		
		/*
		System.out.println(a.getAccountNumber()+","+a.getAccountHolderName()+","+	a.getBalance()+","+Account.bankName);
		System.out.println(b.getAccountNumber()+","+b.getAccountHolderName()+","+	b.getBalance()+","+Account.bankName);

        a.withDraw(1000);
        a.deposit(10000);
        
        b.withDraw(30000);
        */
		
		AccountService accountService= new AccountService();
		
		Account[] accounts= accountService.findAllAccounts();
		
		for(int i=0;i<=accounts.length;i++){
			if(accounts[i]==null){
				return ;
			}else{
				System.out.println(accounts[i].toString());
			}
		}
		
		
		
		

	}

}

