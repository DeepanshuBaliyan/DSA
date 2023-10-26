import java.util.*;



public class FactorialFind {

    public static int factorialFinding(int n){
        int result=0;
        if(n==0 || n==1){
            return 1;
        }
        else{
            result = n*factorialFinding(n-1);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        int result = factorialFinding(n);
        System.out.println("Factorial of a given number is " + result);

        sc.close();
    }
}
