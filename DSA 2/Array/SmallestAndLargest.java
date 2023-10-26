package Array;

import java.util.Arrays;

public class SmallestAndLargest {
    public static int[] print(int arr[]){
        Arrays.sort(arr);
        int ans[] = {arr[0] , arr[arr.length-1]};
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,34,11,23,1,89,45};

        int[] ans = print(arr);
        System.out.println("smallest :" + arr[0]);
        System.out.println("largest :" + arr[arr.length-1]);
    }
}
