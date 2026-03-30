import java.util.HashMap;

public abstract class Category {
    private static int counter = 0;

    private int id;
    private String title;
    private double price;
    private static HashMap<Integer, String> category = new HashMap<>();

    public Category(String title, double price) {
        this.id = ++counter;
        this.title = title;
        this.price = price;

        category.put(this.id, title);
    }

    public static void printCategory() {
        for (Integer key : category.keySet()) {
            System.out.println(key + ": " + category.get(key));
        }
    }
}
