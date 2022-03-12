package b;

public class AccountService {
	
	private AccountRepository accountRepository;
	
	public AccountService() {
		accountRepository= new AccountRepository();
	}
	
	
	public AccountRepository getAccountRepository() {
		return accountRepository;
	}


	public void setAccountRepository(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}


	public boolean createAccount(Account account){
		
		boolean isCreated=accountRepository.createAccount(account);
		if(isCreated){
			System.out.println("Created Account Successfully");
		}
		return isCreated;		
	}
	
	public Account findAccount(Long accountNumber){
		
		return accountRepository.findAccount(accountNumber);
}
	
	public Account[] findAllAccounts(){
		
		return accountRepository.findAllAccounts();
	}
	
	public Account[] findAllAccountsByName(){
		
		return null;
	}
	
	public boolean updateAccount(Account account){
		
		return false;		
	}
	
	
	public void deleteAccount(Long accountNumber){
		
	}
	
	public void transfer(Long fromAccountNumber,Long toAccountNumber){
		
	}

}
