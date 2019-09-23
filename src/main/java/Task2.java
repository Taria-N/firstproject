/**
 * @author Natalia Tkacheva
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите число");

        Scanner scanner = new Scanner(System.in);


        double i = scanner.nextDouble();

        System.out.println("Введите число");

        double m = scanner.nextDouble();

        double x = i + m;

    System.out.printf("Сумма: %.4f", x);

        scanner.close();

    }
}
