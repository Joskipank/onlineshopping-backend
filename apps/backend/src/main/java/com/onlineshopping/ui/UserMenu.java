package com.onlineshopping.ui;

import com.onlineshopping.model.Catalog;
import com.onlineshopping.model.Category;
import com.onlineshopping.model.Person;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserMenu {
    static Scanner scanner = new Scanner(System.in);

    static void personBankMenu(Person p1){

        double amount = 0;
        while (true){
            System.out.println("==========Menu============");
            System.out.println("0 - Назад");
            System.out.println("1 - Посмотреть баланс");
            System.out.println("2 - Пополнить баланс");
            System.out.println("3 - снять с баланса");
            System.out.println("4 - Получить финансовый статус");

            int choice;
            try {
                choice = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: Нужно вводить только цифры!");
                scanner.nextLine();
                continue;
            }

            switch (choice) {
                case 0:
                    return;
                case 1:
                    System.out.println(p1.getBalance());
                    break;
                case 2:
                    System.out.println("Введите сумму пополненя");
                    amount = scanner.nextDouble();
                    scanner.nextLine();
                    p1.addBalance(amount);
                    amount = 0;
                    break;
                case 3:
                    System.out.println("Введите сумму пополненя");
                    amount = scanner.nextDouble();
                    scanner.nextLine();
                    p1.minusBalance(amount);
                    amount = 0;
                    break;
                case 4:
                    System.out.println(p1.getFinanceStatus());
                    break;
                default:
                    System.out.println("Недопустимое значение");
                    break;
            }
        }
    }

    static void filterMenu(){

        while (true){
            System.out.println("==========Menu============");
            System.out.println("0 - Назад");
            System.out.println("1 - Сначало дороже");
            System.out.println("2 - Сначало дешевле");
            System.out.println("3 - Сортировать по наличию");

            int choice;
            try {
                choice = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: Нужно вводить только цифры!");
                scanner.nextLine();
                continue;
            }

            switch (choice) {
                case 0:
                    return;
                case 1:
                    Category.sortByReversePrice();
                    break;
                case 2:
                    Category.sortByPrice();
                    break;
                case 3:
                    Category.sortByStock();
                    break;
                default:
                    System.out.println("Недопустимое значение");
                    break;
            }
        }
    }

    static void basketMenu(Person p1){
        while (true){
            System.out.println("==========Menu============");
            System.out.println("0 - назад");
            System.out.println("1 - Оплата");
            System.out.println("2 - Добавить в коризну");
            System.out.println("3 - Посмотреть корзину");

            int choice;
            try {
                choice = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: Нужно вводить только цифры!");
                scanner.nextLine();
                continue;
            }

            switch (choice) {
                case 0:
                    return;
                case 1:
                    p1.pay();
                    break;
                case 2:
                    System.out.println("Введите название заказа ");
                    String productName = scanner.nextLine();
                    p1.addBusket(productName);
                    break;
                case 3:
                    p1.getBusket();
                    break;
                default:
                    System.out.println("Недопустимое значение");
                    break;
            }
        }
    }

    static void categoryMenu(){
        while (true) {
            System.out.println("==========Menu============");
            System.out.println("0 - назад");
            System.out.println("1 - Посмотреть каталог");
            System.out.println("2 - Посмотреть категории");
            System.out.println("3 - Посмотреть саб-категории");

            int choice;
            try {
                choice = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: Нужно вводить только цифры!");
                scanner.nextLine();
                continue;
            }

            switch (choice) {
                case 0:
                    return;
                case 1:
                    Catalog.showCatalog();
                    break;
                case 2:
                    Category.showCategory();
                    break;
                case 3:
                    Category.showSubCategory();
                    break;
                default:
                    System.out.println("Недопустимое значение");
                    break;
            }
        }
    }
}

