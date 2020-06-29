package task6;

import java.util.Scanner;

public class num9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите формулу:");
        String formula = scanner.nextLine();
        System.out.println(formula(formula));
    }
    static boolean formula (String formula){
        formula+=" = " + formula;
        String [] arr = formula.split(" "); //разделяем строку на символы по пробедам
        int n=0,n1=0,i=0;
        while(i<7) {
            if (arr[i+1].equals("+")) n1 = Integer.parseInt(arr[i]) + Integer.parseInt(arr[i+2]); //если i+1 символ +, то скадаваем предыдущий и следующий
            else if (arr[i+1].equals("-")) n1 = Integer.parseInt(arr[i]) - Integer.parseInt(arr[i+2]);//если i+1 символ -, то вычитаем из предыдущего и следующий
            else if (arr[i+1].equals("*")) n1 = Integer.parseInt(arr[i]) * Integer.parseInt(arr[i+2]);//если i+1 символ *, то усножаем предыдущий и следующий
            else if (arr[i+1].equals("/") & !arr[i+2].equals("0")) n1 = Integer.parseInt(arr[i]) / Integer.parseInt(arr[i+2]);//если i+1 символ /, то делим предыдущий на следующий
            n = n1;
            i+=6;
        }
        return Integer.parseInt(arr[4])==n & Integer.parseInt(arr[4])==n1;
    }
}
