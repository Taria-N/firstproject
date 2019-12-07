import java.sql.SQLOutput;
import java.util.Scanner;

public class Task__3 {
    public static <and> void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1 для поиска самого длинного слова в массиве или число 2 для старта калькулятора");
        int comand = scanner.nextInt();
        if (comand == 1) {
            String[] str = new String[3];
            System.out.println("Введите слово");

            str[0] = scanner.next();
            int q = str[0].length();
            System.out.println("Длина этого слова " + q);

            System.out.println();
            System.out.println("Введите слово");

            str[1] = scanner.next();
            int w = str[1].length();
            System.out.println("Длина этого слова " + w);

            System.out.println();
            System.out.println("Введите слово");

            str[2] = scanner.next();
            int e = str[2].length();
            System.out.println("Длина этого слова " + e);

            int longest = 0;
            for (String word : str) {
                if (word.length() > longest)
                    longest = word.length();
            }
            System.out.println("В самом длинном слове " + longest + " букв(ы)");
        } else if (comand == 2) {
            System.out.println("Введите число");


            int i = scanner.nextInt();

            System.out.println("Введите знак");

            String s = scanner.next();

            System.out.println("Введите число");

            int m = scanner.nextInt();

            scanner.close();

            int x = i + m;
            int y = i - m;
            int q = i * m;
            int w = i / m;


            if (s.equals("+")) {
                System.out.println("Результат: " + x);
            } else if (s.equals("-")) {
                System.out.println("Результат: " + y);
            } else if (s.equals("*")) {
                System.out.println("Результат: " + q);
            } else if (s.equals("/")) {
                System.out.println("Результат: " + w);
            } else {
                System.out.println("Результат неизвестен");
            }


        } else {

            System.out.println("Необходимо ввести 1 или 2");
        }



    }
}
