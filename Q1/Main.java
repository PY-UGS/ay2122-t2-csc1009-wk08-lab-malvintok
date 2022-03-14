package Q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Input radius: ");
        Double area = input.nextDouble();
        CircleWithException test = new CircleWithException(area);
        System.out.println("Area: " + test.getArea());
        System.out.println("Diameter: " + test.getDiameter());
        input.close();
    }
}
