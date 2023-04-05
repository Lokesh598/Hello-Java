package com.lokesh.lambda.exercise;

import com.lokesh.lambda.Product;
import com.lokesh.lambda.ProductData;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class LambdaExercise104 {
    public static void main(String[] args) {
        List<Product> Products = ProductData.getProducts();

        BigDecimal priceLimit = new BigDecimal(5);

        AtomicInteger counter = new AtomicInteger();
        List<Product> cheapProduct = new ArrayList<>();
        Products.parallelStream().forEach(product -> {
                if (product.getPrice().compareTo(priceLimit) <0) {
                    cheapProduct.add(product);
            }
        });
        cheapProduct.forEach(product -> System.out.println(product));
    }
}
