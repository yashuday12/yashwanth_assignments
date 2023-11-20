package com.hexaware.mappingspractice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.mappingspractice.entites.Ticket;
import com.hexaware.mappingspractice.entites.User;



public class OneToMany {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtill.getSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		Ticket t1 = new Ticket();
		t1.setTicketId(101);
		t1.setSource("Delhi");
		t1.setDestination("Pune");
		Ticket t2 = new Ticket();
		t2.setTicketId(102);
		t2.setSource("Delhi");
		t2.setDestination("Pune");

		Ticket t3 = new Ticket();
		t3.setTicketId(103);
		t3.setSource("Delhi");
		t3.setDestination("Pune");

		User u = new User();

		u.setUserId(500);
		u.setUsername("Yash");

		// add all employee to collection set , using addEmployee(employee)

		u.addTicket(t1);
		u.addTicket(t2);
		u.addTicket(t3);

		session.persist(u);

		tx.commit();

	}

}
