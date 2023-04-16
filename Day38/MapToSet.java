import java.util.*;
public class MapToSet {
    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<>(); 
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        map.put(5, "e");
        HashSet<String> set = new HashSet(map.values());
        System.out.println("Converted Map values to Set : " + set);
    }
}