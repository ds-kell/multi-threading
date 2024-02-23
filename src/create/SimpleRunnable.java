package create;

public class SimpleRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(System.currentTimeMillis());
    }

    public static void main(String[] args) {
        SimpleRunnable runnable = new SimpleRunnable();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        Thread thread4 = new Thread(runnable);
        Thread thread5 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
