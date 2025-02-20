package theoriy;

import java.util.Scanner;

public class vvodvivods {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Ввод имени
        System.out.print("Введите Ваше имя: ");
        String name = scan.nextLine();

        // Ввод возраста с проверкой на корректность
        System.out.print("Сколько Вам лет? ");
        int age = 0;
        while (true) {
            if (scan.hasNextInt()) {
                age = scan.nextInt();
                break;
            } else {
                System.out.println("Неверные данные! Введите целое число.");
                scan.next(); // Пропускаем неверный ввод
            }
        }

        // Вывод информации с форматированием
        System.out.printf("Привет, %s! Вам %d лет.\n", name, age);

        // Форматированный вывод с числовыми значениями
        int i = 5;
        int k = 10;
        double x = 3.14159;
        System.out.printf("i=%-5d k=%5d\n", i, k);
        System.out.printf("x=%8.2f\n", x);
    }
}
