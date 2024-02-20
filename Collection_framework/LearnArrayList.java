import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {
        // Arraylist uses array internally
        // arraylist of type string, internally in the memory a new empty array gets
        // created
        // ArrayList<String> studentname = new ArrayList<>();
        // empty arrayList created
        // to add array value now
        // studentname.add("Aman");
        // the moment we add any value internally array of lenght gets created. Once all
        // the 10 element space is filled, it increases it's size by (n + n/2 + 1) i.e
        // 10 + 10/2 + 1 = 16

        // How different function works in arraylist
        // add
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.add(4); // this will add 4 at the end of the list | TC-> O(N)
        System.out.println(list);

        list.add(1, 50); // element at a particular index;
        System.out.println(list);

        // merge one list to another
        List<Integer> newList = new ArrayList<>();
        newList.add(10);
        newList.add(1111);
        list.addAll(newList); // this will add all elements of newList to existing list
        System.out.println(list);

        // to get anything from list
        System.out.println(list.get(1));

        // to remove anything from list | TC-> O(N)
        list.remove(5); // remove by position
        System.out.println(list);
        list.remove(Integer.valueOf(50)); // remove by element
        System.out.println(list);

        // list.clear(); // empty the entire list
        // System.out.println(list);

        // update value of element in a particular index
        list.set(2, 1000); // O(1) operation
        System.out.println(list);

        // to check whether a particular element is present or not
        System.out.println(list.contains(1000)); // | TC-> O(N)

        // Iterate over element
        // for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println("the element is " + list.get(i));
        }

        // using forEach
        for (Integer element : list) {
            System.out.println("forEach element is " + element);
        }

        // every collection framework has an iterator, and it carries a lot of function
        // together with itself

        Iterator<Integer> it = list.iterator(); // iterator of type integer
        // hasNext() -> tell us whether in this iterator there's any next element
        while (it.hasNext()) {
            System.out.println("iterator " + it.next());
        }
    }
}
