package com.dyanamic.queries;

import java.util.Scanner;

import com.flight.FlightDao;



public class Curd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlightDao dao = new FlightDao();

		boolean flag = true;

		Scanner scanner = new Scanner(System.in);

		while (flag) {

			System.out.println("Welcome to EMS");
			System.out.println("1. INSERT EMPLOYEE");
			System.out.println("2. UPDATE EMPLOYEE");
			System.out.println("3. DELETE BY  EMPLOYEE ID");
			System.out.println("4. GET EMPLOYEE BY ID");
			System.out.println("5. GET ALL EMPLOYEES ");
			System.out.println("0. EXIT");

			int choice = scanner.nextInt();
			switch (choice) {
			case 1:

				System.out.println("Enter Fid");
				int fid = scanner.nextInt();
				System.out.println("Enter Fname");
				scanner.nextLine(); // to handle enter key
				String fname = scanner.nextLine();
				System.out.println("Enter Fprice");
				double Fprice = scanner.nextDouble();
				
				break;
			case 2:
				break;
			default:
					flag=false;
				
			
		

}
	}

}
