import { Component,ViewChild } from '@angular/core';
import { jqxComboBoxComponent } from 'jqwidgets-scripts/jqwidgets-ts/angular_jqxcombobox';



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'my-flight';
  @ViewChild('jqxComboBox') jqxComboBox: jqxComboBoxComponent;











}




