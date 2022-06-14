package com.epam.cleancode.training.code3;

class Test {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 6);
        reforgeShape(rectangle);

        Rectangle square = new Square();
        square.setWidth(5);
        reforgeShape(square);
    }

    static void reforgeShape(Rectangle rectangle) {
        rectangle.setHeight(2);
        rectangle.setWidth(3);
        System.out.println("Area is " + rectangle.getArea());
    }
}