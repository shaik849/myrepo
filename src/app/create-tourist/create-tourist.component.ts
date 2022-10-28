import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';

import Tourist from '../tourist';
import { TouristsService } from '../tourists.service';



@Component({
  selector: 'app-create-tourist',
  templateUrl: './create-tourist.component.html',
  styleUrls: ['./create-tourist.component.css']
})
export class CreateTouristComponent implements OnInit{

tourist: Tourist = new Tourist();

  constructor(private service: TouristsService,
    private router:Router){ }
  ngOnInit(): void {
  }

  onsaveTourist(){
    console.log(this.tourist.id);
    if(this.tourist.id !=undefined && this.tourist.age<=90 && this.tourist.firstname && this.tourist.lastname && this.tourist.fromPlace && this.tourist.numberofDaysVisits){
    this.service.createTouristList(this.tourist).subscribe(data => {
      console.log(data);
   alert("success");
      this.goToTouristList();
        },  
   error => console.log(error)

    );
      }else{
        alert("check all fileds and also Age can’t be more than 90");
      }
      
  }
  goToTouristList(){
   this.router.navigate(['home'])
  }
  allowOnlyNumeric(e:any){
    const charCode = (e.which) ? e.which : e.keyCode;
    if (charCode > 31 && (charCode < 48 || charCode > 57)) {
       return false;
    }
    return true;
    }
    allowOnlyNumericAge(e:any){
      const charCode = (e.which) ? e.which : e.keyCode;
      if (charCode > 31 && (charCode < 48 || charCode > 57)) {
         return false;
      }
      else{
      return true;
      }
      }

    allowOnlyAlphabet(a:any){
      const charCode = (a.which) ? a.which : a.keyCode;
      if ((charCode >= 65 && charCode <= 90) || (charCode >=97 &&charCode<=122)) {
        return true;
    }
    return false;
    }
  
  
}
