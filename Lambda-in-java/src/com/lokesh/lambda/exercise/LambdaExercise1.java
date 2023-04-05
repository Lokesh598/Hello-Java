package com.lokesh.lambda.exercise;

import com.lokesh.lambda.Product;
import com.lokesh.lambda.ProductData;

import java.util.Comparator;
import java.util.List;

public class LambdaExercise1 {

    public static void main(String[] args) {
        List<Product> products = ProductData.getProducts();

        // Interface Comparator implemented with an anonymous class.
//        products.sort(new Comparator<Product>() {
//            @Override
//            public int compare(Product p1, Product p2) {
//                return p1.getPrice().compareTo(p2.getPrice());
//            }
//        });

        // Interface Comparator implemented with a lambda expression.
        products.sort((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()));

        // The same with a more verbose syntax:
        // - You can optionally specify the type of the parameters
        // - The body can be a block between { and } or a single expression
        products.sort((Product p1, Product p2) -> {
            return p1.getPrice().compareTo(p2.getPrice());
        });

        for (Product product : products) {
            System.out.println(product);
        }
    }
}
