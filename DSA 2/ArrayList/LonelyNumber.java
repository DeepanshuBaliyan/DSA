package ArrayList;

import java.util.ArrayList;
// import java.util.Collection;
import java.util.Collections;

public class LonelyNumber {
    public ArrayList<Integer>  Lonely(ArrayList<Integer> nums){
        Collections.sort(nums);

        ArrayList<Integer> List = new ArrayList<>();
        for(int i=1;i<nums.size();i++){
            if(nums.get(i-1) +1 <nums.get(i) && nums.get(i)+1 <nums.get(i+1)){
                List.add(nums.get(i));
            }
        }

        if(nums.size()==1){
            List.add(nums.get(0));
        }

        if(nums.size()>1){
            if(nums.get(0) +1 <nums.get(1)){
                List.add(nums.get(0));
            }
            if(nums.get(nums.size()-2)+1 <  nums.get(nums.size()-1)){
                List.add(nums.get(nums.size()-1));
            }
        }
        return List;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(6);
        nums.add(5);
        nums.add(8);

        System.out.println(Lonely);

    }
}
