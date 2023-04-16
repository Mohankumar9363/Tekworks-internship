class ListToMap {
    String id;
    String name;
    public ListToMap(String id, String name)
    {
        this.id = id;
        this.name = name;
    }
    public String getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
}
public class Main {
    public static void main(String[] args)
  {
        List<ListToMap> lt = new ArrayList<>();
        lt.add(new ListToMap("1", "vinay"));
        lt.add(new ListToMap("2", "mohan"));
        lt.add(new ListToMap("3", "chinnu"));
    Map<Integer, String> map = new HashMap<>();
    for (ListToMap li : lt) {
            map.put(li.getId(), li.getName());
        }
     System.out.println("Map  : " + map);
    }
}