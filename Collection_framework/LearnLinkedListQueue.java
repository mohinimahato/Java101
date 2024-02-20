import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args) {
        // queue-> FIFO
        // can be implemented using arraylist, linkedlist or priorityQueue
        Queue<Integer> queue = new LinkedList<>();
        // .offer() to add elements in the queue
        queue.offer(12);
        queue.offer(34);
        queue.offer(10);
        System.out.println(queue);

        // .poll()-> remove the element
        System.out.println(queue.poll());
        System.out.println(queue);

        // peek() -> it'll tell us which element will be removed next
        System.out.println(queue.peek());
    }
}
