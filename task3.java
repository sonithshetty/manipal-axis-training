package day6;
import java.util.Scanner;


public class task3 {
  public String name,company;
  private int userID;
  private String Position;
  protected  int age;
// constructor Overloaded here
  public task3(String name, String company, int userID, String Position, int age) {
      this.name = name;
      this.company = company;
      this.userID = userID;
      this.Position = Position;
      this.age = age;
  }
  task3(String name,int UserID)
  {
      this.name= name;
      this.userID=UserID;
  }
  task3()
  {

  }


  //Methods to Display Details 

  void Display()
  {
      System.out.println("Here Is your Employee Detail");
      System.out.println("Name: " +name);
      System.out.println("Company Name : " + company);
      System.out.println("User Id : "+userID);
      System.out.println("Position :"+Position);
      System.out.println("Age : " +age);


  }



 public static void main (String[]args) 
 {

  Scanner sc = new Scanner(System.in);

  System.out.println("Enter name");
      String name = sc.next();
   System.out.println("Enter Company name");
     String company = sc.next();
   System.out.println("Enter UserID");
     int userID = sc.nextInt();
   System.out.println("Enter Position");
     String Position=sc.next();
   System.out.println("Enter age");
     int age=sc.nextInt();
   sc.close();

  task3 User1= new task3( name, company, userID, Position,  age);
  task3 User2= new task3( name, userID);
  task3 User3= new task3( );
    User1.Display();    //here user will display all parameter as it is passed . 
    User2.Display();    // here only two parameter will be displayed because of two parameter has been passed during object creation Rest will be Null  and 0.
    User3.Display();    // no parameter passed during object Creation  so every details will be NULL and 0.

 }
}
