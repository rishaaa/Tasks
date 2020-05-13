package task1;

import java.util.Scanner;

public class num5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("N:");
        int N = scanner.nextInt();  //ввод N
        System.out.println("a:");
        int a = scanner.nextInt();  //ввод а
        System.out.println("b:");
        int b = scanner.nextInt();  //вод b
        System.out.println(operation(N,a,b)); //вывод ответа
    }
    public static String operation (int N, int a, int b){
        if (a + b == N)         //проверяем все условия и возвращаем действие
            return ("added");
        else if (a - b == N)
            return ("subtracted");
        else if (a / b == N)
            return ("divided");
        else if (a * b == N)
            return ("multiplied");
        else
            return ("none");
    }
}
