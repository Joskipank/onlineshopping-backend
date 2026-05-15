package com.onlineshopping.model;

import java.util.HashSet;


public abstract class Catalog {
    protected static HashSet<String> catalog = new HashSet<>();

    public static void showCatalog(){
        for(String el : catalog){
            System.out.println(el);
        }
    }

    public static void showStats() {
        System.out.println("Всего категорий " + Category.categoryCount);
    }

}