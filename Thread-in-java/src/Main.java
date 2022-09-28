public class Main implements Runnable {
    public void run() {
        System.out.println("this code is running in thread");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("this code is outside from the thread");
    }

}