package task5;

import java.util.Scanner;

public class num10 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число:");
        int n= scanner.nextInt();
        System.out.print(hexLattice(n));
    }
    public static String hexLattice(int n){
        StringBuilder str= new StringBuilder();
        int k=1; int a=1;
        while (k<n) {
            k += 6 * a;
            a++;
        }
        if (k!=n)
            System.out.println("Invalid");
        else {
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a - i; j++)
                    str.append(" ");
                for (int j = 0; j < a + i; j++)
                    str.append("o ");
                str.append("\n");
            }
            for (int i = a - 1; i > 0; i--) {
                for (int j = 0; j <= a - i; j++)
                    str.append(" ");
                for (int j = 1; j < a + i; j++)
                    str.append("o ");
                str.append("\n");
            }
        }
        return str.toString();
    }
}

