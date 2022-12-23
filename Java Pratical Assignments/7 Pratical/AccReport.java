

/*

Define an Account class with variables acc_no, acc_type, acc_name and acc_balance. 
Write a program to accept data of 10 account holders. 
Save these objects using collection framework class of your choice. 
Print names of customers having balance greater than 10,000

*/

import java.util.ArrayList;
import java.util.List;

class Account {
//	Account class with variables acc_no, acc_type, acc_name and acc_balance.
	private int acc_no;
	private String acc_type;
	private String acc_name;
	private int acc_balance;

	public void setAcc_Account(int acc_no, String acc_type, String acc_name, int acc_balance) {
		this.acc_no = acc_no;
		this.acc_type = acc_type;
		this.acc_name = acc_name;
		this.acc_balance = acc_balance;
	}

	public String getAcc_name() {
		return acc_name;
	}

	public int getAcc_balance() {
		return acc_balance;
	}

}

public class AccReport {
	public static void main(String[] args) {
		
//		Save these objects using collection framework class of your choice.
		List<Account> listAcc = new ArrayList<Account>();
		
//		Accept data of 10 account holders.
		Account acc = new Account();
		acc.setAcc_Account(1, "Current", "Aniket", 22000);
		listAcc.add(acc);

		acc = new Account();
		acc.setAcc_Account(2, "Saving", "Gaurav", 9000);
		listAcc.add(acc);

		acc = new Account();
		acc.setAcc_Account(3, "Saving", "Vaibhav", 17400);
		listAcc.add(acc);

		acc = new Account();
		acc.setAcc_Account(4, "Saving", "Pradip", 89000);
		listAcc.add(acc);

		acc = new Account();
		acc.setAcc_Account(5, "Current", "Hemant", 122);
		listAcc.add(acc);

		acc = new Account();
		acc.setAcc_Account(6, "Saving", "Mayur", 1800);
		listAcc.add(acc);

		acc = new Account();
		acc.setAcc_Account(7, "Current", "Shubham", 50000);
		listAcc.add(acc);

		acc = new Account();
		acc.setAcc_Account(8, "Saving", "Deepak", 4000);
		listAcc.add(acc);

		acc = new Account();
		acc.setAcc_Account(9, "Saving", "Akash", 8200);
		listAcc.add(acc);

		acc = new Account();
		acc.setAcc_Account(10, "Saving", "Sujit", 43000);
		listAcc.add(acc);
		
//		Print names of customers having balance greater than 10,000
		for (int i = 0; i < listAcc.size(); i++) {
			if (listAcc.get(i).getAcc_balance() > 10000) {
				System.out.println(
						"Customer Name : " + listAcc.get(i).getAcc_name() + " is having balance greater than 10000");
			}
		}
	}
}
