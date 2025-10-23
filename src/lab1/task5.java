package lab1;

import java.util.Scanner;

public class task5 {

    // Метод класса, вычисляющий факториал числа
    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число для вычисления факториала: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Факториал определён только для неотрицательных чисел!");
        } else {
            long fact = factorial(number);
            System.out.println("Факториал числа " + number + " = " + fact);
        }
    }
}
