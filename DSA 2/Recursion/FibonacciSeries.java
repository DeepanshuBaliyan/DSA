import java.util.*;

public class FibonacciSeries {
    public static int fibonacci(int n){
        int result =0;
        if(n<=1){
            return n;
        }
        else{
            result= fibonacci(n-1)+ fibonacci(n-2);    
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = fibonacci(n);
        System.out.println("The Final output is:"+result);

        sc.close();
    }
}
