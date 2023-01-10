package day7.Inheritance.bankTask;

import java.util.Scanner;

public class branchBank extends mainBank {
  String branchName;
  int branchId;
  long branchPhone;
  private int branchTotalFund;
  private float branchInterest;
  public branchBank(String branchName, int branchId, long branchPhone,String bankName, int bankId, long bankPhone, int branchTotalFund, float branchInterest, int bankTotalFund, float bankInterest){
    super(bankTotalFund, bankInterest);
    super.bankName = bankName;
    super.bankId = bankId;
    super.bankPhone = bankPhone;
    this.branchName = branchName;
    this.branchId = branchId;
    this.branchPhone = branchPhone;
    this.branchTotalFund = branchTotalFund;
    this.branchInterest = branchInterest;
  }
  public static void main(String args[]){
    branchBank abc = new branchBank("ABC", 456, 101111, "RBI", 1, 1001001, 1000000, 6, 100000000, 10);
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the loan amount");
    
    int loan = sc.nextInt();
    abc.checkLoan(loan, abc.branchInterest);
    sc.close();
  }
   


}
