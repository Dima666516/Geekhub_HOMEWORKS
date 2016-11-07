package com.company;

 class Triangle implements Shape {

     public static final ShapeType TRIANGLETYPE = ShapeType.TRIANGLE;

     private double sideA = 0;
     private double sideB = 0;
     private double sideC = 0;
     private double perimetr;
     private double area;


     public Triangle(double sideA, double sideB, double sideC) {
         this.sideA = sideA;
         this.sideB = sideB;
         this.sideC = sideC;
     }

     @Override
     public double calculateArea() {
         perimetr = (sideA+sideC+sideB)/2;
         area = perimetr*(perimetr-sideA)*(perimetr-sideB)*(perimetr-sideC);
         return Math.sqrt(area);}

     @Override
     public double calculatePerimeter() {return sideA + sideB + sideC;}

     @Override
     public String toString() {
         return "Triangle  \n" +
                 "perimeter :" + calculatePerimeter() + " \n" +
                 "area :" + calculateArea();
     }
 }
