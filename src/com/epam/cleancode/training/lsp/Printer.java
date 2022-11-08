package com.epam.cleancode.training.lsp;

public interface Printer {

    PrintResult print(@ValidSharp Sharp sharp, ColorType colorType) throws NotSupportedColorException;
}
