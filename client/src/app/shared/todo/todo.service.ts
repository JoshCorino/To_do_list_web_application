import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({providedIn: 'root'})
export class TodoService {

  constructor(private http: HttpClient) {
  }

  getFiltered(isPart: any): Observable<any> {
    return this.http.get('//localhost:8080/todos/' +isPart);
  }

  getAll(): Observable<any> {
    return this.http.get('//localhost:8080/todo');
  }

  get(id: string) {

    return this.http.get('//localhost:8080/todos/' + id);
  }

  save(todo: any): Observable<any> {
    let result: Observable<Object>;
    if (todo['href']) {
      result = this.http.put(todo.href, todo);
    } else {
      result = this.http.post('//localhost:8080/todos/', todo);
    }
    return result;
  }

  remove(href: string) {
    return this.http.delete(href);
  }
}
