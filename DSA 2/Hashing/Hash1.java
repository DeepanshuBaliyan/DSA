package Hashing;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hash1 {
    public static void main(String[] args) {
        // Country(Key) , Population (Value)

        HashMap<String , Integer> map = new HashMap<>();
        map.put("India" , 120);
        map.put("US" , 30);
        map.put("China" , 110);
        System.out.println(map); 
        map.put("India" , 180);
        System.out.println(map);

        if(map.containsKey("India")){
            System.out.println("Key is persent in the map");
        }
        else{
            System.out.println("Key is not persent in the map");
        }

        System.out.println(map.get("China"));
        System.out.println(map.get("Iraq"));


        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys = map.keySet();
        for(String key : keys);

        map.remove("US");
        System.out.println(map);
    }
}
