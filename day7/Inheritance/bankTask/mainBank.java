package day7.Inheritance.bankTask;

public class mainBank extends internationalBank {
  String bankName;
  int bankId;
  long bankPhone;
  private int bankTotalFund;
  private float bankInterest;

  public mainBank(int bankTotalFund, float bankInterest){
    this.bankTotalFund = bankTotalFund;
    this.bankInterest = bankInterest;
  }

  public void checkLoan(int loanAmount, float branchInterest){
    if(loanAmount< bankTotalFund){
      System.out.println("Loan can be approved");
      totalInterest(branchInterest);
      // this.intBankName
    }
  }

  void totalInterest(float branchInterest){
    System.out.println("Your total interest will be: "+ (branchInterest+ this.bankInterest + this.interest()));
    //System.out.println("Total amount to be payed is ");
  }

}
