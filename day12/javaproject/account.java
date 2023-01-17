package day12.javaproject;

import java.util.ArrayList;
import java.util.Scanner;

public class account extends bank implements accountInterface{
  ArrayList<transaction> transaction = new ArrayList<transaction>(); 
  long accountNo = 0;
  float accountBalance = 0;
  String accountType = "";
  @Override
  public account addAccount() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Account No: ");
    this.accountNo = sc.nextLong();
    System.out.println("Enter Account balanced: ");
    this.accountBalance = sc.nextFloat();
    System.out.println("Enter Account Type: ");
    this.accountType = sc.next();
    return this;

    
  }

  @Override
  public void deleteAccount() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void searchAccount() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void editAccount() {
    // TODO Auto-generated method stub
    
  }
  
}
