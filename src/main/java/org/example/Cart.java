package org.example;

import java.util.*;

public class Cart {
    private final List<Item> items;
    private float totalDiscount;
    private final Map<String, Float> productDiscount;

    /**
     * default constructor
     **/
    public Cart() {
        items = new ArrayList<>();
        productDiscount = new HashMap<>();
        productDiscount.put("1", 0.1f);
    }

    private Item asAnewItem(Product product, boolean flag) {
        float discount;
        if (productDiscount.containsKey(product.getId())) {
            discount = productDiscount.get(product.getId());
        } else {
            discount = 1;
        }
        Item item = new Item(product, 1, discount);
        if (flag) {
            items.add(item);
        }
        return item;
    }

    /**
     * add a new product to card
     * if the quantity of the product over the 99 return the false
     * if success to add return true
     **/
    public Boolean add(Product product) {
        Item item = items
                .stream()
                .filter(it -> it.getProduct().equals(product))
                .findFirst()
                .orElse(null);
        // there is no product in cart
        if (item == null) {
            asAnewItem(product, true);
            //items.add(asAnewItem(product,true));
        } else {
            if (item.getQuantity() + 1 >= 99) {
                return false;
            }
            item.setQuantity(item.getQuantity() + 1);
        }
        return true;
    }

    public Boolean add(Product product, int count) {
        Item item = items
                .stream()
                .filter(it -> it.getProduct().equals(product))
                .findFirst()
                .orElse(null);
        // there is no product in cart
        if (item == null) {
            asAnewItem(product, true);
            //items.add(asAnewItem(product,true));
        } else {
            if (item.getQuantity() + count >= 99) {
                return false;
            }
            item.setQuantity(item.getQuantity() + count);
        }
        return true;
    }

    public void decreaseProduct() {
        //TODO will complete this method on next week
    }
}
