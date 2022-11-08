package com.epam.cleancode.training.lsp;

public class PrintResult {
    private Sharp sharp;
    private ColorType colorType;

    public PrintResult(Sharp sharp, ColorType colorType) {
        this.sharp = sharp;
        this.colorType = colorType;
    }

    @Override
    public String toString() {
        return "PrintResult{" +
                "sharp=" + sharp +
                ", colorType=" + colorType +
                '}';
    }
}
