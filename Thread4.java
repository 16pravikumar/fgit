// Thread in Runnable interface
public class thread4 implements Runnable{
    public static int num=0;
    public static void main(String args[]){  
        thread4 t1=new thread4(); 
        Thread obj=new Thread(t1); 
        obj.start();  
        System.out.println(num);
        num++;
        System.out.println(num);  
     }  
     public void run(){  
        num++; 
        }  
    }  