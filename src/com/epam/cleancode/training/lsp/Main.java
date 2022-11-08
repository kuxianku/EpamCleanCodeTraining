package com.epam.cleancode.training.lsp;

class Main {

    public static void main(String[] args) {
        // how about use HpFullColorPrinter instead of HpBlackWhitePrinter
        Printer printer = new HpBlackWhitePrinter();

        try {
            Sharp rectangle1 = new Rectangle(5.0, 6.0);
            PrintResult printResult = printer.print(rectangle1, ColorType.BLACK_WHITE);
            System.out.println(printResult.toString());

            Sharp rectangle2 = new Rectangle(-5.0, 6.0);
            printResult = printer.print(rectangle2, ColorType.FULL);
            System.out.println(printResult.toString());
        } catch (NotSupportedColorException ex) {
            System.out.println("Not Supported Color for Printer");
        }
    }

}