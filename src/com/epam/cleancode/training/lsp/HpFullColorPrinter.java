package com.epam.cleancode.training.lsp;

public class HpFullColorPrinter implements Printer {
    @Override
    public PrintResult print(Sharp sharp, ColorType colorType) {
        if (sharp.getArea() < 0) {
            throw new InvalidSharpException();
        }

        return new PrintResult(sharp, colorType);
    }
}
