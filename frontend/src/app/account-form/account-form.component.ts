import { Component, OnInit } from '@angular/core';
import {Account} from "../account";
import {ActivatedRoute, Router} from "@angular/router";
import {AccountService} from "../account.service";

@Component({
  selector: 'app-account-form',
  templateUrl: './account-form.component.html',
  styleUrls: ['./account-form.component.css']
})
export class AccountFormComponent {

  account: Account;

  constructor(private route: ActivatedRoute,
              private router: Router,
              private accountService: AccountService) {
    this.account = new Account();
  }

  onSubmit() {
    this.accountService.save(this.account).subscribe(result => this.gotoAccountList());
  }
  gotoAccountList() {
    this.router.navigate(['/accounts'])
  }

}
