package org.example;

public class Order {
    public boolean placeItems(ItemInfo[] itemInfoList, String type) {
        float sum = 0;
        for (int i = 0; i < itemInfoList.length; i++) {
            float discount = itemInfoList[i].getDiscount();
            float price = Float.parseFloat(itemInfoList[i].getProduct().getPrice());
            int quantity = itemInfoList[i].getQuantity();
            sum+=discount*price*quantity;
        }

        switch (type) {
            case "ApplePay":
                System.out.println("you should pay: " + sum + " with Apple pay");
                break;
            case "AliPay":
                System.out.println("you should pay: " + sum + " with Ali pay");
                break;
            case "Paypal":
                System.out.println("you should pay: " + sum + " with Paypal");
                break;
            case "IPS":
                System.out.println("you should pay: " + sum + " with IPS");
                break;
            case "Wechat":
                System.out.println("you should pay: " + sum + " with Wechat");
                break;
            default:
                System.out.println("payment failed");
                return false;
        }
        return true;
    }
}
