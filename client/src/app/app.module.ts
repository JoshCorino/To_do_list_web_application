import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

// added
import { HttpClientModule } from '@angular/common/http';
import { TodoListComponent } from './todo-list/todo-list.component';

// added for interface 
import { MatButtonModule, MatCardModule, MatInputModule, MatListModule, MatToolbarModule } from '@angular/material';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { TodoEditComponent } from './todo-edit/todo-edit.component';

@NgModule({
  declarations: [
    AppComponent,
    TodoListComponent,
    TodoEditComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatCardModule,
    MatInputModule,
    MatListModule,
    MatToolbarModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})

export class AppModule { }
