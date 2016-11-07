package com.company;

class Rectangle implements Shape {

    public static final ShapeType TYPE = ShapeType.RECTANGLE;

    private double sideA = 0;
    private double sideB = 0;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return  sideA * sideB;
    }

    @Override
    public double calculatePerimeter() {
        return (sideA + sideB) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle  \n" +
                "perimeter :" + calculatePerimeter() + " \n" +
                "area :" + calculateArea();
    }
}
