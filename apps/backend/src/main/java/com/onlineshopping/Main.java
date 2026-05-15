package com.onlineshopping;

import com.onlineshopping.model.Client;
import com.onlineshopping.model.Electronic;
import com.onlineshopping.model.Person;
import com.onlineshopping.model.Product;
import com.onlineshopping.ui.GeneralMenu;

public class Main {
    //todo добавить 2 интерфейса: Payable - помощь экзмплярам отвечаюий за товары внутри 3 метода - 1 метод getFinalPrice() отвечает за итогвую сумму товара, 2 метод void pay(double amount), 3 метод boolean isPaid()уточняет товар оплачен или нет, Financable - 1 метод double checkBalance() уточняет текубщий баланс клиента, 2 метод haveIsNowMoney(double amount), 3 метод String getFinanceStatus() Возвращает финансовый статус обьекта
    //todo расширение классов и инкапсулирование
    //todo 3 этап добавляем новые обьекты и из интерфейсов демонстрация

    // todo category должна автоматически сортировать категории comparable должен работать с категориями
    // todo  есть товары работают с comparator и с помощю него можно сортировать по цене или по названию и тд. Не стоит забывать нужен ли дополнительеый класс
    // todo создаем меню первая команда для получания категории 2 - для 3 - для критерии сортировки по убыванию по вохврастанию и тд, 4 - для сравнения двух товаров должна быть защита чтобы не сравнивалось с другим категорией и сравнение по критериям должно быть


    // todo добавить enum
    // todo начать использовать
    // todo функциональный интерфейс работал с товарами и заказами реализация через лямбды выражения
    // todo Расширяем пользоватю филььтрация по цене по с
    public static void main(String[] args) {
        Product product1 = new Electronic("samsung", 45, "Мобилы", "Электроника");
        Product product4 = new Electronic("xiami", 433, "Мобилы", "Электроника");
        Product product5 = new Electronic("ballprohe", 20, "Мобилы", "Электроника");
        Product product2 = new Electronic("apple", 55, "Пк", "Электроника");
        Product product3 = new Electronic("Телефон", 335, "Мобилы", "Электроника");

        Person p1 = new Client("Типок");
        GeneralMenu genMenu = new GeneralMenu(p1);
        genMenu.startMenu();
    }
}