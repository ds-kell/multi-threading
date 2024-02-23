package create;

public class SimpleThread1 extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " time: " + System.currentTimeMillis());
    }

    public static void main(String[] args) {
        SimpleThread1 thread1 = new SimpleThread1();
        SimpleThread1 thread2 = new SimpleThread1();
        SimpleThread1 thread3 = new SimpleThread1();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
