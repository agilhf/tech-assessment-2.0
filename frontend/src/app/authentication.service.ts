import { Injectable } from '@angular/core';
import {BehaviorSubject, map, Observable} from "rxjs";
import {User} from "./user";
import {Router} from "@angular/router";
import {HttpClient} from "@angular/common/http";
import {environment} from "../environments/environment";

@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {
  //private userSubject: BehaviorSubject<User>;
  //public user: Observable<User>;

  constructor(private router: Router,
              private http: HttpClient) {
    //this.userSubject = new BehaviorSubject<User>(JSON.parse(localStorage.getItem('user'))); //TODO: get user request
    //this.user = this.userSubject.asObservable();
  }

  // public get userValue(): User {
  //   return this.userSubject.value;
  // }

  // login(username: string, password: string) {
  //   return this.http.post<any>(`${environment.apiUrl}/users/authenticate`, { username, password }) //TODO: Implementauth backend
  //     .pipe(map(user => {
  //       // store user details and basic auth credentials in local storage to keep user logged in between page refreshes
  //       user.authdata = window.btoa(username + ':' + password);
  //       localStorage.setItem('user', JSON.stringify(user));
  //       this.userSubject.next(user);
  //       return user;
  //     }));
  // }

  logout() {
    // remove user from local storage to log user out
    localStorage.removeItem('user');
    //this.userSubject.next(null);
    this.router.navigate(['/login']);
  }
}
