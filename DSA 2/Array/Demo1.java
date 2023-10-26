package Array;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int a = sc.nextInt();

        int b = a*a;

        double areaOfCircle = 3.1468*b;
        System.out.println(areaOfCircle);

    }
}
