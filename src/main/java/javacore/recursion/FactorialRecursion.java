package javacore.recursion;


public class FactorialRecursion {

    public static void main(String[] args) {
        System.out.println(Factorial(5));

    }
    static int Factorial(int number) {
        if (number == 0) return 1;
        else return number * Factorial(number - 1);
    }
}
