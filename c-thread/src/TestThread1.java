public class TestThread1 extends Thread {

    private String threadName;

    public TestThread1(String threadName) {
        super();
        this.threadName = threadName;
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {

        for(int i = 0; i < 10; i++) {
            System.out.println(this.getThreadName() + " " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        TestThread1 testThread1 = new TestThread1("a");
        TestThread1 testThread12 = new TestThread1("b");
        testThread1.start();
        testThread12.start();
    }
}
