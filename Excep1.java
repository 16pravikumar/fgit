public class Excep1 {
    public static void main(String[] args) {
        int[] arr=new int[5];
      try {
        System.out.println(arr[5]);
      } catch (Exception e) {
        System.out.println(e);
      }
    }
  }

  // Output
  //java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5