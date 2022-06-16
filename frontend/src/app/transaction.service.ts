import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Transaction} from "./transaction";

@Injectable({
  providedIn: 'root'
})
export class TransactionService {
  private accountsUrl: string;
  constructor(private  http: HttpClient) {
    this.accountsUrl = 'http://localhost:8080/account/transaction/';
  }
  public findByAccountId(id: number): Observable<Transaction>{
    // @ts-ignore
    return this.http.get(this.accountsUrl+id)
  }
}
