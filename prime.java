// 1 2 3 5 7 11 13.....
import java.util.*;
public class prime{
    public static void main(String args[]){
       for(int i=2;i<=10;i++){
        int count=1;
        for(int j=2;j<10;j++){
            if(i%j==0)
            count++;
       } if(count==2)
       System.out.println(i);
    }
    }
}
//output 2 3 