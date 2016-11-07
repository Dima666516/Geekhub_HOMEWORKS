package com.company;

import java.util.Arrays;
import java.util.Scanner;

import static com.company.ShapeType.*;
import static java.lang.String.format;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the figure name : ");
        final String name;
        if(scanner.hasNext()) {
            name = scanner.next();
            final Shape shape = defineShape(name, scanner);
            if(shape != null) {
                System.out.println(shape);
            }
        }
    }

    public static Shape defineShape(String name, Scanner scanner) {
        try {
            switch (valueOf(name)) {
                case RECTANGLE :
                    return instantiateRectangle(scanner);
                case CIRCLE :
                    return null;
                case SQUARE :
                    return instantiateSquare(scanner);
                case TRIANGLE :
                    return instantiateTriangle(scanner);
            }
        } catch (IllegalArgumentException x) {
            System.out.println(format("Sorry but shape type '%s' is unsupported, see also supported types : %s ",
                    name,
                    Arrays.toString(ShapeType.values())));
        }
        return null;
    }


    private static Rectangle instantiateRectangle(Scanner scanner) {
        System.out.println("Please enter rectangle side A : ");
        double a = scanner.nextDouble();
        System.out.println("Please enter rectangle side B : ");
        double b = scanner.nextDouble();
        return new Rectangle(a, b);
    }

    private static Square instantiateSquare(Scanner scanner) {
        System.out.println("Please enter rectangle side A : ");
        double a = scanner.nextDouble();
        System.out.println("Please enter rectangle side B : ");
        double b = scanner.nextDouble();
        return new Square(a, b);
    }
    private static Triangle instantiateTriangle(Scanner scanner) {
        System.out.println("Please enter Triangle side A : ");
        double a = scanner.nextDouble();
        System.out.println("Please enter Triangle side B : ");
        double b = scanner.nextDouble();
        System.out.println("Please enter Triangle side C : ");
        double c = scanner.nextDouble();
        return new Triangle(a, b, c);
    }
}
