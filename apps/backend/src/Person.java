import java.sql.SQLOutput;
import java.util.HashMap;

public abstract class Person implements Financable, Payable {
    private String name;
    private double balance;
    private HashMap<String, Double> busket = new HashMap<>();
    private double finalPrice;

    public Person(String name) {
        this.name = name;
        this.balance = 0;
    }

    @Override
    public void addBusket(String name){
        if (Category.category.containsKey(name)){
            busket.put(name, Category.category.get(name));
            finalPrice += busket.get(name);
        } else {
            System.out.printf("Данного товара нету %s", name);
        }
    }

    @Override
    public void getFinalPrice(){
        System.out.printf("итоговая сумма %f", finalPrice);
    }//итоговая сумма товара
    @Override
    public void pay(){
        if (finalPrice < this.balance){
            this.balance = balance - finalPrice;
            System.out.printf("Вы успешно совершили покупку. Ваш баланс %f", this.balance);
            this.finalPrice = 0;
        } else {
            System.out.println("Недостаточно средст");
        }
    } // оплата
    @Override
    public boolean isPaid(){
        return false;
    }


    @Override
    public double checkBalance() {
        return this.balance;
    }

    @Override
    public boolean haveIsNowMoney(double amount) {
        return false;
    }

    @Override
    public String getFinanceStatus() {
        if (this.balance < 42){ // доллары типо
            return String.format("Вы нищеброд поскольку. Ваш баланс %f", this.balance);
        } else {
            return String.format("Вы ваще миллионер красава, лучший. Ващ баласн - %f", this.balance);
        }
    }

    @Override
    public void addBalance(double amount) {
        this.balance += amount;
    }

    @Override
    public void minusBalance(double amount) {
        if (amount <= 0){
            System.out.println("не возможно уходит в отрицательно %f");
        } else {
            System.out.println("Успешно");
            this.balance -= amount;
        }

    }

    public void getBusket() {
        for (String key : busket.keySet()) {
            System.out.println(key + ": " + busket.get(key));
        }
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", busket=" + busket +
                ", finalPrice=" + finalPrice +
                '}';
    }
}