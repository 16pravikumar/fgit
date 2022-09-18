class mythread extends Thread{  
    public void run(){  
    System.out.println("thread is running...");  
    }  
}
public class thread1{
    public static void main(String args[]){  
        mythread t1=new mythread();  
        t1.start();  
        System.out.println("Main Threading...");  
     }  
    }  