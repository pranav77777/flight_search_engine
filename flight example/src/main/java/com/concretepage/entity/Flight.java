package com.concretepage.entity;
import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="flight_schedule")
public class Flight implements Serializable { 
	private static final long serialVersionUID = 1L;
	
	@Id
	private int flight_id;
	
	
	@Column(name="date")
	private Date date;
	
	@Column(name="flight_between_cities")
	private String flightBetweenCities;
	

	@Column(name="flight_name")
	private String flightName;
	
	@Column(name="departure")
	private String departure;
	
	@Column(name="business_pass_class")
	private String businessPassClass;
	
	@Column(name="premium_economy_pass_class")
	private String premiumEconomyPassClass;
	
	@Column(name="economy_pass_class")
	private String economyPassClass;

	public int getFlight_id() {
		return flight_id;
	}

	public void setFlight_id(int flight_id) {
		this.flight_id = flight_id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getFlightBetweenCities() {
		return flightBetweenCities;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public void setFlightBetweenCities(String flightBetweenCities) {
		this.flightBetweenCities = flightBetweenCities;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	

	public String getBusinessPassClass() {
		return businessPassClass;
	}

	public void setBusinessPassClass(String businessPassClass) {
		this.businessPassClass = businessPassClass;
	}

	public String getPremiumEconomyPassClass() {
		return premiumEconomyPassClass;
	}

	public void setPremiumEconomyPassClass(String premiumEconomyPassClass) {
		this.premiumEconomyPassClass = premiumEconomyPassClass;
	}

	public String getEconomyPassClass() {
		return economyPassClass;
	}

	public void setEconomyPassClass(String economyPassClass) {
		this.economyPassClass = economyPassClass;
	}
	
} 