public class TestThread2 extends Thread {

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        TestThread2 thread1 = new TestThread2();
        thread1.setName("Thread1");

        TestThread2 thread2 = new TestThread2();
        thread2.setName("Thread2");

        TestThread2 thread3 = new TestThread2();
        thread3.setName("Thread3");

        thread1.start();
        try {
            thread1.join(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
        thread3.start();
    }
}
