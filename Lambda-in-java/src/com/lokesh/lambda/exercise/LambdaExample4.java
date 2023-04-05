package com.lokesh.lambda.exercise;

import com.lokesh.lambda.Product;
import com.lokesh.lambda.ProductData;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample4 {
    public static void main(String[] args) {
        List<Product> products = ProductData.getProducts();

//        List<Product> cheapProducts = products.stream();


        BigDecimal priceLimit = new BigDecimal("6");

        int numberOfCheapProducts = 0;

        // Check if there are cheap products

        for ( Product product : products) {
            if (product.getPrice().compareTo(priceLimit) < 0) {
                numberOfCheapProducts++;
            }
        }
        //using lambda expression
//        Because local variables are effectively final, you cannot modify them inside a lambda expression.
//        products.forEach(product -> {
//            if (product.getPrice().compareTo(priceLimit) < 0) {
//                numberOfCheapProducts++;// Error: Variable must be effectively final
//            }
//        });

        System.out.println("There are " + numberOfCheapProducts + " cheap products");
    }
}
