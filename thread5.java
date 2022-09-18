// Using the Thread Class: Thread(String Name)
public class thread5 {
    public static int num=0;
    public static void main(String args[]){  
       // thread4 t1=new thread4(); 
        Thread obj=new Thread("Hi i am praveen kumar"); 
        obj.start();  
        String str=obj.getName();
        System.out.println(str);  
    }
}