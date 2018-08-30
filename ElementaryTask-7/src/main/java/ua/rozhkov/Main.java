package ua.rozhkov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Input length of row:");
        String lengthSeq = new Scanner(System.in).nextLine();
        System.out.print("Input max square of number: ");
        String maxSquare = new Scanner(System.in).nextLine();
        DigitSeq digitSeq = new DigitSeq();
        System.out.println(digitSeq.printSeq(lengthSeq, maxSquare));
    }
}
