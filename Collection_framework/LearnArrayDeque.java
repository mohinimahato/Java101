import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        // Arraydeque -> queue where we can add and remove element from both front and
        // end and can peek from both the sides as well

        // It's use in sliding window technique
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(21);
        // offerFirst -> add element at first, offerLast-> add element at last
        adq.offerFirst(90);
        adq.offerLast(55);
        System.out.println(adq);
        // peek and poll can be used here as well
        // additionally it has peekFirst, peekLast, pollFirst, polllast;

    }
}
