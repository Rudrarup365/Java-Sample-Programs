package testing;
public class ThreadTest extends Thread {
  public static void main(String[] args) {
	  ThreadTest1 a1 = new ThreadTest1();
	  ThreadTest2 a2 = new ThreadTest2();
	  ThreadTest3 a3 = new ThreadTest3();

    a1.start();
    a2.start();
    a3.start();
    System.out.println("This code is outside of the thread");
  }
  public void run() {
    System.out.println("This code is running in a thread");
  }
}

