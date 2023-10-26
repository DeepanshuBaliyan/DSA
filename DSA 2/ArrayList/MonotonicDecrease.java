package ArrayList;

import java.util.ArrayList;

public class MonotonicDecrease {
    public static boolean print(ArrayList<Integer> List){
        for(int i=0;i<List.size();i++){
            for(int j=i+1;j<List.size();j++){
                if(List.get(i)>List.get(j)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(6);
        List.add(5);
        List.add(4);
        List.add(4);

        System.out.println(print(List));
    }
}
