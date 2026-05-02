import java.util.TreeMap;

public class Example2 {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Banana", 3);
        map.put("Apple", 1);
        map.put("Mango", 2);

        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}