package task6;

import java.util.Scanner;
import java.util.regex.Pattern;


public class num3 {
    private static boolean validColor(String str){
        if((Pattern.matches("rgb.[0-255].[0-255].[0-255].",str)==true))return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        System.out.println(validColor(str));
    }
}
