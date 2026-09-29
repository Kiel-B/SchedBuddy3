package com.example.schedbuddy.quarter2.PracticalExam.FastFoodTest;

public class FastFoodOrder {
    private final String itemName;
    private final double basePrice;
    private static final double TAX_RATE = 0.12;

    public FastFoodOrder(String itemName, double basePrice) {
        this.itemName = itemName;
        this.basePrice = basePrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double calculateTax() {
        return basePrice * TAX_RATE;
    }

    public double calculateTotal() {
        return basePrice + calculateTax();
    }

    public String getItemName() {
        return itemName;
    }

    public void printSummary() {
        System.out.println("\n===== ORDER SUMMARY (" + itemName.toUpperCase() + ") =====");
        System.out.printf("Item Price: ₱%.2f%n", basePrice);
        System.out.printf("Tax (12%%): ₱%.2f%n", calculateTax());
        System.out.printf("total due: ₱%.2f%n", calculateTotal());
        System.out.println("Success: Successfully processed your order for " + itemName + "!");
    }
}