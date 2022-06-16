import { Component, OnInit } from '@angular/core';
import {AccountService} from "../account.service";
import {TransactionService} from "../transaction.service";
import {Transaction} from "../transaction";
import {ActivatedRoute} from "@angular/router";

@Component({
  selector: 'app-transaction-list',
  templateUrl: './transaction-list.component.html',
  styleUrls: ['./transaction-list.component.css']
})
export class TransactionListComponent implements OnInit {
  // @ts-ignore
  id: number
  // @ts-ignore
  transactions:Transaction[]

  constructor(public transactionService: TransactionService, private route:ActivatedRoute) { this.route.params.subscribe(params => {
    console.log(params);
    if (params['id']) {
      this.transactionService.findByAccountId(params['id'])
    }
    });
  }
  ngOnInit(): void{
    this.transactionService.findByAccountId(this.id).subscribe( data => {
      // @ts-ignore
      this.transactions = data
    })
  }
  totalSum():number {
    let accumulator: number = 0
    for(let transaction of this.transactions){
      console.log(typeof transaction.amount)
      // @ts-ignore
      accumulator += transaction.balance
      console.log(accumulator)
      console.log("Hello")
    }
    // @ts-ignore
    return accumulator
  }


}
