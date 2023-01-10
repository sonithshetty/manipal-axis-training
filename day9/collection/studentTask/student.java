package day9.collection.studentTask;

import java.util.Scanner;

public class student implements studentInterface {
  
  String name = "";
  int age = 0;
  String place= "";
  String college = "";
  int count = 0;
  Scanner sc = new Scanner(System.in);
  student arrStudent[];
  public void addStudent(){
    if(count< arrStudent.length){
      student std = new student();
      System.out.println("Enter Student Name: ");
      std.name = sc.next();
      System.out.println("Enter Student Age: ");
      std.age = sc.nextInt();
      System.out.println("Enter Student Place: ");
      std.place = sc.next();
      System.out.println("Enter Student College: ");
      std.college = sc.next();
      arrStudent[count] = std;
      count++;
    }
    else{
      System.out.println("Size is full");
    }
  }
  public void displayStudent(){
    for(int i=0; i<arrStudent.length; i++){
      
        System.out.println("Student Name: "+ arrStudent[i].name);
        System.out.println("Student Age: "+ arrStudent[i].age);
        System.out.println("Student Place: "+ arrStudent[i].place);
        System.out.println("Student College: "+ arrStudent[i].college);
      

    }
  }
}
