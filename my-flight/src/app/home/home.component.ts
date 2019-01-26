import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { DataService } from '../data.service';
import { Data } from '../data';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
fromCity; 
toCity;
date;
class;

dataObject:Data={

  date:'',
  fromCity:'',
  toCity:'',
  class:''

}
  constructor(private router:Router,private http : HttpClient,private service:DataService) { }

  ngOnInit() {
  }

  myFunction(){

//console.log("my function called - - - - - ",this.fromCity,this.toCity,this.class,this.date)
    



this.dataObject.toCity=this.toCity
this.dataObject.fromCity=this.fromCity
this.dataObject.date=this.date
this.dataObject.class=this.class


console.log(this.dataObject)
this.service.setSelectedData(this.dataObject)


    this.service.getFlightData(this.date,this.fromCity,this.toCity).subscribe(

      data=>{


console.log("data - = = = = ",data)
        this.service.setFlightData(data)
      
        this.router.navigate(['dataDisplay'])
      }
    )
    


    
  }



}
