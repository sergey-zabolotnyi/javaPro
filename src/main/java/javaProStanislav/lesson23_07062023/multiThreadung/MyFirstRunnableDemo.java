package javaProStanislav.lesson23_07062023.multiThreadung;

public class MyFirstRunnableDemo {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new MyRunnable());
            thread.start();
        }
    }
}
