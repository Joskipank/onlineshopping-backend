package com.onlineshopping.service.impl;

import com.onlineshopping.model.Category;

public class CategorySort implements Comparable <Object>{

    @Override
    public int compareTo(Object o) {
        Category other = (Category) o;
        return 0;
    }
}
