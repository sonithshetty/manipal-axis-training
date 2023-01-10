package day6;
import java.util.Scanner;


public class task2 {
  public String name,company;
    private int userID;
    private String Position;
    protected  int age;

    public task2(String name, String company, int userID, String position, int age) {
        this.name = name;
        this.company = company;
        this.userID = userID;
        Position = position;
        this.age = age;
    }



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
       int UserID = sc.nextInt();
     System.out.println("Enter Position");
       String Position=sc.next();
     System.out.println("Enter age");
       int age=sc.nextInt();
     
    task2 User= new task2( name, company, UserID, Position,  age);
      User.Display();
      sc.close();

   }
}
