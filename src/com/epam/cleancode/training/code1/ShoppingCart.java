package com.epam.cleancode.training.code1;

import java.util.List;

public class ShoppingCart {

    List<SalmonSkinRoll> sushi;
    List<Spaghetti> pasta;

    public void addSushi(SalmonSkinRoll salmonSkinRoll) {
        sushi.add(salmonSkinRoll);
    }

    public void addPasta(Spaghetti spaghetti) {
        pasta.add(spaghetti);
    }

    public double checkout() {
        // calculate total price of all the food in the list. Here we just return 100.00 as an example.
        return 100.00;
    }
}