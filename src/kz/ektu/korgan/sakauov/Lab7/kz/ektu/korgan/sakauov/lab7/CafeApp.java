package kz.ektu.korgan.sakauov.lab7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CafeApp {
    public static void main(String[] args) {
    List<Drink> drinks = new ArrayList<>();
    drinks.add(new Coffee());
    drinks.add(new Tea());
    drinks.add(new Latte());

        List<String> orders = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        double discount;
        while (true) {
            System.out.print("Введите размер скидки (0-100): ");
            String raw = input.nextLine();
            try {
                discount = Double.parseDouble(raw.trim());
                if (discount < 0 || discount > 100) throw new IllegalArgumentException("некорректная скидка");
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Неверный ввод скидки");
            }
        }
        while (true) {
            System.out.println("\nМеню:");
            for (int i = 0; i < drinks.size(); i++) {
                System.out.println((i + 1) + ") " + drinks.get(i));
            }
            System.out.println("4) История");
            System.out.println("0) Выход");
            System.out.print("Ваш выбор: ");
            String pickRaw = input.nextLine();
            int pick;
            try {
                pick = Integer.parseInt(pickRaw.trim());
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод пункта меню");
                continue;
            }
            if (pick == 0) {
                System.out.println("Выход");
                break;
            }
            if (pick == 4) {
                if (orders.isEmpty()) {
                    System.out.println("История пуста");
                } else {
                    System.out.println("История заказов:");
                    for (int i = 0; i < orders.size(); i++) {
                        System.out.println((i + 1) + ") " + orders.get(i));
                    }
                }
                continue;
            }
            try {
                if (pick < 1 || pick > drinks.size()) throw new IllegalArgumentException("нет такого напитка");
                Drink d = drinks.get(pick - 1);
                double cost = d.calculatePrice(discount);
                String entry = d.toString() + " = " + String.format("%.2f", cost) + " при скидке " + (int) discount + "%";
                orders.add(entry);
                System.out.println("Добавлено: " + entry);
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка выбора напитка");
            }
        }
        input.close();
    }
}