import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Account} from "./account";

@Injectable({
  providedIn: 'root'
})
export class AccountService {
  private accountsUrl: string;
  private accountSumUrl:string;

  constructor(private http: HttpClient) {
    this.accountsUrl = 'http://localhost:8080/accounts';
    this.accountSumUrl = 'http://localhost:8080/sumBalance'
  }
  public findAll():Observable<Account[]> {
    return this.http.get<Account[]>(this.accountsUrl)
  }
  public save(account: Account){
    return this.http.post<Account>(this.accountsUrl, account)
  }
  public sum(){

    return this.http.get(this.accountSumUrl)
  }
  public rounder(num: number){
    var numR = num*100
    // @ts-ignore
    var numReal = (numR % 5) >= 2.5 ? (numReal/ 5)*5 + 5 : (numReal/5)*5
    return numReal / 100

}
}
