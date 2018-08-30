package ua.rozhkov;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> paramList = new ArrayList<>();
        List<Triangle> triangleList = new ArrayList<>();
        String inputStr;

        do {
            Triangle triangle = new Triangle();
            System.out.print("Input triangle data (name and size of 3 sides) divided by comma: ");
            inputStr = scanner.nextLine();
            while (inputStr.length() > 0) {
                if (inputStr.contains(",")) {
                    paramList.add(inputStr.substring(0, inputStr.indexOf(',')).trim());
                    inputStr = inputStr.substring(inputStr.indexOf(',') + 1);
                } else {
                    paramList.add(inputStr.trim());
                    inputStr = "";
                }
            }
            triangle.setName(paramList.get(0));
            triangle.setA(Float.parseFloat(paramList.get(1)));
            triangle.setB(Float.parseFloat(paramList.get(2)));
            triangle.setC(Float.parseFloat(paramList.get(3)));
            if (triangle.square() <= 0) {
                System.out.println("Invalid size of triangle sides!");
            } else {
                triangleList.add(triangle);
            }
            paramList.clear();
            System.out.print("Type y or yes to add another triangle: ");
            inputStr = scanner.nextLine();
            System.out.println();
        } while (inputStr.equals("y") || (inputStr.equalsIgnoreCase("yes")));
        System.out.println("---");

        triangleList.sort(new Comparator<Triangle>() {
            @Override
            public int compare(Triangle o1, Triangle o2) {

                return (int) (o1.square() - o2.square());
            }
        });

        for (Triangle t :
                triangleList) {
            System.out.println(t.toString());
        }
    }
}
