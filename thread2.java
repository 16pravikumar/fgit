// Thread in single class
public class thread2 extends Thread{
    public static void main(String args[]){  
        thread2 t1=new thread2();  
        t1.start();  
        System.out.println("Main Threading...");  
     }  
     public void run(){  
        System.out.println("thread is running...");  
        }  
    }  