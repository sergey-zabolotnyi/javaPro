package summaryJavaIlia.lesson13_16062023;

public class StopThreadExample {
    static int counter = 0;
    static volatile boolean shouldRun = true;

    public static void main(String[] args) {
        Thread thread = new Thread(new Task());
        thread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //thread.interrupt();
        shouldRun = false;
    }
    static class Task implements Runnable{

        @Override
        public void run() {
            while (shouldRun){
                counter++;
                if(counter % 1_000 == 0){
                    System.out.println(counter);
                }
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    System.out.println("interrupted");
//                    e.printStackTrace();
//                    //break;
//                }
            }
        }
    }
}
// 604551000
// 994116000
