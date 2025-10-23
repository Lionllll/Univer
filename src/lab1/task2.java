package lab1;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        int i = 0;
        while (i < n) {
            System.out.print("Введите элемент " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            i++;
        }

        int sum = 0, max = arr[0], min = arr[0];
        i = 0;
        do {
            sum += arr[i];
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
            i++;
        } while (i < n);

        System.out.println("Сумма элементов: " + sum);
        System.out.println("Максимум: " + max);
        System.out.println("Минимум: " + min);
    }
}
