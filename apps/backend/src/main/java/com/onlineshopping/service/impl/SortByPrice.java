package com.onlineshopping.service.impl;
import com.onlineshopping.model.Product;

import java.util.Comparator;

public class SortByPrice implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2){
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}
