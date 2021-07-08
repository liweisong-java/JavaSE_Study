package day0.src.eclipse05;

public class AccountTest {
	public static void main(String[] args) {
		eclipse05.bankAccount acct1 = new eclipse05.bankAccount();
		eclipse05.bankAccount acct2 = new eclipse05.bankAccount("123456", 2000);
		
		System.out.println(acct1);
		System.out.println(acct2);
	}
}
