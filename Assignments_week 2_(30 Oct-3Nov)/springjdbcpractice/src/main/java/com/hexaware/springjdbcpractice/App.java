package com.hexaware.springjdbcpractice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.springjdbcpractice.config.AppConfig;
import com.hexaware.springjdbcpractice.model.Passenger;
import com.hexaware.springjdbcpractice.service.IPassengerService;
import com.hexaware.springjdbcpractice.service.PassengerService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
    	System.out.println("hi");
    	IPassengerService service =context.getBean(PassengerService.class);
    	Passenger passenger= new Passenger(101,"yash",24);
    	System.out.println("hello");
    	int result=service.insertDetails(passenger);
    	System.out.println(result+"recorded inserted");
    	context.close();
      
    }
}
