package task5;

import java.util.Scanner;

public class num7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число:");
        int a = scanner.nextInt();
        System.out.println(numToEng(a));
    }
    public static String numToEng(int a){
        String str="";
        String[] numbers1 = new String[]{"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] numbers2 = new String[]{"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        if (a==0)
            str+="zero";
        if (a/100!=0)
            str+=numbers1[a/100]+" "+"hundred"+" ";
        if ((a%100>=20)||(a%100<10)) {
            if ((a%100)/10!=0)
                str += numbers2[((a % 100) / 10) - 2] + " ";
            str += numbers1[a % 10];
        }
        else
        if ((a%100)/10!=0)
            str+=numbers1[a%100]+" ";
        return str;

    }
}
