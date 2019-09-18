import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите число");

        Scanner scanner = new Scanner(System.in);


        int i = scanner.nextInt();

        System.out.println("Введите число");

        int m = scanner.nextInt();

        int x = i + m;


        System.out.println("Сумма:" + x);

        scanner.close();

    }
}
