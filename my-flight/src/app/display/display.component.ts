import { Component, OnInit } from '@angular/core';

import {DataService} from '../data.service'
import { Data } from '../data';

@Component({
  selector: 'app-display',
  templateUrl: './display.component.html',
  styleUrls: ['./display.component.css']
})
export class DisplayComponent implements OnInit {

  constructor(private service:DataService){}

  data=[]
  userData:Data={

    date:'',
    fromCity:'',
    toCity:'',
    class:''
  
  }
  businessPassClass: "2220"
  date: "2018-12-22"
  departure: "16:43:04"
  economyPassClass: "1300"
  flightBetweenCities: "PUNE-MUMBAI"
  flightName: "SpiceJet"
  flight_id: 21
  premiumEconomyPassClass: "1950" 

  class:String
  ngOnInit() {



    
     
   
    this.data=Array.from(this.service.selectedFlightData)
   

    

    console.log("in display - - - - - - - -  -",this.data)

  }



  ngAfterViewInit(){

   
  }
 
  



}

