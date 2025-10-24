package ektu.korgan.sakauov.sro7;

import java.util.List;
import java.util.Scanner;

public class StudentsRunner {
    public static void main(String[] args) {
        SroStudentService service = new SroStudentService();
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("1) Добавить  2) Показать  3) Найти по id  4) Удалить по id  0) Выход");
            String cmd = sc.nextLine();
            switch (cmd) {
                case "1":
                    try {
                        System.out.print("id: ");
                        int id = Integer.parseInt(sc.nextLine());
                        System.out.print("name: ");
                        String name = sc.nextLine();
                        System.out.print("age: ");
                        int age = Integer.parseInt(sc.nextLine());
                        System.out.print("grade: ");
                        double grade = Double.parseDouble(sc.nextLine());
                        service.add(new SroStudent(id, name, age, grade));
                        System.out.println("OK");
                    } catch (Exception e) {
                        System.out.println("Ошибка ввода: " + e.getMessage());
                    }
                    break;
                case "2":
                    List<SroStudent> all = service.list();
                    for (SroStudent s : all) System.out.println(s);
                    break;
                case "3":
                    try {
                        System.out.print("id: ");
                        int id = Integer.parseInt(sc.nextLine());
                        System.out.println(service.getById(id));
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "4":
                    try {
                        System.out.print("id: ");
                        int id = Integer.parseInt(sc.nextLine());
                        System.out.println(service.removeById(id) ? "Удалено" : "Нет такого id");
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;
                case "0":
                    running = false;
                    break;
                default:
                    System.out.println("Команда не распознана");
            }
        }
    }
}
