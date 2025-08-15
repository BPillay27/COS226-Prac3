public class Main {
    public static void main(String[] args) throws InterruptedException {
        Straw straw = new Straw("V2");

        Thread t0 = new Boba(straw, 0);
        Thread t1 = new Boba(straw, 1);
        Thread t2 = new Boba(straw, 2);

        t0.start();
        t1.start();
        t2.start();

        t0.join();
        t1.join();
        t2.join();

        System.out.println("All boba sips completed.");
    }
}
