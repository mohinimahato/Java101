import java.util.HashSet;
import java.util.Set;

public class LearnHashSet {
    public static void main(String[] args) {
        // Hashset, treeSet, LinkedHashset -> has the property where these doesn't have
        // any duplicate elements

        Set<Integer> set = new HashSet<>();
        set.add(32);
        set.add(2);
        set.add(3);
        set.add(44);
        set.add(10);
        System.out.println(set);
        // output -> [32, 2, 3, 10, 44]. it may get different everytime because in set
        // there's no order defined
        // Internally set uses hashing
        set.remove(44); // to remove any particlar element form the set
        System.out.println(set);
        System.out.println(set.contains(2)); // to check if an element is present in the set or not
        System.out.println(set.isEmpty()); // to check whether the set is empty or not | return true or false
        System.out.println(set.size()); // tell us the size of set
        set.clear(); // empty the set
        System.out.println(set);
    }
}
