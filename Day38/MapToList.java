import java.util.*;
class MapToList
  {
public static void main(String[] args)
    {
      HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1,"abc");
        hm.put(2,"bcd");
        hm.put(3,"def");
        hm.put(4,"fgh");
        MapValuesToList obj = new MapValuesToList(hm);
        List<Integer> maptolist = obj.maptolist(hm);
        for (Integer l : maptolist) {
            System.out.println(l);
        }
    }
  }