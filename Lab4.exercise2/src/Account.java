
public class Account {

	static int numAccounts = 0;
	
	public static void main(String[] args) {
		
		Account object1 = new Account();
		Account object2 = new Account();
		Account object3 = new Account();
		Account object4 = new Account();
		Account object5 = new Account();
		
		System.out.println(getNumAccounts()); 
	}
	
	public static int getNumAccounts() {
		return numAccounts;
	}
	public Account(){
		numAccounts = numAccounts+1;
	}

	

}
