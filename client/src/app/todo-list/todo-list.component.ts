import { Component, OnInit } from '@angular/core';
import { TodoService } from '../shared/todo/todo.service';
import { AbstractFormGroupDirective } from '@angular/forms';

@Component({
  selector: 'app-todo-list',
  templateUrl: './todo-list.component.html',
  styleUrls: ['./todo-list.component.css'],
})
export class TodoListComponent implements OnInit {
  todos: Array<any>;
  folderParts: Array<any>;
  selected: String;
  constructor(private todoService: TodoService) { }

  ngOnInit() {
    this.todoService.getAll().subscribe(data => {
      this.todos = data;
    });
  }
}
