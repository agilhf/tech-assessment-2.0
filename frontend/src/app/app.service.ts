import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable} from "rxjs";
import {Account} from "./account";
import {User} from "./user";

@Injectable({
  providedIn: 'root'
})
export class AppService {

  //authenticated = false;
  private usersUrl: string;
  constructor(private http: HttpClient) {
    this.usersUrl = 'http://localhost:8080/users'
  }

  public findAll():Observable<User[]> {
    return this.http.get<User[]>(this.usersUrl)
  }
  // @ts-ignore
  // authenticate(credentials, callback) {
  //   const headers = new HttpHeaders(credentials ? {
  //     authorization : 'Basic ' + btoa(credentials.user + ' : ' + credentials.password)
  //   } : {});
  //   this.http.get('users', {headers: headers}).subscribe(response => {
  //     // @ts-ignore
  //     if (response['name']){
  //       this.authenticated = true
  //     } else {
  //       this.authenticated = false;
  //     }
  //     return callback && callback();
  //   })
  // }
  // isLoggedIn(){
  //   return this.authenticated;
  // }

}
