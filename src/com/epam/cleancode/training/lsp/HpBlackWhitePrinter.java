package com.epam.cleancode.training.lsp;

public class HpBlackWhitePrinter implements Printer {
    @Override
    public PrintResult print(Sharp sharp, ColorType colorType) throws NotSupportedColorException {
        if (colorType == ColorType.FULL) {
            throw new NotSupportedColorException();
        }

        // do something
        return new PrintResult(sharp, colorType);
    }
}
