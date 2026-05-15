package com.onlineshopping.service.impl;

import com.onlineshopping.model.Product;
import java.util.Comparator;

public class SortByStock implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2){
        return Integer.compare(o1.getStatus().ordinal(), o2.getStatus().ordinal());
    }
}
