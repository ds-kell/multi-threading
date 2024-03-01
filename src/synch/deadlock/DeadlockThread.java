package synch.deadlock;

public class DeadlockThread  implements Runnable{

    private final Object object1;

    private final Object object2;

    public DeadlockThread(Object object1, Object object2){
        this.object1 = object1;
        this.object2 = object2;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " acquiring lock on " + object1);
        synchronized (object1) {
            System.out.println(name + " acquired lock on " + object1);
            work();

            System.out.println(name + " acquiring lock on " + object2);
            synchronized (object2) {//Avoid nested lock
                System.out.println(name + " acquired lock on " + object2);
                work();
            }

            System.out.println(name + " released lock on " + object2);
        }

        System.out.println(name + " released lock on " + object1);
        System.out.println(name + " finished execution.");
    }

    private void work() {
        try {
            System.out.println(System.currentTimeMillis());
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
