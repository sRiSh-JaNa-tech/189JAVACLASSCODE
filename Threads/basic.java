package Threads;
import java.lang.*;

class Multi extends Thread{
    public void run(){
        for(int i = 0;i < 5;i++){
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}
public class basic {
    public static void main(String args[]){
        Multi t1 = new Multi();
        Multi t2 = new Multi();
        t1.start(); // invokes the runnable interface of a Thread 
        t2.start();
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t1.getName()); //names are priority wise
        System.out.println(t2.getName());
        t1.setName("CSA WebTech");
        System.out.println(t1.getName());
    }
}
