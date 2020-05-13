package task1;

import java.util.Scanner;

public class num4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("prob:");
        double prob = scanner.nextDouble();  //вводим prob
        System.out.println("prize:");
        double prize = scanner.nextDouble();  //вводим prize
        System.out.println("pay:");
        double pay = scanner.nextDouble();  //вводи pay
        System.out.println(ppp(prob,prize,pay));  //выводим ответ
    }
    public static String ppp(double prob, double prize, double pay){
        if (prob*prize>pay)  //проверяем условие
            return ("true");
        else
            return ("false");

    }
}
