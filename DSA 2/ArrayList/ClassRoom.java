package ArrayList;

import java.util.ArrayList;

public class ClassRoom {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        ArrayList<String> List2 = new ArrayList<>();
        ArrayList<Boolean> List3 = new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4); 
        System.out.println(List);

        // int element = List.get(2);
        // System.out.println(element);

        // List.remove(2);
        // System.out.println(List);

        List.set(2,10);
        System.out.println(List);
    }


}
