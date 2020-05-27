package task5;

import java.util.Scanner;

public class num5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите количество слов:");
        int n = scanner.nextInt();
        System.out.print(sameVowelGroup(n));

    }
    public static String sameVowelGroup(int n){
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите массив из слов:");
        String[] array = new String[n];
        for (int i = 0; i<n; i++) {
            array[i] =scanner.nextLine();
        }
        StringBuilder glasn = new StringBuilder("aeiou");
        StringBuilder word = new StringBuilder(array[0] + " ");
        for (char ch : array[0].toCharArray())
            if (glasn.toString().contains(String.valueOf(ch)))
                glasn.deleteCharAt(glasn.indexOf(String.valueOf(ch)));
        for (int i = 1; i < array.length; i++) {
            boolean dq = true;
            for (char ch : glasn.toString().toCharArray())
                if (array[i].contains(String.valueOf(ch))) {
                    dq = false;
                    break;
                }
            word.append(dq ? (array[i]) + " " : "");
        }
        return word.toString();
    }
}
