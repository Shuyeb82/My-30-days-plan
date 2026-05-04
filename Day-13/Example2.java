import java.util.HashMap;

public class Example2 {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Shariyar", 60);
        marks.put("Hafiz", 85);
        marks.put("Limon", 65);

        for (String name : marks.keySet()) {
            System.out.println(name + " " + marks.get(name));
        }
    }
}