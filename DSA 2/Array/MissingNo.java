package Array;

public class MissingNo {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6,7,8,9};

        int n = arr.length+1;

        int totalsum = (n*(n+1))/2;
        int sum =0;

        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
        }

        int missingNumber = totalsum-sum;
        System.out.println(missingNumber);
    }
}
