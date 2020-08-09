package com.randeeprajputr;
import org.omg.PortableServer.THREAD_POLICY_ID;

import javax.jnlp.PrintService;
import java.util.concurrent.*;


public class Main {

    public static void main(String[] args) {
	Runnable printFirst=new PrintChar('a',100);
	Runnable printSecond=new PrintNum(2,100);
	Thread thread1=new Thread(printFirst);
	Thread thread2=new Thread(printSecond);
	thread1.start();
	thread2.start();
    }

}
class PrintNum extends Thread{
    private int num;
    private int times;

    public void run(){
        for(int i=0;i<times;i++){
            System.out.print(num);
        }

    }
    public PrintNum(int num1 , int times1){
        num=num1;
        times=times1;
    }
}
class PrintChar implements Runnable{
    private char letter;
    private int times;

    public void run(){
        for(int i=0;i<times;i++){
            System.out.print(letter);
        }
    }
    public PrintChar(char letter1,int times1){
        letter=letter1;
        times=times1;
    }
}
