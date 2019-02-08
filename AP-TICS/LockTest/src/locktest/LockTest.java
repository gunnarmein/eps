package locktest;

public class LockTest {

    static Lock lock = new Lock();

    public static void main(String[] args) {
        // crate some shared state
        SharedState s = new SharedState();

        long start = System.currentTimeMillis();

        // create and start all threads
        int count = 4;
        Thread[] threads = new Thread[count];
        for (int i = 0; i < count; i++) {
            threads[i] = new Thread(() -> work(s));
            threads[i].start();
        }

        // wait for all threads to complete ("join" the current thread
        // this could be interrupted with an exception, hence the try-catch block
        for (int i = 0; i < count; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException ex) {
            }
        }

        System.out.println("shared state is " + (s.isValid() ? "ok" : "corrupt"));
        System.out.println("Time elapsed: " + (System.currentTimeMillis() - start) + "ms");
    }

    static void work(SharedState s) {
        for (int i = 0; i < 1000; i++) {
            lock.acquire();

            s.doWork(i);

            lock.release();
        }
    }

}
