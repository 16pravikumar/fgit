// Remove the word from the sentence
import java.util.*;
public class testii{
    public static void main(String args[]){
       String str="My name is Praveen Kumar";
       String revs[]=str.split(" ");
       String original="";
       for(int i=revs.length-1;i>=0;i--)
       {
            System.out.print(revs[i]+" ");
            original=original+" "+revs[i];
       }
         System.out.print(" The Reverse:---"+original);
    }
}//Outpt
//I like to India,Canada