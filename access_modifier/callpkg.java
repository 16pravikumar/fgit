//import pkg.*;
public class callpkg{
    String a="default";
    public String b="public";
    protected String c="protected";
    private String d="private";
    public static void main(String args[]){
        callpkg o=new callpkg();
        System.out.println(o.a);
        System.out.println(o.b);
        System.out.println(o.c);
        System.out.println(o.d);
    }
}