import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public abstract class Catalog {
    //todo сделать внутри hashmap чтобы принимал list<Category>
    private static HashMap<String, Product> ownCategories = new HashMap<>();
    private static int categoryCount = 0;
    private static int subCategoryCount = 0;

    public static void addOwnCategory(String name, Product product) {
        ownCategories.put(name, product);
        categoryCount++;
    }

    public static void showStats() {
        System.out.println("Всего категорий " + categoryCount);
        System.out.println("Всего сабкатегорий " + subCategoryCount);
    }

    public static void showCattegory(){
        for(String el : ownCategories.keySet()){
            System.out.println(el);
            subCategoryCount++;
        }
    }

    public static void incrementSubCount() {
        subCategoryCount++;
    }
}