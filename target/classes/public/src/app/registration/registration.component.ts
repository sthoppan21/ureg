import { AbstractControl, ValidatorFn,NgForm, Validators } from '@angular/forms';
import { Component, ViewChild, TemplateRef,OnInit } from '@angular/core';
import { Router } from '@angular/router';
//import { CommonService} from '../common.service';
import {IMyDpOptions} from 'mydatepicker';
import { ErrorsComponent } from './errors.component';
import { FormsModule } from '@angular/forms';
@Component({
 selector: 'registration',
  templateUrl:'./registration.component.html',
  styleUrls: ['./registration.component.css']

})


export class RegistrationComponent implements OnInit  {

    public myDatePickerOptions: IMyDpOptions = {
        // other options...
        dateFormat: 'dd.mm.yyyy',
    };

   
    age: number;
    birthdate: any;
    date: Date;
    dob:any;
  private count = 1;
  Today = new Date();
  phoneNumberIds: number[] = [1];

  @ViewChild('validateForm')
  @ViewChild('readOnlyTemplate') readOnlyTemplate: TemplateRef<any>;
  @ViewChild('editTemplate') editTemplate: TemplateRef<any>;
  private validateForm: NgForm;

  constructor() {
  }
ngOnInit(){
    
    }

  isValid: boolean = true;
     age1:number = 0;

        checkage() {    
            console.log("dobbbb"+this.dob);
            var birthday = new Date(this.dob);
             var today = new Date();
             var bornYearOf = birthday.getFullYear();
             var currYearOf = today.getFullYear();
             var age = currYearOf - bornYearOf;
            //const user={dob:this.dob};   
            // console.log('dob1..'+user.dob);
             //var x = user.dob;
            /* console.log('dob..'+dob.typeOf);
             console.log('dob..'+dob.toDateString);
             console.log('dob..'+dob.toString);
             console.log('dob..'+dob);
             var birthday = new Date(dob);
             var today = new Date();
             var bornYearOf = birthday.getFullYear();
             var currYearOf = today.getFullYear();
             console.log('birthday..'+birthday);
             console.log('today..'+today);
             console.log('bornYearOf..'+bornYearOf);
             console.log('currYearOf..'+currYearOf);
             //var age = ((today - birthday) / (31557600000));
             var age = currYearOf - bornYearOf;
             //var age = Math.floor( age );
             console.log('age1..'+age);
             //if(this.birthdate){
               // var timeDiff = Math.abs(Date.now() - x);
               // this.age = Math.floor((timeDiff / (1000 * 3600 * 24))/365);
               //                 }
                 //console.log('age1..'+x);*/  

                }

  register(validateForm: NgForm) {
    //console.log('Registration successful.');
    
    console.log(validateForm.value);
    
   //alert("Hi "+validateForm.value.name+" you information are valid.");
   return this.loadTemplate;
    };
  
  public loadTemplate() {
    if (this.age == 18) {
        return this.readOnlyTemplate;
    }
    else 
    {   
        return this.editTemplate;
    }
}


}