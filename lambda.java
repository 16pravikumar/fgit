import java.util.*;
public class lambda{
     public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("Sciense");
        list.add("Math");
        list.forEach((n)->{
            System.out.println(n);
        });
    }
}

//output
//Sciense, math