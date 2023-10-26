import java.util.*;

public class PrintNumberFrom1to10 {
    public static void printer(int n){
      
      if (n == 0) return;

    //   System.out.print(n + " ");
      printer(n - 1);
      System.out.print(n + " ");
        
      
      
        
      
       
    }
    public static void main(String[] args) {
       

        int n = 10;
        printer(n);


        

    }
}
