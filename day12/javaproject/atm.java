package day12.javaproject;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class atm implements atmInterface{

  @Override
  public customer deposit(customer customer) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Deposit Amount: ");
    float amount = sc.nextFloat();
    customer.account.accountBalance = customer.account.accountBalance + amount;
    System.out.println(customer.account.accountBalance);
    transaction transaction = new transaction();
    transaction.addTransaction("deposit", amount, customer.account.accountBalance);
    customer.account.transaction.add(transaction);
    return customer;
  }

  @Override
  public void withdraw(customer customer) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your Card No");
    float cardNo = sc.nextFloat();

    System.out.println("Enter your PIN: ");
    long pin = sc.nextLong();
    if(cardNo == customer.cardNo && pin == customer.password){
      System.out.println("Enter your withdraw amount");
      float amount = sc.nextFloat();
      if(amount < customer.account.accountBalance && (customer.account.accountBalance - amount)){
        System.out.println("Collect your amount: ");
        customer.account.accountBalance = customer.account.accountBalance - amount;
        
      }
    }

    
  }

  @Override
  public void checkBalance(customer customer) {
    // TODO Auto-generated method stub
    System.out.println("Your current account "+customer.account.accountBalance);
    
  }

  
  
}
