package day9.collection.studentTask;

import java.io.ObjectInputFilter.Status;

public class mainStudent {
  public static void main(String args[]){
    student stdObj = new student();
    System.out.println("Enter size of array: ");
    int n = stdObj.sc.nextInt();
    stdObj.arrStudent = new student[n];
    while(true){
      System.out.println("Enter case\n 1.Add Student\n 2.Display\n 3.Exit");
      int choice = stdObj.sc.nextInt();
      switch(choice){
        case 1: stdObj.addStudent();
        break;
        case 2: stdObj.displayStudent();
        break;
        case 3: 
          break;
      }
    }
    
  }
}
