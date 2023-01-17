package day12.javaproject;

import java.util.Scanner;

public class main {
  bank bankObj = new bank();
  public static void main(String args[]){
    main main = new main();
    Scanner sc = new Scanner(System.in);
    while(true){
      System.out.println("1.Add Customer\n 2.Deposit\n 3.Check Balance\n 4.Withdraw\n 5.Transaction History");
      int choice  = sc.nextInt();
      switch (choice) {
        case 1:
          customer customer = new customer();
          customer.addCustomer();
          main.bankObj.map.put(customer.account.accountNo, customer);
          break;

        case 2:
          System.out.println("Enter Account No: ");
          long accountNo = sc.nextLong();
          if(main.bankObj.map.containsKey(accountNo)){
            atm atm = new atm();
            main.bankObj.map.put(accountNo, atm.deposit(main.bankObj.map.get(accountNo)));
          }else{
            System.out.println("Account No not valid");
          }

        case 3:
          System.out.println("Enter Account No: ");
          long accountNo1 = sc.nextLong();
          if(main.bankObj.map.containsKey(accountNo1)){
            atm atm = new atm();
            atm.checkBalance(main.bankObj.map.get(accountNo1));
          }

        case 4:
          break;

        case 5:
          break;

        default:
          break;
        }
          
      
      }
    }
}
