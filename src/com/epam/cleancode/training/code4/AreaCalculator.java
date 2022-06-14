package com.epam.cleancode.training.code4;

public class AreaCalculator {

    public Double calculateRectangleArea(Rectangle rectangle) {

        return rectangle.length * rectangle.width;
    }

    public Double calculateCircleArea(Circle circle) {

        return (22 / 7) * circle.radius * circle.radius;

    }
}