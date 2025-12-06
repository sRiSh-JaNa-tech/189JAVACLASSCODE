package Threads;
import java.lang.*;
// class MyThread extends Thread{
//     public void run(){
//         for(int i = 1;i <= 5;i++){
//             System.out.println(i);
//             try{
//                 Thread.sleep(1000);
//             }catch(InterruptedException e){
//                 System.out.println(e);
//             }
//         }
//     }
// }

// class MyThread01 implements Runnable{
//     public void run(){
//         for(int i = 1;i <= 5;i++){
//             System.out.println(i);
//             try{
//                 Thread.sleep(1000);
//             }catch(InterruptedException e){
//                 System.out.println(e);
//             }
//         }
//     }
// }

// class HelloThread extends Thread {
//     public void run() {
//         for (int i = 1; i <= 5; i++) {
//             System.out.println("Hello");
//             try { Thread.sleep(300); } 
//             catch (InterruptedException e) {}
//         }
//     }
// }

// class JavaThread extends Thread {
//     public void run() {
//         for (int i = 1; i <= 5; i++) {
//             System.out.println("Java");
//             try { Thread.sleep(300); } 
//             catch (InterruptedException e) {}
//         }
//     }
// }

// class ThreadingTh extends Thread {
//     public void run() {
//         for (int i = 1; i <= 5; i++) {
//             System.out.println("Threading");
//             try { Thread.sleep(300); } 
//             catch (InterruptedException e) {}
//         }
//     }
// }

// class Low extends Thread {
//     public void run() {
//         for (int i = 1; i <= 10; i++) {
//             System.out.println("Low");
//         }
//     }
// }

// class Medium extends Thread {
//     public void run() {
//         for (int i = 1; i <= 10; i++) {
//             System.out.println("Medium");
//         }
//     }
// }

// class High extends Thread {
//     public void run() {
//         for (int i = 1; i <= 10; i++) {
//             System.out.println("High");
//         }
//     }
// }

class NumberPrinter{
    int num = 1;
    int limit = 10;
    public synchronized void printOdd(){
        while (num < limit) {
            try {
                while (num % 2 == 0) {    // if even → wait
                    wait();
                }
                System.out.println("Odd: " + num);
                num++;
                notify();   // wake even thread
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public synchronized void printEven(){
        while(num <= limit){
            try {
                while (num % 2 == 1) {    // if odd → wait
                    wait();
                }
                System.out.println("Even: " + num);
                num++;
                notify();   // wake odd thread
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Threads_01 {
    public static void main(String[] args) {
        NumberPrinter np = new NumberPrinter();
        new Thread(()->{try{
            np.printOdd();
        }catch(Exception e){}}).start();
        new Thread(()->{
            try{
                np.printEven();
            }catch(Exception e){}
        }).start();
    }
}
