import {Account} from "./account";

export class User {
// @ts-ignore
  id: number;
// @ts-ignore
  type: string;
  // @ts-ignore
  userName: string;
  // @ts-ignore
  firstName: string;
  // @ts-ignore
  lastName: string;
  // @ts-ignore
  customerNumber: string;
  // @ts-ignore
  cardNumber: string;
  // @ts-ignore
  password: string;
  // @ts-ignore
  pin: string;
  // @ts-ignore
  accounts: Array<Account>;
}
