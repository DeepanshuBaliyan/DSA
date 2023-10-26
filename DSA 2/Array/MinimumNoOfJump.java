package Array;

public class MinimumNoOfJump {
    public static int print(int arr[]){
        int n = arr.length;
        int max=0;
        int maxrange=0;
        int jump =0;
        for(int i=0; i<n; i++){
            max = Math.max(max, i+arr[i]);
            if(i == maxrange){
                maxrange= max;
                jump++;
                
            }
            if(maxrange >= n-1){
                return jump;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,8,2,6,7,6,8,9};
        System.out.println(print(arr));
    }
}
