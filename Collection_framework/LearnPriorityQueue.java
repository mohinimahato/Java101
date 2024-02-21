
import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(100);
        pq.offer(10);
        pq.offer(120);
        pq.offer(9);
        System.out.println(pq);
        // output -> [9, 10, 120, 100] why so? because under the hood it implements
        // minheap data structure, so the smallest element stays at the top
        // now if we do poll the element that will pop out which has the most priority
        // in this case the first smallest element
        System.out.println(pq.poll());
        // output -> 9
        System.out.println(pq);

        System.out.println(pq.peek());

        // Now what if we want the largest element to have the highest priority, we will
        // add comparator
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
        pq2.offer(100);
        pq2.offer(10);
        pq2.offer(120);
        pq2.offer(9);
        System.out.println(pq2);
        // output-> [120, 10, 100, 9], uses maxheap data structure
    }

}
