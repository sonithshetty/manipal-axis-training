package day13.threads.task2;

public class thread3 {
  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println("Thread3 " + i);
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        // TODO: handle exception
        System.out.println(e.getMessage());
      }
    }
  }
}
