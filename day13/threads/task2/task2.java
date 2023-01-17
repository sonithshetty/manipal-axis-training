package day13.threads.task2;

public class task2 {
  public static void main(String args[]) {
    thread1 t1 = new thread1();
    thread2 t2 = new thread2();
    thread3 t3 = new thread3();

    // t1.setPriority(5);
    // t2.setPriority(10);
    t1.run();
    t2.run();
    t3.run();
  }
}
