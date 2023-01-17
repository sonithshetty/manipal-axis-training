package day13.threads.task;

public class task1 {
  public static void main(String args[]) {
    thread1 t1 = new thread1();
    thread2 t2 = new thread2();
    thread3 t3 = new thread3();
    thread4 t4 = new thread4();

    // t1.setPriority(5);
    // t2.setPriority(10);
    t1.start();
    t2.start();
    t3.start();
    t4.start();
  }
}
