package task1;

import java.util.Scanner;

public class num2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите основание a:");
        int a = scanner.nextInt(); //Вводим основание
        System.out.println("Введите высоту h:");
        int h = scanner.nextInt();  //Вводим высоту
        System.out.println(triArea(a,h));  //Выводим площадь из функции
    }
    public static double triArea(int a, int h){
        double s = 0.5*a*h; //Считаем площадь
        return s;  //Возвращаем площадь

    }
}
