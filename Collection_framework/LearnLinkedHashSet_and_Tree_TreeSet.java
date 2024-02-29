import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnLinkedHashSet_and_Tree_TreeSet {
    public static void main(String[] args) {
        // now this will not just implement set property but also linkedlist property
        Set<Integer> set = new LinkedHashSet<>();
        set.add(32);
        set.add(2);
        set.add(3);
        set.add(44);
        set.add(10);
        System.out.println(set);
        // output -> [32, 2, 3, 44, 10]. Order will be maintained here

        // Internally set uses hashing
        set.remove(44); // to remove any particlar element form the set
        System.out.println(set);
        System.out.println(set.contains(2)); // to check if an element is present in the set or not
        System.out.println(set.isEmpty()); // to check whether the set is empty or not | return true or false
        System.out.println(set.size()); // tell us the size of set
        set.clear(); // empty the set
        System.out.println(set);

        System.out.println("----------Tree Set-------------");
        // it also implements set property but bts it does everything in sorted form, it
        // does it's implementation in binary search tree
        TreeSet<Integer> tset = new TreeSet<>();

        tset.add(32);
        tset.add(2);
        tset.add(3);
        tset.add(44);
        tset.add(10);
        System.out.println(tset);
        // output -> [2, 3, 10, 32, 44]
        // clear, find, add -> TC(O(logN))

    }
}
