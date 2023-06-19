package javaProStanislav.lesson26_19062023.concurrent.semafore;

import java.util.concurrent.Semaphore;

public class Store {
    private int product = 0;
    private Semaphore producerSemaphore = new Semaphore(1);
    private Semaphore consumerSemaphore = new Semaphore(0);

    public void get(){
        try {
            consumerSemaphore.acquire();
            product--;
            System.out.println("Покупатель купил 1 товар");
            System.out.println("Товаров на складе : " + product);

            if (product < 1){
                producerSemaphore.release();
            }
            Thread.sleep(1000);
        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }

    public void put(){
        try {
            producerSemaphore.acquire();
            product++;
            System.out.println("Производитель добавил 1 товар");
            System.out.println("Товаров на складе : " + product);
            if(product > 0){
                consumerSemaphore.release();
            }
                Thread.sleep(1000);

        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }

}
