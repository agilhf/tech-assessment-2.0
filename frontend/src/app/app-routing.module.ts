import { NgModule, Injectable } from '@angular/core';
import {ActivatedRouteSnapshot, CanActivate, Router, RouterModule, RouterStateSnapshot, Routes} from "@angular/router";
import {AccountListComponent} from "./account-list/account-list.component";
import {AccountFormComponent} from "./account-form/account-form.component";
import {TransactionListComponent} from "./transaction-list/transaction-list.component";

//import { AuthenticationService } from '@app/_services';

const routes: Routes = [
  { path: "accounts", component: AccountListComponent },
  { path: "addaccounts", component: AccountFormComponent },
  {path: "transactions/:id", component: TransactionListComponent}
  //{ path: 'login', component: LoginComponent}
];
/*
@Injectable({ providedIn: 'root'})
export class AuthGuard implements CanActivate {
  constructor( private router: Router,
               private  authenticationService: AuthenticationService) {
  }
  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot) {
    const user = this.authenticationService.userValue;
    if (user) {
      // logged in so return true
      return true;
    }

    // not logged in so redirect to login page with the return url
    this.router.navigate(['/login'], { queryParams: { returnUrl: state.url } });
    return false;
  }

}*/
@NgModule({
  declarations: [],
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [
    RouterModule
  ]
})
export class AppRoutingModule { }
