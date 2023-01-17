package day13.threads.task;

public class thread2 {
  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println("Thread2" + i);
    }
  }

  public void start() {
  }
}
