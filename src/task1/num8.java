package task1;

import java.util.Scanner;

public class num8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сторону a");
        int a = scanner.nextInt();
        System.out.println("Введите сторону b");
        int b = scanner.nextInt();
        System.out.println(MaxNextEdge(a,b));
    }
    public static int MaxNextEdge (int a,int b){
        int c = a+b-1;  //находим максиамльное значение третьей стороны
        return c;
    }
}
