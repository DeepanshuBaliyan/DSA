package Array;

public class MaximumElement {
    public static int printMax(int arr[]){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {2,34,1,27,98,67};
        System.out.println(printMax(arr));

    }
}
