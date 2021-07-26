
public class Account {

	static int numAccounts = 0;

	public static void main(String[] args) {

		Account object1 = new Account();
		Account object2 = new Account();
		Account object3 = new Account();
		Account object4 = new Account();
		Account object5 = new Account();
		Account object6 = new Account();

		System.out.println("Accounts Created: " + getNumAccounts()); // prints out number of accounts
	}

	public static int getNumAccounts() {
		return numAccounts;
	}

	public Account() {
		numAccounts = numAccounts + 1; // add 1 per acc
	}

}
