
    public class thread extends Thread {
        public void run() {
            System.out.println("Hello! this code is running in a thread");
            }
        
        public static void main(String[] args) {
            thread m = new thread();
            m.start();
            System.out.println("Hello! this code is running outside of the main thread");
        }
    }

