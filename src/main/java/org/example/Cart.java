package org.example;

import java.util.*;

public class Cart {
    private static final int MAX_QUANTITY_PER_PRODUCT = 99;
    private static final int PRICE_OF_10_DISCOUNT = 200;
    private static final String APPLE_ID = "1";

    private final List<Item> items;
    private float totalDiscount;
    private final Map<String, Float> productDiscount;

    public Cart() {
        items = new ArrayList<>();
        productDiscount = new HashMap<>();
        productDiscount.put(APPLE_ID, 0.1f);
    }

    public void addProductToCart(Product product) throws ProductExceedsLimitException {
        Item item = findItemByProducts(product);
        if (item == null) {
            items.add(asAnewItem(product));
        } else {
            checkProductQuantity(item);
            increase(item);
        }
    }


    private Item findItemByProducts(Product product) {
        return items
                .stream()
                .filter(item -> item.getProduct() == product)
                .findFirst()
                .orElse(null);
    }

    private Item asAnewItem(Product product) {
        return new Item(product, 1, checkForDiscount(product));
    }

    private float checkForDiscount(Product product) {
        if (productDiscount.containsKey(product.getId())) {
            return productDiscount.get(product.getId());
        } else {
            return 1;
        }
    }

    private void increase(Item item) {
        item.setQuantity(item.getQuantity() + 1);
    }

    private void checkProductQuantity(Item item) throws ProductExceedsLimitException {
        if (item.getQuantity() >= MAX_QUANTITY_PER_PRODUCT) {
            throw new ProductExceedsLimitException(item.getProduct().getName() + "exceeds the maximum number limit of 99");
        }
    }

}
