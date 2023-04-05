package com.lokesh.lambda.exercise;

import com.lokesh.lambda.Product;
import com.lokesh.lambda.ProductData;

import java.util.Comparator;
import java.util.List;

public class LambdaExercise101 {
    public static void main(String[] args) {
        List<Product> PRODUCTS = ProductData.getProducts();

        PRODUCTS.sort(new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getPrice().compareTo(p2.getPrice());
            }
        });

        for (Product product: PRODUCTS) {
            System.out.println(product);
        }
    }
}
