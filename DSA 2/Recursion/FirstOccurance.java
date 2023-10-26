public class FirstOccurance {

    public static int Occurance(int arr[] , int key , int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }

        return Occurance(arr, key, i+1);
    } 
    public static void main(String[] args) {
        int arr[] = {2,8,1,6,9,5,3,7,8,3};
        int key =8;

        System.out.println(Occurance(arr, key, 0));
    }
}
