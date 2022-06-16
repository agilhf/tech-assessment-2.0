// @ts-ignore

import {Injectable, NgModule} from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HTTP_INTERCEPTORS, HttpClientModule, HttpHandler, HttpInterceptor, HttpRequest} from '@angular/common/http';
import { AppComponent } from './app.component';
import {RouterModule} from "@angular/router";
import { AccountListComponent } from './account-list/account-list.component';
import { AccountFormComponent } from './account-form/account-form.component';
import {FormsModule} from "@angular/forms";
import { AppRoutingModule } from './app-routing.module';
import {AccountService} from "./account.service";
import {AppService} from "./app.service";
import { TransactionListComponent } from './transaction-list/transaction-list.component';
import {TransactionService} from "./transaction.service";

// @Injectable()
// export class XhrInterceptor implements HttpInterceptor{
//   intercept(req: HttpRequest<any>, next: HttpHandler) {
//     const xhr = req.clone({
//       headers: req.headers.set('X-Requested-With', 'XMLHttpRequest')
//     });
//     return next.handle(xhr)
//   }
// }

@NgModule({
  declarations: [
    AppComponent,
    AccountListComponent,
    AccountFormComponent,
    TransactionListComponent,
  ],
    imports: [
        BrowserModule,
        RouterModule,
        FormsModule,
        AppRoutingModule,
        HttpClientModule
    ],
  providers: [/*AppService, { provide: HTTP_INTERCEPTORS, useClass: XhrInterceptor, multi: true},*/ TransactionService,AccountService],
  bootstrap: [AppComponent]
})

export class AppModule { }

