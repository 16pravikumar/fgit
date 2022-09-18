// Thread in Runnable interface
public class thread3 implements Runnable{
    public static void main(String args[]){  
        thread3 t1=new thread3(); 
        Thread obj=new Thread(t1); 
        obj.start();  
        System.out.println("Main Threading...");  
     }  
     public void run(){  
        System.out.println("thread is running...");  
        }  
    }  