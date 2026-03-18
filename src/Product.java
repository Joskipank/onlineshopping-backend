import java.util.HashMap;
/*TODO1
1.Создаем абстрактный класс обьявляем там хешмап
2.*/

public abstract class Product {
    private long id;
    private String title;
    private double price;
    private HashMap<Integer, String> category;
   

    Product(String titleProduct, double priceProduct){
        this.title = titleProduct;
        this.price = priceProduct;
  
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }
}
