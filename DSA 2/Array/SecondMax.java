package Array;

public class SecondMax {
    public static int printMax(int arr[]){
        int max =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max =arr[i];
            }
        }
        return max;
    }
    public static int printSecondMax(int arr[]){
        int large = printMax(arr);
        int SecondLargest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=large && arr[i]>SecondLargest){
                SecondLargest=arr[i];
            }
        }
        return SecondLargest;
    }
    public static void main(String[] args) {
        int arr[] = {1,23,3,56,89,27};
        System.out.println(printSecondMax(arr));

    }
}
