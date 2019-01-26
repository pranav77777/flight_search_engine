package com.concretepage.dao;
import java.sql.Date;
import java.util.List;

import com.concretepage.entity.Flight;

public interface FlightDAO {
	
	
	
	 List<Flight> getAllFlight(Date date,String flight_between_cities);

	
}
 