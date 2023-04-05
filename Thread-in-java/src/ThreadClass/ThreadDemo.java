package ThreadClass;

import javax.swing.plaf.TableHeaderUI;

class A extends Thread{
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
    }
}
class B extends Thread{
    public void run() {
        for (int i = 0; i < 4; i++ ) {

            System.out.println("hello");

            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

//        obj1.show();
        obj1.start();
        try{
            Thread.sleep(10);
        } catch (Exception e) {}
        obj2.start();
    }
}
