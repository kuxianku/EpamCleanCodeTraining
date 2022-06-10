package com.epam.cleancode.training.lsp;

class Test {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1, 3);
        someTestMethod(rectangle);

        Rectangle square = new Square();
        square.setWidth(5);
        someTestMethod(square);
    }

    static void someTestMethod(Rectangle rectangle) {
        rectangle.setHeight(2);
        rectangle.setWidth(3);
        assert(rectangle.getArea() == 6);
    }
}