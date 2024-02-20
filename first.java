import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        // -------How to print---------
        System.out.println("My First Java Program.");
        // -----------Datatypes in java------------
        /*
         * int, float, char, String,long, double, boolean
         */
        // int -> 2*10^9 and long -> 2*10^18
        // int age = 18;
        // add l at the end to denote it the ong datatype
        // long bigNumber = 98978878787878l;
        // we need to add f after the value of any float value to make the program
        // understand what data type we are trying to store
        // float avgMarkss = 19.8878f;
        // for char use single ''
        // char grade = 'A';
        // for string we need to use double quotes
        // char is a primitive data type whereas String is a class in java. char
        // represents a single character whereas String can have zero or more characters
        // String name = "Mohini";
        // boolean isValid = false;

        // -------------------Taking user input----------------
        // Scanner class help us taking input
        // sc is the variable of the object type
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age2 = sc.nextInt(); // to take integer value from user
        System.out.println(age2);

    }
};
