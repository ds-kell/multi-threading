package synch;

public class WorkingThread extends Thread {
    private ShareMemory mShareMemory;
    private String mThreadName;

    public WorkingThread(ShareMemory sm, String threadName) {
        this.mShareMemory = sm;
        this.mThreadName = threadName;
    }

    @Override
    public void run() {
//        mShareMemory.printData1(mThreadName);
//        mShareMemory.printData2(mThreadName);
        ShareMemory.printData3(mThreadName);
    }
}