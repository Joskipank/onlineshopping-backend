public interface Financable {
    public void addBalance(double amount);
    public void minusBalance(double amount);
    public double checkBalance(); // уточняет текубщий баланс клиента
    public boolean haveIsNowMoney(double amount); //хватает ли денег
    public String getFinanceStatus(); //Возвращает финансовый статус обьекта
}
