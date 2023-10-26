package Hashing;
import java.util.HashSet;

import java.util.Iterator;

public class Hash2 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        System.out.println(set);

        System.out.println("size of set is :" + set.size());

        if(set.contains(1)){
            System.out.println("Persent in a hashSet");
        }
        else{
            System.out.println("Not Persent in a HashSet");
        }

        set.remove(3);
        System.out.println(set);


        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
