/* In this program first throw keyword is throwing the exception 
 the throws keywords accept the excption by the caller after that pass the 
 exception to try catch method.Then finally the exception handle. */
public class Excep2 {
    void solve(int a,int b) throws ArithmeticException
    {
        if(b==0)
        {
            throw new ArithmeticException();
        }
        System.out.println(a/b);
    }
    public static void main(String[] args){
       Excep2 obj=new Excep2();
       try {
        obj.solve(10,0);
       } catch (Exception e) {
        //TODO: handle exception
       }
       
      System.out.println("normal flow");
    }
  }

  // Output
  //normal flow