package ApiAndAnnotation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<Integer> List1 = new ArrayList<>();
        List1.add(1);
        List1.add(2);
        List1.add(3);
        List1.add(4);
        List1.add(5);

        System.out.println(List1);

        List<Integer> List2 = Arrays.asList(2,4 ,5,7,9);
        System.out.println(List2);
        
    }
}
