public class Main {

    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        Thread t = new Thread(myThread1);

        MyThread2 myThread2 = new MyThread2();

        t.start();
        myThread2.start();
    }
}
