package Array;

public class MoveZeroAtTheEnd {
     static void print(int arr[]){
        
        int temp[] = new int[arr.length];
        int k=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                temp[k++] = arr[i];

            }
        }
        while(k<arr.length){
            temp[k]=0;
            k++;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(temp[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,3,0,2,9,0,3,8,0,3,4,0,6};

        print(arr);
    }
}
