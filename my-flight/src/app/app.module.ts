import { FormsModule  } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { NgModule } from '@angular/core';
import { jqxWindowComponent } from 'jqwidgets-scripts/jqwidgets-ts/angular_jqxwindow';
import { jqxButtonComponent } from 'jqwidgets-scripts/jqwidgets-ts/angular_jqxbuttons';
import { jqxInputComponent } from 'jqwidgets-scripts/jqwidgets-ts/angular_jqxinput';
import { jqxComboBoxComponent } from 'jqwidgets-scripts/jqwidgets-ts/angular_jqxcombobox';
import { AppComponent } from './app.component';
import { RouterModule, Routes } from '@angular/router';
import { DisplayComponent } from './display/display.component';
import { HomeComponent } from './home/home.component';
import { HttpClientModule } from '@angular/common/http'; 
import { DataService } from './data.service';

const appRoutes: Routes = [

  {
    path: 'dataDisplay',
    component:DisplayComponent
  },

  {
    path: 'home',
    component:HomeComponent
  },
  { path: '',
    redirectTo: '/home',
    pathMatch: 'full'
  },

];


@NgModule({
  declarations: [
    AppComponent,
    jqxWindowComponent,
    jqxButtonComponent,
    jqxInputComponent,
    jqxComboBoxComponent,
    DisplayComponent,
    HomeComponent



  ],
  imports: [
    FormsModule,
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot(
      appRoutes
    )
  ],
  providers: [DataService ],
  bootstrap: [AppComponent]
}
)

export class AppModule { 

}
