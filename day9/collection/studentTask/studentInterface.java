package day9.collection.studentTask;

import java.util.Scanner;

public interface studentInterface {
  String name = " ";
  int age = 0;
  String place= "";
  String college = "";
  int count = 0;
  Scanner sc = new Scanner(System.in);

  void addStudent();
  void displayStudent();
}
