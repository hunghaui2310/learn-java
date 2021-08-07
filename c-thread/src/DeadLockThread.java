public class DeadLockThread implements Runnable {

    public synchronized void test1() {
        System.out.println("Test 1");
        test2();
    }

    public synchronized void test2() {
        System.out.println("Test 2");
        test1();
    }

    @Override
    public void run() {
        test1();
    }

    public static void main(String[] args) {
        DeadLockThread deadLockThread = new DeadLockThread();
        Thread d1 = new Thread(deadLockThread);
        Thread d2 = new Thread(deadLockThread);

        d1.start();
        d2.start();
    }
}
