package Array;

public class SearchElement {
    public static void main(String[] args) {
        int arr[] ={1,5,12,6,4,20,18};

        int x = 18;

        int ans =-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                ans = i;
            }

        }
        System.out.println(ans);
    }
}
