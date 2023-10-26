public class LastOccurance {

    public static int Last(int arr[] , int key , int i){
        if(i==arr.length){
            return -1;
        }
         
        int isFound = Last(arr, key, i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
          return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,6,1,7,3,9,4,5,3};
        int key =3;

        System.out.println(Last(arr, key, 0));
    }
}
