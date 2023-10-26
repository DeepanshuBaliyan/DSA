package Array;

public class StrictlyGreaterElement {
    public static int print(int arr[] , int x){
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,9,12,45,15};

        int x =40;
        System.out.println(print(arr, x));
    }
}
