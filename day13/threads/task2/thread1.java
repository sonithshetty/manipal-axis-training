package day13.threads.task2;

public class thread1 {
  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println("Thread1 " + i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        // TODO: handle exception
        System.out.println(e.getMessage());
      }
    }
  }

}
