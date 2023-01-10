package day6;

import java.util.Scanner;

public class task1
{   
    public String name,company,addres;
    private int userID;
    private String Position;
    protected  int age;

     void  CreateUser()
    {  
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name");
            name = sc.next();
         System.out.println("Enter Company name");
            company = sc.next();
         System.out.println("Enter UserID");
            userID = sc.nextInt();
         System.out.println("Enter Position");
            Position=sc.next();
         System.out.println("Enter age");
            age=sc.nextInt();
      sc.close();
        
         
    }
    void Display()
    {
        System.out.println("Here Is your Employee Detail");
        System.out.println("Name: " +name);
        System.out.println("company name : " + company);
        System.out.println("User Id : "+userID);
        System.out.println("Position :"+Position);
        System.out.println("Age : " +age);


    }



   public static void main (String[]args) 
   {
     
    task1 User= new task1();
      User.CreateUser();
      User.Display();

   }
}