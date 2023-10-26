package Array;

public class CountEvenElement {
    public static int print(int arr[]){
        int n = arr.length;

        int temp =0;

        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                temp++;
            }
           
        }
         return temp;
      
    }
    public static void main(String[] args) {
        int arr[] = {1,3,2,4,5,76,55,8};

        int result =print(arr);
        System.out.println(result);

    }
}
