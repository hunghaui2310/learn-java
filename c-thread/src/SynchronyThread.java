public class SynchronyThread implements Runnable {

    public int tong;

    public SynchronyThread() {
        this.tong = 1000;
    }

    public synchronized void rutTien() throws InterruptedException {
        if (tong > 0) {
            Thread.sleep(1000);
            tong = tong - 1000;
            System.out.println("Tong = " + tong);
        } else {
            System.out.println("Khong con tien");
        }
    }

    @Override
    public void run() {
        try {
            rutTien();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SynchronyThread synchronyThread = new SynchronyThread();

        Thread thread = new Thread(synchronyThread);
        Thread thread1 = new Thread(synchronyThread);

        thread.start();
        thread1.start();
    }
}
