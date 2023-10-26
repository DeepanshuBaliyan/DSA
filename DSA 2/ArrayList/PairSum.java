package ArrayList;

import java.util.ArrayList;

public class PairSum {
    public static boolean PairSum1(ArrayList<Integer> List , int target){
        // for(int i=0;i<List.size();i++){
        //     for(int j=i+1 ; j<List.size();j++){
        //         if(List.get(i)+List.get(j)==target){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        int lp =0;
        int rp =List.size()-1;
        while(lp!=rp){
            if(List.get(lp)+List.get(rp)==target){
                return true;
            }
            if(List.get(lp)+List.get(rp)<target){
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);

        int target =5;

        System.out.println(PairSum1(List, target));
    }
}
