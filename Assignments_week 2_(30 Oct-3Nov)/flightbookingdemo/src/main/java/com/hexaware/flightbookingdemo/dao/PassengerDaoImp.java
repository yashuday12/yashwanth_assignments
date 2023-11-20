package com.hexaware.flightbookingdemo.dao;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hexaware.flightbookingdemo.HibernateUtill;
import com.hexaware.flightbookingdemo.entity.Passenger;

public class PassengerDaoImp implements IPassengerDao {
	

	SessionFactory sessionFactory = HibernateUtill.getSessionFactory();


	Session session = sessionFactory.openSession();

	Transaction tr = session.beginTransaction();


	@Override
	public int insertPassengerDetails(Passenger passenger) {
		//session.save(passenger);
		tr.commit();

		session.close();

		return 1;
	}

	@Override
	public int deletePassengerDetails(Passenger passenger) {
		// TODO Auto-generated method stub
		Passenger pdetelete=session.get(Passenger.class, 101);
		session.delete(pdetelete);
		tr.commit();

		session.close();

		return 1;
	}

	@Override
	public int updatePassengerDetails(Passenger passenger) {
		Passenger pupdate=new Passenger(102,25,"uday","c1");
		session.saveOrUpdate(pupdate);
		tr.commit();

		session.close();
		return 1;
	}

	@Override
	public Passenger getPassengerDetailsById(int pId) {
		// TODO Auto-generated method stub
		Query<Passenger>query=session.createQuery("select p from Passenger p where p.passengerId=?1");
		query.setParameter(1, pId);
		Passenger pas=query.getSingleResult();
		tr.commit();
		session.close();
		
		return pas;
		

		
	}

	@Override
	public List<Passenger> getAllPassengerDetails() {
		// TODO Auto-generated method stub
		Query<Passenger> query2 = session.createQuery("select  e from Passenger e");
		List<Passenger> list = query2.getResultList();
		return list;
		

		
		}
		
	}
	
	


