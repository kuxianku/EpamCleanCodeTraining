package org.example;

import java.time.LocalDate;
import java.util.*;

public class Cart {
    private final List<ItemInfo> itemInfoList;
    private float totalDiscount;
    private final Map<String, Float> productDiscount;
    /**
     * default constructor
     **/
    public Cart() {
        itemInfoList = new ArrayList<>();
        productDiscount = new HashMap<>();
        productDiscount.put("1", 0.1f);
    }
    private ItemInfo asAnewItem(Product product, boolean flag) {
        float discount;
        if (productDiscount.containsKey(product.getId())) {
            discount = productDiscount.get(product.getId());
        } else {
            discount = 1;
        }
        ItemInfo itemInfo = new ItemInfo(product, 1, discount);
        if (flag) {
            itemInfoList.add(itemInfo);
        }
        return itemInfo;
    }
    /**
     * add a new product to card
     **/
    public Boolean add(Product product) {
        if (product.getExpYyMmDyDate().isAfter(LocalDate.now())) {
            return false;
        }
        ItemInfo itemInfo = itemInfoList.stream().filter(it -> it.getProduct().equals(product))
                .findFirst().orElse(null);
        // there is no product in cart
        if (itemInfo == null) {
            asAnewItem(product, true);
            //items.add(asAnewItem(product,true));
        } else {
            if (itemInfo.getQuantity() + 1 >= 99) {
                return false;
            }
            itemInfo.setQuantity(itemInfo.getQuantity() + 1);
        }
        return true;
    }
    public Boolean add(Product product, int count) {
        if (count >= 99) {
            return false;
        }
        if (product.getExpYyMmDyDate().isAfter(LocalDate.now())) {
            return false;
        }
        ItemInfo itemInfo = itemInfoList.stream().filter(it -> it.getProduct().equals(product))
                .findFirst().orElse(null);
        // there is no product in cart
        if (itemInfo == null) {
            return false;
        } else {
            if (itemInfo.getQuantity() + count >= 99) {
                return false;
            }
            itemInfo.setQuantity(itemInfo.getQuantity() + count);
        }
        return true;
    }
    public void decreaseProduct() {
        //TODO will complete this method on next week
    }
}
