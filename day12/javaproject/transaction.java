package day12.javaproject;

import java.util.Date;

public class transaction implements transactionInterface{
  int transactionId;
  Date transactionDate = new Date();
  String transactionType;
  float transactionAmount;
  float currentBalance;
  @Override
  public void addTransaction(String transactionType, float transactionAmount, float currentBalance) {
    // TODO Auto-generated method stub
    this.transactionDate = new Date();
    this.transactionType = transactionType;
    this.transactionAmount = transactionAmount;
    this.currentBalance = currentBalance;
  }
    
}
