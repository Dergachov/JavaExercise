package javacore.recursion;

import java.util.*;

public class RecursionDecBin {
    public static void main(String[] args) {
        System.out.print("Enter DEC digit number: ");

        Scanner inputKeyboard = new Scanner(System.in);
        int inputDigit = inputKeyboard.nextInt();

        System.out.print("Result in BIN: ");
        BinaryRecursion(inputDigit);
    }

    public static void BinaryRecursion(int dec) {
        if (dec >= 2) {
            BinaryRecursion(dec / 2);
        }
        System.out.print(dec % 2);
    }
}
