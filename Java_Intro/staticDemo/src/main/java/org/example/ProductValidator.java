package org.example;

public class ProductValidator {

    static {
        System.out.println("Static constructor work");
    }

    public ProductValidator() {
        System.out.println("Constructor work");
    }

    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }


}
