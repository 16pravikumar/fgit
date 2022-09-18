import java.io.*;
interface p1{
   public void show();
}
 public class lambda1{
    /*public void show(){
        System.out.println("Praeen");
    }*/
     public static void main(String[] args) {
      //  lambda1 obj=new lambda1();
       // obj.show();
       p1 obj=()->System.out.println("praveen");// Here we are creating the reference of interface
       obj.show();
    }
}

//output
//Praveen