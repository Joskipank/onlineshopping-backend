package com.onlineshopping.model;

import com.onlineshopping.service.impl.SortByPrice;
import com.onlineshopping.service.impl.SortByPriceReverse;
import com.onlineshopping.service.impl.SortByStock;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Category {
    protected static HashMap<String, HashMap<String, List<Product>>> category = new HashMap<>();
    protected static int categoryCount = 0;
    protected static HashMap<String, List<Product>> subCategory = new HashMap<>();
    protected static int subCategoryCount = 0;

    public static void addSubCategory(String subCategoryName, Product product, String categoryName){
        if(!(subCategory.containsKey(subCategoryName))){
            subCategory.put(subCategoryName, new ArrayList<>());
        }
        subCategory.get(subCategoryName).add(product);
        category.put(categoryName, subCategory);
        subCategoryCount++;
        category.put(categoryName, subCategory);

        Catalog.catalog.add(categoryName);
    }

    public static void showSubCategory(){
        for(String el : subCategory.keySet()){
            System.out.println(el + ":" + subCategory.get(el));
            System.out.println();
        }
    }

    public int getSubCategoryCount() {
        return subCategoryCount;
    }

    public static void showCategory() {
        for (String key : category.keySet()) {
            System.out.println(key + ": " + category.get(key));
        }
    }

    public static void sortByPrice(){
        for (List<Product> product : subCategory.values()) {
            product.sort(new SortByPrice());
        }
    }

    public static void sortByStock(){
        for (List<Product> product : subCategory.values()) {
            product.sort(new SortByStock());
        }
    }

    public static void sortByReversePrice(){
        for (List<Product> product : subCategory.values()) {
            product.sort(new SortByPriceReverse());
        }
    }
}
