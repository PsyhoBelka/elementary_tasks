package ua.rozhkov;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        do {
            Envelop envelop1 = new Envelop();
            System.out.print("Input width of Envelop1: ");
            envelop1.setWidth(scanner.nextDouble());
            System.out.print("Input height of Envelop1: ");
            envelop1.setHeight(scanner.nextDouble());
            System.out.println("Square of Envelop 1 is " + envelop1.square());

            Envelop envelop2 = new Envelop();
            System.out.print("Input width of Envelop2: ");
            envelop2.setWidth(scanner.nextDouble());
            System.out.print("Input height of Envelop2: ");
            envelop2.setHeight(scanner.nextDouble());
            System.out.println("Square of Envelop 2 is " + envelop2.square());

            if (envelop1.compareEnv(envelop2)) {
                System.out.println("Envelop 2 can be place in Envelop 1");
            } else {
                if (envelop2.compareEnv(envelop1)) {
                    System.out.println("Envelop 1 can be place in Envelop 2 ");
                } else {
                    System.out.println("No one envelop can be place in each other");
                }
            }

            System.out.println("Do you want to compare another convert pair? Type anything to repeat or exit to end: ");
        } while (!Objects.equals(scanner.next().toLowerCase(), "exit"));
    }
}
