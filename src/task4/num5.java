package task4;

import java.util.Scanner;

public class num5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите вес:");
        double weight = scanner.nextDouble();
        System.out.println("введите единицу измерения веса:");
        String w = scanner.next();
        System.out.println("введите рост:");
        double height = scanner.nextDouble();
        System.out.println("введите единицу измерения роста:");
        String h = scanner.next();
        System.out.println(BMI(weight,w,height,h));

        }
    public static String BMI (double weight,  String w, double height, String h){
        if (w.equals("pounds")) //если вес в фунтах, то переводим его в кг
            weight=weight*0.454;
        if (h.equals("inches")) //если рост в дюймах, то переводим его в метры
            height=height*0.0254;
        double bmi=weight/(height*height); //считаем имт
        if (bmi<18.5) {
            return (String.format("%.1f",bmi)+" Недостаточный вес");
        }
        if (bmi>=18.5 && bmi<=24.9) {
            return (String.format("%.1f",bmi)+ " Нормальный вес");
        }
        if (bmi>24.9){
           return (String.format("%.1f",bmi) + " Избыточный вес");
    }
        return null;
   }

}
