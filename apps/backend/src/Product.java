import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Objects;

public abstract class Product{
    private static int counter = 0;
    private int id;

    private String ownerCategoryName;
    private String name;

    private String title;
    private double price;


    public Product(String title, double price, String name, String ownerCategoryName) {
        this.id = counter++;
        this.title = title;
        this.price = price;
        this.name = name;

        Category.addCattegory(title, price);
        Category.addSubCategory(name);
        Catalog.addOwnCategory(ownerCategoryName, this);
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if(this == obj) return true;
        if(!(obj instanceof Product)) return false;

        Product other = (Product) obj;
        return this.name.equals(other.name) && this.price == other.price;
    }


}