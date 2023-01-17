package day11.arrayList.task1;

import java.util.ArrayList;
import java.util.Iterator;

public class demo {
  private String name;

  public static void main(String args[]){
    ArrayList arr = new ArrayList<>();
    

    demo obj1 = new demo();
    demo obj2 = new demo();
    demo obj3 = new demo();

    obj1.name = "ABC";
    obj2.name = "XYZ";
    obj3.name = "MNO";

    arr.add(obj1);
    arr.add(obj2);
    arr.add(obj3);

    Iterator it = arr.iterator();
    while(it.hasNext()){
      demo obj = (demo) it.next();   //created obj to fetch another obj
      System.out.println(obj.name);
    }
    System.out.println(arr.size());
    arr.remove(0);
    System.out.println(arr.isEmpty());
    arr.clear();




  }
}
