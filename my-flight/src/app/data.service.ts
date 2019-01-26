import { Injectable } from '@angular/core';

import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Data } from './data';


@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor(private http :HttpClient) {


    
   }


   getFlightData(date,fromCity,toCity){

      return this.http.get('http://localhost:8089/api/getFlightDetail?date='+ date+'&flight_between_cities='+fromCity+'-'+toCity)
  }

selectedFlightData

  setFlightData(data){


this.selectedFlightData=data
  }


  selectedData:Data={

    date:'',
    fromCity:'',
    toCity:'',
    class:''
  
  }


  setSelectedData(data:Data){



    this.selectedData.class=data.class
    this.selectedData.date=data.date
    this.selectedData.fromCity=data.fromCity
    this.selectedData.toCity=data.toCity

    
  }

  getSelectedData():Data{
    return this.selectedData
  }

  }

