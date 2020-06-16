package interfaces;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Calc {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите первое число: ");
        int a = Integer.parseInt(read.readLine());
        System.out.print("Введите знак математической операции (+, -, * или /): ");
        String s = read.readLine();
        System.out.print("Введите второе число: " );
        int b = Integer.parseInt(read.readLine());

        if (s.equals("+")) {
            System.out.print("Сумма чисел: " + (a+b));
        } else if (s.equals("-")) {
            System.out.print("Разность чисел " + (a-b));
        } else if (s.equals("*")) {
            System.out.print("Произведение чисел " + (a*b));
        } else if (s.equals("/")) {
            System.out.print("Частное чисел: " + (a/b));
        } else {
            System.out.println("Попробуйте ещё раз");
        }

    }
}
