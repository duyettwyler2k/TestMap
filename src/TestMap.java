import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hashmap=new HashMap<>();
        hashmap.put("Duyet",20);
        hashmap.put("long",30);
        hashmap.put("thanh",30);
        System.out.println(hashmap+"\n");
        //tree map
        Map<String,Integer> treeMap=new TreeMap<>(hashmap);
        System.out.println(treeMap+"\n");
        //linkedlistmap
        Map<String,Integer> linkedhashmap=new LinkedHashMap<>(16,0.75f,true);
        linkedhashmap.put("a",1);
        linkedhashmap.put("b",2);
        linkedhashmap.put("c",3);
        linkedhashmap.put("d",4);
        System.out.println(linkedhashmap.get("c"));
    }
}
