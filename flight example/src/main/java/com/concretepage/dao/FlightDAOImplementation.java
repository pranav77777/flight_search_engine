package com.concretepage.dao;
import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.concretepage.entity.Flight;


@Transactional
@Repository
public class FlightDAOImplementation implements FlightDAO {
	@PersistenceContext	
	private EntityManager entityManager;

	@Override
	public List<Flight> getAllFlight(Date date,String flight_between_cities) {
		// TODO Auto-generated method stub
		
		String hql = " FROM Flight WHERE  date="+"'"+date+"'"+"AND flight_between_cities="+"'"+flight_between_cities+"'" ;
		
		//String hql1="Select "+pass_class+" ,departure,flightName from Flight";
		return (List<Flight>) entityManager.createQuery(hql).getResultList();
		
		

	}
}
