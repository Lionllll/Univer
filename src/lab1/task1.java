package lab1;

public class task1 {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        int sum = 0;

        for (int num : arr) sum += num;

        double avg = (double) sum / arr.length;
        System.out.println("Сумма элементов: " + sum);
        System.out.println("Среднее значение: " + avg);
    }
}
