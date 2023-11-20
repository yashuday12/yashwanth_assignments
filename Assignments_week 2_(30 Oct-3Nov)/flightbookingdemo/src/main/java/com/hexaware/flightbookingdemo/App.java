package com.hexaware.flightbookingdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hexaware.flightbookingdemo.entity.Passenger;
import com.hexaware.flightbookingdemo.service.PassengerServices;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("welcome to app");
        
        Passenger passenger=new Passenger(101,24,"yash","b1");
		
        
        PassengerServices passengerServices=new PassengerServices();
        
        boolean flag = true;

        while(flag) {
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter 1 for Inserting passenger details");
        	
        	System.out.println("Enter 2 for Deleting passenger details");
        	
        	System.out.println("Enter 3 for Inserting passenger details");
        	
        	System.out.println("Enter 4 for getting passenger details by id");
        	
        	System.out.println("Enter 5 for getting All passenger details");
        	
        	System.out.println("Enter 0 exit");
        	
        	int choose=sc.nextInt();
        	switch(choose) {
        	case 1:
        		
        		int count=passengerServices.insertPassengerDetails(passenger);
        		System.out.println(count);
        		break;
        	case 2:
        		passengerServices.deletePassengerDetails(passenger);
        		break;
        	case 3:
        		passengerServices.updatePassengerDetails(passenger);
        		break;
        	case 4:
        		System.out.println("enter passenger id ");
        		int pid=sc.nextInt();
        		Passenger obj=passengerServices.getPassengerDetailsById(pid);
        		System.out.println(obj);
        		break;
        	case 5:
        		List<Passenger> list1=new ArrayList<Passenger>();
        		list1=passengerServices.getAllPassengerDetails();
        		for (Passenger passenger2 : list1) {
					System.out.println(passenger2);
				}
        		

        		break;
        	case 0:
        		flag=false;
        		break;
        	default:
        		System.out.println("invalid input");
        		break;
        		
        	
        	
        	}
        	
        
    }
    }
}

