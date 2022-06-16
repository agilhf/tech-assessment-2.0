import { Component } from '@angular/core';
import {AccountService} from "./account.service";
import {HttpClient} from "@angular/common/http";
import {Router} from "@angular/router";
import {AppService} from "./app.service";
import {User} from "./user";
import {UserService} from "./user.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  // @ts-ignore
  users: User[]

  constructor(public userService: UserService) { }

  ngOnInit(): void {
    this.userService.findAll().subscribe(data => {
      this.users = data
    })
  }

  /*constructor(public app: AppService, private http: HttpClient, private router: Router) {
    this.app.authenticate(undefined, undefined)
  }
  logout() {
    // @ts-ignore
    this.http.post('logout', {}).finally(() => {
      this.app.authenticated = false;
      this.router.navigateByUrl('/login');
    }).subscribe();
  }*/
  title = 'Oepfelbaum Portemonnaie';

}
