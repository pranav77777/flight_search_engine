package com.concretepage.controller;
import java.awt.PageAttributes.MediaType;
import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.concretepage.entity.Flight;
import com.concretepage.service.FlightService;




@RestController
@RequestMapping("api")
public class FlightController {
	
	
	@Autowired
	FlightService  flightservice;
	
	
	@GetMapping(value="/getFlightDetail",produces= {org.springframework.http.MediaType.APPLICATION_JSON_VALUE})
	public List <Flight>getAllFightDetail(@RequestParam Date date,@RequestParam String flight_between_cities) {
		
		
		System.out.println("welcome to  controller ");
		
		
		return  flightservice.getAllFlight( date, flight_between_cities);
	}
	
	
//	@Autowired
//	private IArticleService articleService;
//	@GetMapping("article/{id}")
//	public ResponseEntity<Article> getArticleById(@PathVariable("id") Integer id) {
//		Article article = articleService.getArticleById(id);
//		return new ResponseEntity<Article>(article, HttpStatus.OK);
//	}
//	@GetMapping("articles")
//	public ResponseEntity<List<Article>> getAllArticles() {
//		List<Article> list = articleService.getAllArticles();
//		return new ResponseEntity<List<Article>>(list, HttpStatus.OK);
//	}
//	@PostMapping("article")
//	public ResponseEntity<Void> addArticle(@RequestBody Article article, UriComponentsBuilder builder) {
//        boolean flag = articleService.addArticle(article);
//        if (flag == false) {
//        	return new ResponseEntity<Void>(HttpStatus.CONFLICT);
//        }
//        HttpHeaders headers = new HttpHeaders();
//        headers.setLocation(builder.path("/article/{id}").buildAndExpand(article.getArticleId()).toUri());
//        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
//	}
//	@PutMapping("article")
//	public ResponseEntity<Article> updateArticle(@RequestBody Article article) {
//		articleService.updateArticle(article);
//		return new ResponseEntity<Article>(article, HttpStatus.OK);
//	}
//	@DeleteMapping("article/{id}")
//	public ResponseEntity<Void> deleteArticle(@PathVariable("id") Integer id) {
//		articleService.deleteArticle(id);
//		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
//	}	
} 