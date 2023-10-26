package ArrayList;

import java.util.ArrayList;

public class MonotonicArrayList {

    public static boolean monotonicIncrease(ArrayList<Integer> List){
        for(int i=0;i<List.size();i++){
            for(int j=i+1;j<List.size();j++){
                if(List.get(i)<=List.get(j)){
                    return true;
                }
            }
        }
        return false;
    }

    
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(2);
        List.add(3);

        System.out.println(monotonicIncrease(List));


    }
}
