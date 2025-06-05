class MyRunnable implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " hii");
    }
}

public class prob15 {
    public static void main(String[] args) {
        MyRunnable obj = new MyRunnable();
        Thread t1 = new Thread();
        t1.start();
        System.out.println("Hello");
    }
}
