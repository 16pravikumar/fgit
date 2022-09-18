interface printable{
    void print();
    }
    
    class interfm implements printable{
    public void print(){System.out.println("Hello");}
    
    public static void main(String args[]){
        interfm obj = new interfm();
    obj.print();
     }
    }
    