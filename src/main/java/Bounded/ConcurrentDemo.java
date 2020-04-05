package Bounded;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

public class ConcurrentDemo extends Thread{
    static ArrayList l = new ArrayList();
    CountDownLatch countDownLatch = new CountDownLatch(1);


    @Override
    public void run(){
        try{
            countDownLatch.await();
            l.add("D");
            Thread.sleep(2000);
            countDownLatch.countDown();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws InterruptedException{
        l.add("A");
        l.add("B");
        l.add("c");

        // We create a child thread that is
        // going to modify ArrayList l.
        ConcurrentDemo t = new ConcurrentDemo();
        t.start();

        // Now we iterate through the ArrayList
        // and get exception.
        Iterator itr = l.iterator();
        while (itr.hasNext()) {
            String s = (String)itr.next();
            System.out.println(s);
            Thread.sleep(6000);
        }
        System.out.println(l);
    }
}
