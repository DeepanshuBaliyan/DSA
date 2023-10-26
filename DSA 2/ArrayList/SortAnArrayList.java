package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortAnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>List = new ArrayList<>();
        List.add(2);
        List.add(5);
        List.add(9);
        List.add(3);
        List.add(6);

        System.out.println(List);
        Collections.sort(List);
        System.out.println(List);


        Collections.sort(List , Collections.reverseOrder());
        System.out.println(List);

    }
}
