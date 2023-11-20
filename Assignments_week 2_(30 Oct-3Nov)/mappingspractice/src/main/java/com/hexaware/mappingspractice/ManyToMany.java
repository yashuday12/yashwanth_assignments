package com.hexaware.mappingspractice;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.mappingspractice.entites.Flight;
import com.hexaware.mappingspractice.entites.Passenger;

public class ManyToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtill.getSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();
		
		Passenger passenger1=new Passenger();
		passenger1.setPassengerId(101);
		passenger1.setPassengerName("yash");
		
		
		Passenger passenger2=new Passenger();
		passenger2.setPassengerId(102);
		passenger2.setPassengerName("Uday");
		
		Passenger passenger3=new Passenger();
		passenger3.setPassengerId(103);
		passenger3.setPassengerName("Gill");
		
		
		
		Flight flight1=new Flight();
		flight1.setFlightId(501);
		flight1.setFlightname("Air India");
		flight1.setSource("Delhi");
		flight1.setDestination("pune");
		flight1.addPassenger(passenger1); 
		flight1.addPassenger(passenger2);
		
		 Flight flight2=new Flight();
		 flight2.setFlightId(502);
			flight2.setFlightname("British");
			flight2.setSource("England");
			flight2.setDestination("paris");
			flight2.addPassenger(passenger1);
			flight2.addPassenger(passenger2);
			flight2.addPassenger(passenger3);
			
				session.persist(flight1);
				session.persist(flight2);
				
				tx.commit();
				
				sessionFactory.close();

	}

}
