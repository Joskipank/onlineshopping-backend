package com.onlineshopping.ui;

import com.onlineshopping.model.Person;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.onlineshopping.service.Command;

public class GeneralMenu {
    private final HashMap<Integer, Command> generalMenu= new HashMap<>();
    private final Scanner scanner = new Scanner(System.in);

    public GeneralMenu(Person p1) {
        generalMenu.put(1, () -> UserMenu.personBankMenu(p1));
        generalMenu.put(2, () -> UserMenu.categoryMenu());
        generalMenu.put(3, () -> UserMenu.basketMenu(p1));
        generalMenu.put(4, () -> UserMenu.filterMenu());
    }

    public void startMenu(){
        while (true) {
            System.out.println("==========Menu============");
            System.out.println("0 - выход");
            System.out.println("1 - Банк");
            System.out.println("2 - Каталог");
            System.out.println("3 - Корзина");

            System.out.println("4 - Фильтрация");

            int choice;
            try {
                choice = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: Нужно вводить только цифры!");
                scanner.nextLine();
                continue;
            }

            if (choice == 0) {
                System.out.println("выход");
                break;
            }

            Command command = generalMenu.get(choice);


            if (command != null) {
                command.execute();
            } else {
                System.out.println("Недопустимое значение");
            }
        }
    }
}
