package day12.javaproject;

import java.util.Scanner;

public class customer implements customerInterface{

  public account account; //to access account.java
  String name ="";
  int id = 0;
  String email = "";
  int password ;
  long phoneNo=0;
  long cardNo = 0;
  String address = "";
  
  @Override
  public void addCustomer() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter customerID: ");
    this.id = sc.nextInt();
    System.out.println("Customer Name: ");
    this.name = sc.next();
    System.out.println("Customer Email: ");
    this.email = sc.next();
    System.out.println("Customer Password: ");
    this.password = sc.nextInt();
    System.out.println("Customer Card No: ");
    this.cardNo = sc.nextLong();
    System.out.println("Customer Phone No: ");
    this.phoneNo = sc.nextLong();
    System.out.println("Customer Address: ");
    this.address = sc.nextLine();
    this.account = new account().addAccount();
  }

  @Override
  public void deleteCustomer() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void editCustomer() {
    // TODO Auto-generated method stub
    
  }
  
  
}
