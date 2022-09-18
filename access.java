//clone object through the constructor and clone()
class A{
  int x=8;
}
class access extends A{
  static int p = 10;    
  public static void main (String args[])  
  {  
    access t = new access();  
    System.out.println(t.p); 
  }  
}