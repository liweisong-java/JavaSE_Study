package com.Test2;

public class AccountTest {
	public static void main(String[] args) {
		bankAccount acct1 = new bankAccount();
		bankAccount acct2 = new bankAccount("123456", 2000);
		
		System.out.println(acct1);
		System.out.println(acct2);
	}
}
