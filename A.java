public class A
{
    void xyz(){
        System.out.println("1");
    }
}
 class B extends A{
    void xyz(){
        System.out.println("2");
    }
    public void main(String args[]){
        B obj=new B();
        obj.xyz();
    }
}
//output- just for check version control