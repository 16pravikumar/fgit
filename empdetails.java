import java.util.*;
enum AB{
    X,
    Y,
    Z
}
public class empdetails{
    public static void main(String args[]){
        //Arraylist
        //Sting[String][String] emp={id->1,name->'praveen'};
        //String[][] emp={{"a","b","c"},{"d","e","f","g"}};
        HashMap<String,String> emp=new HashMap<String,String>();
        emp.put("name","praveen");
        emp.put("name1","Sarbh");
        System.out.println(emp.get("name1"));
        AB va=AB.Z;
        System.out.println(va);
    }
}