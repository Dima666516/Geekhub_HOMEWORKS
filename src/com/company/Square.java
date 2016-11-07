package com.company;
import java.util.Scanner;

class Square implements Shape {

    public static final ShapeType TYPEOFSHAPE = ShapeType.SQUARE;

    private double sideA = 0;
    private double sideB = 0;

    public Square(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }


    @Override
    public double calculateArea() {
        return sideA * sideB;
    }

    @Override
    public double calculatePerimeter() {
        return sideB * 4;
    }

    @Override
    public String toString() {
        return "Square  \n" +
                "perimeter :" + calculatePerimeter() + " \n" +
                "area :" + calculateArea();
    }
}
