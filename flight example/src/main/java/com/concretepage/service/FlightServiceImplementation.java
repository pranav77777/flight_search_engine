package com.concretepage.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concretepage.dao.FlightDAO;
import com.concretepage.entity.Flight;


@Service
public class FlightServiceImplementation implements FlightService {
	
	
	@Autowired
	FlightDAO flightdao;
	

	@Override
	public List<Flight> getAllFlight(Date date,String flight_between_cities) {
		
		return flightdao.getAllFlight(date, flight_between_cities);
	}
	
	
	
	
	
//	@Autowired
//	private IArticleDAO articleDAO;
//	@Override
//	public Article getArticleById(int articleId) {
//		Article obj = articleDAO.getArticleById(articleId);
//		return obj;
//	}	
//	@Override
//	public List<Article> getAllArticles(){
//		return articleDAO.getAllArticles();
//	}
//	@Override
//	public synchronized boolean addArticle(Article article){
//       if (articleDAO.articleExists(article.getTitle(), article.getCategory())) {
//    	   return false;
//       } else {
//    	   articleDAO.addArticle(article);
//    	   return true;
//       }
//	}
//	@Override
//	public void updateArticle(Article article) {
//		articleDAO.updateArticle(article);
//	}
//	@Override
//	public void deleteArticle(int articleId) {
//		articleDAO.deleteArticle(articleId);
//	}
}
