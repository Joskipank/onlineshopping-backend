public interface Payable {
    public void getFinalPrice(); //итоговая сумма товара
    public void pay(); // оплата
    public boolean isPaid();//уточняет товар оплачен или нет
    public void addBusket(String name);
}
