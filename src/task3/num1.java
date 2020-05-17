package task3;

import java.util.Scanner;

public class num1 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("a:");
        int a = scanner.nextInt();
        System.out.println("b:");
        int b = scanner.nextInt();
        System.out.println("c:");
        int c = scanner.nextInt();
        int D=b*b-4*a*c;  //находим дискриминант
        if (D==0)
            System.out.println("1 решение");
        if (D>0)
            System.out.println("2 решения");
        if (D<0)
            System.out.println("нет решений");
    }
}
