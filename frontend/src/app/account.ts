import {Transaction} from "./transaction";
import {User} from "./user";

export class Account {
  // @ts-ignore
  id: number
  // @ts-ignore
  other: string;
  // @ts-ignore
  type: string;
  // @ts-ignore
  name: string;
  // @ts-ignore
  currency: string;
  // @ts-ignore
  balance: number
  // @ts-ignore
  status: string;
  // @ts-ignore
  accountSubType: string;
  // @ts-ignore
  transactions: Array<Transaction>;
}
