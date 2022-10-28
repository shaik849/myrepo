import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import Tourist from '../tourist';
import { TouristsService } from '../tourists.service';
@Component({
  selector: 'app-touristscompo',
  templateUrl: './touristscompo.component.html',
  styleUrls: ['./touristscompo.component.css']
})
export class TouristscompoComponent implements OnInit {
  
  tourist: Tourist[];

 
  constructor(private service: TouristsService) { }

  ngOnInit(): void{
 this.getTourists();
}
private getTourists(){
  this.service.getTouristList().subscribe(data => this.tourist = data);
}

}
