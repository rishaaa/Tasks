package task2;

import java.util.Scanner;

public class num2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n:");
        int n = scanner.nextInt();
        System.out.println(differenceMaxMin(n));  //выводим результат
    }

    public static int differenceMaxMin(int n) {
        int min = 100000;  //присваиваем min и max значения с котороми в дальнейшем будем сравнивать
        int max = -100000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите элементы массива:");
        int[] array = new int[n];  //создаем массив
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();  //вводим элементы массива
            if (array[i] < min)  //проверяем условие: элемент массива меньше min
                min = array[i];  //если да, то этот элемент становится min
            if (array[i] > max)  //проверяем условие: элемент массива больше max
                max = array[i];  //если да, то этот элемент становится max
        }
        int diff= max-min;  //находим разность
        return diff;
    }
}
