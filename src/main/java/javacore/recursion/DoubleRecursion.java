package javacore.recursion;

public class DoubleRecursion {
    public static void main(String[] args) {
        MethodA(3);
    }

    public static void MethodA(int counter) {
        System.out.println("First part MethodA   Counter = " + counter);
        MethodB(counter);
        System.out.println("Second part MethodA   Counter = " + counter);
    }

    public static void MethodB(int counter) {
        counter--;
        System.out.println("First part MethodB   Counter = " + counter);
        if (counter != 0) {
            MethodA(counter);
        }
        System.out.println("Second part MethodB   Counter = " + counter);
    }
}
