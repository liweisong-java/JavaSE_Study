package com.account.java;
/*
 * 
 * 
 * 写一个Account的类模拟账户。该类的属性和方法如下图所示。该类包括的属性：
 * 账号id，余额balance，年利率：annualinterestRate;包含的方法：访问器方法（getter和setter方法）取款方法withdraw()
 * 存款方法deposit();
 * 
 * 						Account
 * 		private int id;
 * 		private double balance;
 * 		private double annualinterestRate;
 * 
 * 		public Account(int id,double balance,double annualInterestRate)
 * 
 * 		public int getld();
 * 		public double getBalance();
 * 		public double getAnnualinterestRate();
 * 		public void setld(int id);
 * 		public void setBalance(double annualinterestRate);
 * 		public void setAnnualinterestRate(double annualinterestRate);
 * 		public void withdraw(double amount);//取钱
 * 		public void deposit(double amount);//存钱
 * 
 * 
 * 						
 * 
 * 
 * 						Customer
 * 		private String firstName
 * 		private String lastName
 * 		private Account account
 * 
 * 		public Customer(String f,String l)
 * 
 * 		public String getFirstName()
 * 		public String getlastName()
 * 		public Account getAccount()
 * 		public void setAccount(Account account)
 */
public class Customer {
	private String firstName;
	private String lastName;
	private Account account;
	
	public Customer(String f,String l) {
		this.firstName = f;
		this.lastName = l;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	
}
