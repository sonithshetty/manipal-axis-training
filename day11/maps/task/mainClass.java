package day11.maps.task;

import java.util.HashMap;
import java.util.Scanner;

public class mainClass {
  HashMap<Integer, student> map = new HashMap<Integer, student>();
  Scanner sc = new Scanner(System.in);
  public static void main(String args[]){
    mainClass obj = new mainClass(); //to access the details
    
    System.out.println("Student:");
    while(true){
      System.out.println("Enter your case-\n 1. Add Student\n 2. Search Student\n 3. Delete Student\n 4. Update Student ");
      int choice = obj.sc.nextInt();
      switch (choice) {
        case 1:
          obj.addStudent();          
          break;
      
        case 2:
          obj.searchStudent();
          break;

        case 3:
          obj.deleteStudent();
          break;  

        case 4:
          obj.updateStudent();
          break;

        default:
          System.out.println("Wrong Choice\n");
      }
    }

  }
  void addStudent(){
    System.out.println("Enter Student Details: ");
    System.out.println("Enter Student Roll No: ");
    int rollNo = sc.nextInt();
    System.out.println("Enter Student Name: ");
    String name = sc.next();
    System.out.println("Enter Student Place: ");
    String place = sc.next();
    System.out.println("Enter Student College: ");
    String collegeString = sc.next();
    System.out.println("Enter Student Branch: ");
    String branch = sc.next();
    System.out.println("Enter Student Semester: ");
    int sem = sc.nextInt();
    
    while(this.map.containsKey(rollNo)){
      System.out.println("Roll No is not unique ");
      System.out.println("Enter new Roll No: ");
      rollNo = sc.nextInt();
    } //check if rollno is present or not
    
    student std = new student(name, rollNo, place, collegeString, branch, sem);
    this.map.put(rollNo, std);
  }
  void searchStudent(){
    System.out.println("Enter Roll No to search the student: ");
    int rollNo = sc.nextInt();
    if(this.map.containsKey(rollNo)){
      this.map.get(rollNo).display();
    }else{
      System.out.println("Roll No is not present.");
    }
  }
  void deleteStudent(){
    System.out.println("Enter Roll No to delete: ");
    int rollNo = sc.nextInt();
    student std = this.map.remove(rollNo);
    if(std!=null){
      System.out.println("Deleted Student details: ");
      std.display();
    }else{
      System.out.println("Roll No not found in list.");
    }
  }
  void updateStudent(){
    System.out.println("Enter Student's Roll No to update their details: ");
    int rollNo = sc.nextInt();
    if(this.map.containsKey(rollNo)){
      student std = this.map.get(rollNo);
      std.update();
      this.map.replace(rollNo, std);
    }else{
      System.out.println("Roll No not found");
    }
  }

}
