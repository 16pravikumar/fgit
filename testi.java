class Super {
    public int index = 1;
    }
    
    class App extends Super {
    
     public App(int index) {
    index = index;
    }
    
     public static void main(String args[]) {
    App myApp = new App(10);
    System.out.println(myApp.index);
    }
    }
    OUTPUT : 1
    ====================================================
    class TestApp {
    protected int x, y;
    }
    
    class Main {
    public static void main(String args[]) {
    TestApp app = new TestApp();
    System.out.println(app.x + " " + app.y);
    }
    }
    OUTPUT : 0  0
    ====================================================
    class TestApp {
    static int index = 0;
    public static void main(String args[]) {
    System.out.println(test());
    }
    int test() {
    int index = 1;
    return index;
    }
    }
    OUTPUT :  1
    ====================================================


    