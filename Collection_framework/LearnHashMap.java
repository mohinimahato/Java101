import java.util.HashMap;
import java.util.Map;

public class LearnHashMap {
    public static void main(String[] args) {
        Map<Integer, String> numbers = new HashMap<>();
        // put -> can be overwriten
        numbers.put(1, "One");
        numbers.put(2, "");
        numbers.put(3, "Three");
        numbers.put(4, "Four");
        numbers.put(5, "Five");
        // putIfAbsent-> Can't be overwritten
        numbers.putIfAbsent(2, "Twenty");
        System.out.println(numbers);

        // Iterate
        for (Map.Entry<Integer, String> e : numbers.entrySet()) {
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        for (Integer key : numbers.keySet()) {
            System.out.println(key);
        }
        for (String value : numbers.values()) {
            System.out.println(value);
        }

        System.out.println(numbers.containsKey(4));
        System.out.println(numbers.containsValue(""));
        System.out.println(numbers.isEmpty());
        numbers.clear();
        System.out.println(numbers);

    }
}
