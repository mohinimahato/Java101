// package Collection_framework;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        // to add elements use -> push
        animals.push("Lion");
        animals.push("Dog");
        animals.push("Horse");
        animals.push("cat");
        System.out.println("Stack: " + animals);

        // to check which element is at the top: peek()
        System.out.println(animals.peek());

        // pop -> top element gets removes the top element
        animals.pop();
        System.out.println(animals);
    }
}
