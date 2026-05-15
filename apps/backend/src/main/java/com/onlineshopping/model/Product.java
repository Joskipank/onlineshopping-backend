package com.onlineshopping.model;

import com.onlineshopping.enums.OrderStatus;
import com.onlineshopping.enums.ProductStatus;

import java.util.Objects;

public abstract class Product{
    private static int counter = 0;
    private int id;
    private ProductStatus status = ProductStatus.IN_STOCK;
    private String categoryName;
    private String subCategoryName;
    private String title;
    private double price;


    public Product(String title, double price, String subCategoryName, String categoryName) {
        this.id = counter++;
        this.title = title;
        this.price = price;
        this.subCategoryName = subCategoryName;

        Category.addSubCategory(subCategoryName, this, categoryName);
    }

    @Override
    public String toString() {
        return
                ", title='" + title + '\'' +
                ", price=" + price + '\'' +
                        "наличие=" + status +

                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(subCategoryName, price);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if(this == obj) return true;
        if(!(obj instanceof Product)) return false;

        Product other = (Product) obj;
        return this.subCategoryName.equals(other.subCategoryName) && this.price == other.price;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getSubCategoryName() {
        return subCategoryName;
    }

    public void setSubCategoryName(String subCategoryName) {
        this.subCategoryName = subCategoryName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ProductStatus getStatus() {
        return status;
    }

    public void setStatus(ProductStatus status) {
        this.status = status;
    }
}