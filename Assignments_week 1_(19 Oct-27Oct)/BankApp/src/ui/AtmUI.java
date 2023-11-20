package ui;

import java.util.Scanner;

import com.hdfc.service.IBank;

import util.BankUtil;



public class AtmUI {

	public static void main(String[] args) {

		boolean flag = true;

		while (flag) {

			System.out.println("WELCOME TO ATM");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Exit/Logout");

			Scanner scanner = new Scanner(System.in);

			int choice = scanner.nextInt();

			IBank bank = BankUtil.getBankObj();

			switch (choice) {
			case 1:

				

				bank.deposit();

				break;
			case 2:

				
				bank.withdraw();

				break;
			case 3:
				

				flag = false;

				System.out.println("Thank you visit again..");
				break;

			default:

				System.err.println("Invalid Input");

				break;
			}

		}
	}

}
