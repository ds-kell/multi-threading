package sync_nonsync;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Integer> arrayList = new ArrayList<>();
        Vector<Integer> vector = new Vector<>();

        Thread thread1 = new Thread(new AddTask(vector));
        Thread thread2 = new Thread(new AddTask(vector));

        thread1.start();
        thread2.start();
    }

    static class AddTask implements Runnable {
        private final Collection<Integer> list;

        public AddTask(ArrayList<Integer> list) {
            this.list = list;
        }
        public AddTask(Vector<Integer> list) {
            this.list = list;
        }


        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                list.add(i);
                System.out.println(Thread.currentThread().getName() + " added: " + i);
                System.out.println(Thread.currentThread().getName() + " List content: " + list);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
