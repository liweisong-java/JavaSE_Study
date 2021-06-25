package eclipse05;

public class bankAccount {
	private int id;
	private String password = "000000";
	private double balance;
	private static double interestRate;
	private static double MinBalance = 1.0;
	
	private static int init = 1001;
	
	//构造器
	public bankAccount() {
		id = init++;
	}
	public bankAccount(String password,double balance) {
		id = init++;
		this.password = password;
		this.balance = balance;
	}
	
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static double getInterestRate() {
		return interestRate;
	}

	public static void setInterestRate(double interestRate) {
		bankAccount.interestRate = interestRate;
	}

	public static double getMinBalance() {
		return MinBalance;
	}

	public static void setMinBalance(double minBalance) {
		MinBalance = minBalance;
	}

	
	public int getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}
	@Override
	public String toString() {
		return "bankAccount [id=" + id + ", password=" + password + ", balance=" + balance + "]";
	}
	
	
	
}
