public class Main {
    //todo добавить 2 интерфейса: Payable - помощь экзмплярам отвечаюий за товары внутри 3 метода - 1 метод getFinalPrice() отвечает за итогвую сумму товара, 2 метод void pay(double amount), 3 метод boolean isPaid()уточняет товар оплачен или нет, Financable - 1 метод double checkBalance() уточняет текубщий баланс клиента, 2 метод haveIsNowMoney(double amount), 3 метод String getFinanceStatus() Возвращает финансовый статус обьекта
    //todo расширение классов и инкапсулирование
    //todo 3 этап добавляем новые обьекты и из интерфейсов демонстрация

    // todo category должна автоматически сортировать категории comparable должен работать с категориями
    // todo  есть товары работают с comparator и с помощю него можно сортировать по цене или по названию и тд. Не стоит забывать нужен ли дополнительеый класс
    // todo создаем меню первая команда для получания категории 2 - для 3 - для критерии сортировки по убыванию по вохврастанию и тд, 4 - для сравнения двух товаров должна быть защита чтобы не сравнивалось с другим категорией и сравнение по критериям должно быть

    // абстрактный класс персон и конкректный класс клиент
    public static void main(String[] args) {
        Product product1 = new Electronic("samsung", 55, "Мобилы", "Электроника");
        Product product2 = new Electronic("apple", 55, "Пк", "Электроника");
        Product product3 = new Electronic("Телефон", 55, "Мобилы", "Электроника");

        Category.printCategory();
        System.out.println("---------");
        Catalog.showCattegory();
        System.out.println("---------");
        Catalog.showStats();
        System.out.println("---------");

        System.out.println(product1.equals(product2));
        System.out.println(product1.equals(product3));

        Person p1 = new Client("Типок");
        System.out.println(p1.getBalance());
        p1.addBalance(41);
        System.out.println(p1.getBalance());
        p1.addBusket("samsung");
        p1.addBusket("apple");
        p1.addBusket("67");
        System.out.println();
        p1.getBusket();
        p1.getFinalPrice();
        System.out.println(p1);
        System.out.println(p1.getFinanceStatus());
        p1.pay();
        p1.addBalance(120);
        p1.pay();
    }
}