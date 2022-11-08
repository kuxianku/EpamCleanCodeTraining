package com.epam.cleancode.training.lsp;

class Rectangle implements Sharp {
    private Double width;
    private Double height;

    public Rectangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public Double getArea() {
        return width * height;
    }
}