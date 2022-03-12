package b;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class AccountRepository {
	
	private String fileName="accounts.txt";
	
	public AccountRepository() {
		
	}
	
	
	public boolean createAccount(Account account){
		PrintWriter writer=null;
		try {
			writer= new PrintWriter(new FileOutputStream(new File(fileName), true));
			writer.println(account.toString());
			writer.flush();
			return true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			writer.close();
		}
		
		
		return false;		
	}
	
	public Account findAccount(Long accountNumber){
		BufferedReader bufferedReader=null;
		try {
			bufferedReader = new BufferedReader(new FileReader(fileName));
			String line=bufferedReader.readLine();
			while(line!=null){
				String[] words= line.split(",");
				long accountNumberFromFile=Long.parseLong(words[0]);
				if(accountNumberFromFile==accountNumber){
					Account account= new Account(accountNumberFromFile,Integer.parseInt(words[1]) , words[2]);
					return account;
				}				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				bufferedReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return null;
}
	
	public Account[] findAllAccounts(){
		BufferedReader bufferedReader=null;
		Account[] accounts= new Account[100];
		int count=0;
		try {
			bufferedReader = new BufferedReader(new FileReader(fileName));
			String line=bufferedReader.readLine();
			while(line!=null){
				String[] words= line.split(",");
				long accountNumberFromFile=Long.parseLong(words[0]);				
				Account account= new Account(accountNumberFromFile,Integer.parseInt(words[2]) , words[1]);		
				accounts[count++]=account;
				 line=bufferedReader.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				bufferedReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return accounts;
	}
	
	

}

