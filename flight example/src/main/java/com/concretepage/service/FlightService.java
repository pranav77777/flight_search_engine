package com.concretepage.service;

import java.sql.Date;
import java.util.List;

import com.concretepage.entity.Flight;



public interface FlightService {
 List<Flight> getAllFlight(Date date,String flight_between_cities);
//     boolean addArticle(Article article);
//     void updateArticle(Article article);
//     void deleteArticle(int articleId);
}
