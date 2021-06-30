package super构造器;
/*
 * 写一个名为Account的类模拟账户，该类的属性和方法如图所示，例如该类包括的属性：账号：id   余额：balance  年利率：annuallnterestRate
 * 包含的方法：访问器方法（getter和setter方法）返回月利率的方法 getMonthlyInerest（），取款方式 withdraw（） 存款方法 deposit（）
 * 
 *  
 * 
 */
public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	
	public Account(int id,double balance,double annualIterestRate) {
		
	}
	
	public int getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	//月利率
	public double getMonthlyInterest() {
		return annualInterestRate / 12;
	}
	//取钱
	public void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
			return;
		}else {
			System.out.println("余额不足");
		}
	}
	//存钱
	public void deposit(double amount) {
		if (amount > 0) {
		balance += amount;
		System.out.println("存款成功当前余额" + balance);
		}else {
		
		}
	}
}
