package task2;

import java.util.Scanner;

public class num10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("step:");
        int step = scanner.nextInt();
        System.out.println("количество полей:" + shag(step));  //выводим результат
    }
    public static int shag(int step){
        int a=0;
        for (int i=1; i<=step; i+=2) {  //при нечетном номере шага прибавляется 3 поля
            a = a + 3;
        }
        for (int j=2; j<=step; j+=2) {  //при четном номере шага вычетается 1 поле
            a = a - 1;
        }
        return a;  //возвращаем количество полей
    }
}
