import {User} from "./user";
import {Account} from "./account";

export class Transaction {
  // @ts-ignore
  id: number;
  // @ts-ignore
  amount: number;
  // @ts-ignore
  bookingDate: Date;
  // @ts-ignore
  cdtDbtInd: String;
  // @ts-ignore
  counterparty: number;
  // @ts-ignore
  remittanceInf: String;
}
