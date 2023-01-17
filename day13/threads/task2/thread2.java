package day13.threads.task2;

public class thread2 {
  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println("Thread2 " + i);
      try {
        Thread.sleep(100000);
      } catch (InterruptedException e) {
        // TODO: handle exception
        System.out.println(e.getMessage());
      }
    }
  }
}
