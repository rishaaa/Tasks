package task6;

import java.util.Scanner;

public class num8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число:");
        int a = scanner.nextInt();
        System.out.print(convertToRoman(a));
    }
    public static String convertToRoman(int a){
        if  (a<1 || a > 3999)
            return "Invalid number";
        StringBuilder s = new StringBuilder();
        while (a >= 1000) {
            s.append("M");
            a -= 1000;
        }
        while (a >= 900) {
            s.append("CM");
            a -= 900;
        }
        while (a >= 500) {
            s.append("D");
            a -= 500;
        }
        while (a >= 400) {
            s.append("CD");
            a -= 400;
        }
        while (a >= 100) {
            s.append("C");
            a -= 100;
        }
        while (a >= 90) {
            s.append("XC");
            a -= 90;
        }
        while (a >= 50) {
            s.append("L");
            a -= 50;
        }
        while (a >= 40) {
            s.append("XL");
            a -= 40;
        }
        while (a >= 10) {
            s.append("X");
            a -= 10;
        }
        while (a >= 9) {
            s.append("IX");
            a -= 9;
        }
        while (a >= 5) {
            s.append("V");
            a -= 5;
        }
        while (a >= 4) {
            s.append("IV");
            a -= 4;
        }
        while (a >= 1) {
            s.append("I");
            a -= 1;
        }
        return s.toString();
    }
}
