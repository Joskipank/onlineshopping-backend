import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Objects;

public abstract class Category {
    private static List<String> subCategory = new ArrayList<>();
    protected static HashMap<String, Double> category = new HashMap<>();

    public static void addSubCategory(String name){
        subCategory.add(name);
    }

    public static void addCattegory(String title, double price){
        category.put(title, price);
    }


    public static void printCategory() {
        for (String key : category.keySet()) {
            System.out.println(key + ": " + category.get(key));
        }
    }

    public static void showOwnCattegory(){
        for(String el : subCategory){
            System.out.println(el);
        }
    }
}
