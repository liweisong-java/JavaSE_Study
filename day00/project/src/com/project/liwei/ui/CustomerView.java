package com.project.liwei.ui;

import com.project.liwei.bean.Customer;
import com.project.liwei.service.CustomerList;
import com.project.liwei.util.CMUtility;

public class CustomerView {
	private CustomerList customerList = new CustomerList(10);
	
	public CustomerView() {
		Customer customer = new Customer("李伟松",'男',22,"15948847175","1139575852@qq.com");
		customerList.addCustomer(customer);
	}
	public void enterMainMenu() {
		//显示主菜单，响应用户输入，根据用户操作分别调用其他相应的成员方法（如addNewCustomer），以完成客户信息处理。
		boolean isFlag = true;
		while(isFlag){
			System.out.println("************************用户管理**************************");
			System.out.println();
			System.out.println("			1.添加客户");
			System.out.println("			2.修改客户");
			System.out.println("			3.删除客户");
			System.out.println("			4.客户列表");
			System.out.println("			  5.退出");
			System.out.println();
			System.out.print("	请选择(1-5)：");
			char menu = CMUtility.readMenuSelection();
			switch(menu) {
			case '1':
				addNewCustomer();
				break;
			case '2':
				modifyCustomer();
				break;
			case '3':
				deleteCustomer();
				break;
			case '4':
				listAllCustomers();
				break;
			case '5':
				System.out.print("是否退出(Y/N)");
				char isExit = CMUtility.readConfirmSelection();
				if(isExit == 'Y') {
					isFlag = false;
				}
			}
		}
	}
	private void addNewCustomer() {
		//添加用户
		System.out.println("**********************添加用户*************************");
		System.out.print("姓名");
		String name = CMUtility.readString(10);
		System.out.print("性别");
		char gender = CMUtility.readChar();
		System.out.print("年龄");
		int age = CMUtility.readInt();
		System.out.print("电话");
		String phone = CMUtility.readString(13);
		System.out.print("邮箱");
		String email = CMUtility.readString(30);
		//讲上述数据封装到对象中
		Customer customer = new Customer(name,gender,age,phone,email);
		boolean isSuccess = customerList.addCustomer(customer);
		if(isSuccess) {
			System.out.println("********************添加完成******************");
		}else {
			System.out.println("*************************添加失败************************");
			}
		
	}
	private void modifyCustomer() {
		//修改用户
		Customer cust;
		int number;
		for(;;) {
			System.out.println("请选择待修改的用户  (-1)退出");
			number = CMUtility.readInt();
			if(number == -1) {
				return;
			}
			cust = customerList.getCustomer(number - 1 );
			if(cust == null) {
				System.out.println("无法找到指定的客户");
			}else {//找到相应的客户
				break;
			}
		}
		//修改客户信息
		System.out.print("姓名(" + cust.getName() + "):");
		String name = CMUtility.readString(10, cust.getName());
		System.out.print("性别(" + cust.getGender() + "):");
		char gender = CMUtility.readChar(cust.getGender());
		System.out.print("年龄(" + cust.getAge() + "):");
		int age = CMUtility.readInt(cust.getAge());
		System.out.print("电话(" + cust.getPhone() + "):");
		String phone = CMUtility.readString(13 , cust.getPhone());
		System.out.print("邮箱(" + cust.getEmail() + "):");
		String email = CMUtility.readString(30, cust.getEmail());
		
		Customer newCust = new Customer(name,gender,age,phone,email);
		
		boolean isRepalaced = customerList.replaceCustomer(number - 1 , newCust);
		if(isRepalaced) {
			System.out.println("**********************修改完成*********************");
		}else {
			System.out.println("*********************修改失败*********************");
		}
	}
		
		
	private void deleteCustomer() {
		//删除用户
		System.out.println("**************************删除用户*************************");
		int number;
		for(;;) {
		System.out.println("请选择待删除的客户编号（-1退出）");

		number = CMUtility.readInt();
		
		if(number == -1) {
			return;
		}
			Customer customer = customerList.getCustomer(number - 1);
			if(customer == null) {
			System.out.println("无法找到指定客户");
			}else {
				break;
			}
		}
		//找到了指定客户
		System.out.println("确定是否删除(Y/N)");
		char isDelete = CMUtility.readConfirmSelection();
		if(isDelete == 'Y') {
			boolean deleteSuccess = customerList.deleteCustomer(number - 1);
			if(deleteSuccess) {
				System.out.println("********************删除完成********************");
			}else {
				System.out.println("*********************删除失败********************");
			}
		}else {
				return;
		}
	}
	private void listAllCustomers() {
		//客户列表
		System.out.println("*********************客户列表**********************");
		int total = customerList.getTotal();
		if(total == 0) {
			System.out.println("没有客户");
		}else {
			System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
			Customer[] custs = customerList.getAllCustomers();
			for(int i = 0;i < custs.length;i++) {
				Customer cust = custs[i];
				System.out.println((i + 1) + "\t" + cust.getName() + "\t" + cust.getGender() + "\t" + cust.getAge() + "\t" + cust.getPhone() + "\t" + cust.getEmail());
			}
		}
		System.out.println("****************** 客户列表完成**********************");
	}
	public static void main(String[] args) {
		CustomerView View = new CustomerView();
		View.enterMainMenu();
	}

}
