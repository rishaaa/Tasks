package task2;

import java.util.Scanner;

public class num3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n:");
        int n = scanner.nextInt();
        System.out.println(isAvgWhole(n));  //выводим результат
    }

    public static boolean isAvgWhole(int n) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите элементы массива:");
        int[] array = new int[n];  //создаем массив
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();  //ввожим элементы массива
            sum += array[i];  //находим сумму всех элементов
        }
        if (sum % n == 0)  //проверяем что сумма делется на n без остатка
            return true;
        else
            return false;
    }
}
