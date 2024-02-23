package synch;

public class ShareMemory {

    // Synchronized, điều này có nghĩa là chỉ một luồng có thể truy cập vào phương thức này tại một thời điểm
    public synchronized void printData1(String threadName) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + ": " + i);
        }
    }

    public void printData2(String threadName) {
        // Do Something before synchronized ...
        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(threadName + ": " + i);
            }
        }
    }

    public static synchronized void printData3(String threadName) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + ": " + i);
        }
    }
    /*Synchronized method: khóa toàn bộ phương thức của một instance của object (this).
    Synchronized block: khóa một phần của code trong một phương thức.
    Synchronized static method: khóa toàn bộ phương thức của một lớp (class).*/
}