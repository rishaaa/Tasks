package task3;

import java.util.Scanner;

public class num7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n:");
        int n = scanner.nextInt();
        System.out.println(isKaprekar(n));
    }
    public static boolean isKaprekar(int n) {
        int k = 0;
        int left =0; int right=0;
        int sum=0;
        int a = n * n;//находим квадрат числа n
        while (a!=0) { //считаем количество цифр в получившимся числе
            k += 1;
            a = a / 10;
        }
        a = n * n;
        if (k%2==0) { //если количество цифр в числе четное, то делим его пополам
            left = (int) (a /Math.pow(10,k/2));
            right = (int) (a % Math.pow(10,k/2));
            sum=left+right;
        }
        else { //если нечетное, то левую часть делаем меньше
            left = (int) (a / Math.pow(10,(k+1)/2));
            right = (int) (a % Math.pow(10,(k+1)/2));
            sum=left+right;
        }
        if (sum==n) //провряем равна ли сумма левой и правой части квадрата исходному числу
            return true;
        else
            return false;
    }
}
