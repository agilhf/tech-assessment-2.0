import { Component, OnInit } from '@angular/core';
import {Account} from "../account";
import {AccountService} from "../account.service";
import {UserService} from "../user.service";
import {Subscription} from "rxjs";

@Component({
  selector: 'app-account-list',
  templateUrl: './account-list.component.html',
  styleUrls: ['./account-list.component.css']
})
export class AccountListComponent implements OnInit{
  // @ts-ignore
  total: number
  // @ts-ignore
  accounts: Account[]
  // @ts-ignore
  public value;
  constructor(public accountService: AccountService) { }

  ngOnInit(): void {
    this.accountService.findAll().subscribe(data => {
      this.accounts = data
    })
  }
  totalSum():number {
    let accumulator: number = 0
    for(let account of this.accounts){

      // @ts-ignore
      accumulator += account.balance

    }
    // @ts-ignore
    return accumulator
  }
  rounder(num: number):number{
    var numR = num*100
    // @ts-ignore
    var numReal = (numR % 5) >= 2.5 ? (numReal/ 5)*5 + 5 : (numReal/5)*5
    return numReal / 100
  }



}
