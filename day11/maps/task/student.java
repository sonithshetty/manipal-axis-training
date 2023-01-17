package day11.maps.task;

import java.util.Scanner;

public class student {
  String name;
  int rollNo;
  String place;
  String college;
  String branch;
  int sem;

  public student(String name, int rollNo, String place, String college, String branch, int sem) {
    this.name = name;
    this.rollNo = rollNo;
    this.place = place;
    this.college = college;
    this.branch = branch;
    this.sem = sem;
  }
  public void display(){
    System.out.println("Student Name: " + this.name);
    System.out.println("Student Roll No: " + this.rollNo);
    System.out.println("Student Place: " + this.place);
    System.out.println("Student College: " + this.college);
    System.out.println("Student Branch: " + this.branch);
    System.out.println("Student Semester: " + this.sem);
  }
  public void update(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter student branch to update:");
    this.branch = sc.next();
  }
}
