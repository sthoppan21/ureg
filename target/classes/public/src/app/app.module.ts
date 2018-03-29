import { FormsModule } from '@angular/forms';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule, Routes } from '@angular/router';

import { ErrorsComponent } from './registration/errors.component';

import { AgeValidatorDirective } from './validators/age-validator.directive';
import { EmailValidatorDirective } from './validators/email-validator.directive';

import { DatePipe } from '@angular/common'; 
import { AppComponent } from './app.component';
import { RegistrationComponent } from './registration/registration.component';

//import { MatDatepickerModule } from '@angular/material/datepicker';
//import { MyTestApp } from './my-test-app';
import { MyDatePickerModule } from 'mydatepicker';
import {IMyOptions } from 'mydatepicker';
import { AdminLoginComponent } from './admin-login/admin-login.component';

const appRoutes: Routes = [
  { path: 'app', component: AppComponent ,
  children:[
    { path: 'registration', component: RegistrationComponent }
  ]
},

  //{ path: '**', component: ExampleCodesComponent }
  // { path: '**', component: DealerProfileComponent }
    // { path: '**', component: AdminDealerInfoComponent }
      // { path: '**', component: AdminDealerInventoryComponent }

     { path: '**', component: RegistrationComponent }
    //  { path: '**', component: ExampleCodeComponent }
      //{ path: '**', component: CustomerOrderComponent }


  /*{ path: 'hero/:id',      component: HeroDetailComponent },
  {
    path: 'heroes',
    component: HeroListComponent,
    data: { title: 'Heroes List' }
  },*/
];


@NgModule({
  imports: [BrowserModule, FormsModule, RouterModule.forRoot(
    appRoutes,
    { enableTracing: true } // <-- debugging purposes only
  )
  ,MyDatePickerModule,
  //MdDatepickerModule,            // <----- this module will be deprecated in the future version.
  //MdNativeDateModule       // <----- import(must)
           // <----- import(optional)
],  
  declarations: [AppComponent,RegistrationComponent, ErrorsComponent,
    AgeValidatorDirective,EmailValidatorDirective, AdminLoginComponent],
  bootstrap: [AppComponent]
})
export class AppModule {
}

export class MyFirstApp {

  private myDatePickerOptions: IMyOptions = {
  
            dateFormat :'dd.mm.yyyy',
  
  }
}