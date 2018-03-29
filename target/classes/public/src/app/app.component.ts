import { NgForm } from '@angular/forms';
import { Component, ViewChild, TemplateRef } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'my-app',
  templateUrl: './app.component.html'
})
export class AppComponent {

  private count = 1;

  phoneNumberIds: number[] = [1];

  @ViewChild('validateForm')
  @ViewChild('readOnlyTemplate') readOnlyTemplate: TemplateRef<any>;
  @ViewChild('editTemplate') editTemplate: TemplateRef<any>;
  private validateForm: NgForm;

  constructor() {
  }
}
